import Model.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ItemList {
    private static ArrayList<Item> itemList = new ArrayList<>();
    private static int total = 0;

    Scanner scanner = new Scanner(System.in);

    public ItemList() {
    }

    public static int getTotal() {
        return total;
    }

    public static void setTotal(int total) {
        ItemList.total = total;
    }

    public ArrayList<Item> search(String keyword) {
        return itemList;
    }

    public static void addItem() {
        System.out.println("Enter item type:");
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        QuickLib quickLib = new QuickLib();

        switch (type.toLowerCase()) {
            case "book":
                itemList.add(quickLib.addBook());
                break;
            case "journal":
                itemList.add(quickLib.addJournal());
                break;
            case "DVD":
                itemList.add(quickLib.addDVD());
                break;
        }
    }

    public void updateItem(Item item) {

    }

    public ArrayList<Item> borrow() {
        return itemList;
    }


    public static void loadItem() {
        try {
            FileInputStream fis = new FileInputStream("items.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            itemList = (ArrayList) ois.readObject();

            ois.close();
            fis.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        for (Item item : itemList) {
            System.out.println(item);
        }
    }

    public static void saveItem() {
        try {
            FileOutputStream fos = new FileOutputStream("items.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(itemList);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
