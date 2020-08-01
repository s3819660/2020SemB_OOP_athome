import Model.*;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class MemberList {
    private static ArrayList<Member> memberList = new ArrayList<>();
    protected static int total = 0;

    public MemberList() {
    }

    public static int getTotal() {
        return total;
    }

    public static void setTotal(int total) {
        MemberList.total = total;
    }

    public static void registerMember() {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = new String[6];
        String[] prompts = {"name", "phone", "email", "address", "expire date in the form of dd/MM/yyyy", "status"};

        for (int i = 0; i < 6; i++) {
            System.out.println("Enter " + prompts[i]);
            inputs[i] = scanner.nextLine();
        }

        Date expireDate = null;
        try {
            expireDate = new SimpleDateFormat("dd/MM/yyyy").parse(inputs[4]);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Member newMember = new Member(inputs[0], inputs[1], inputs[2], inputs[3], expireDate, inputs[5]);
        total = total + 1; // when a member is registered, the total is added by 1 unit
        newMember.setID(total);
        memberList.add(newMember);
    }

    public void borrow(Member member, Book book) {

    }

    public void borrow(Member member, Journal journal) {

    }

    public void borrow(Member member, DVD dvd) {

    }

    public static void searchMember() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter keyword(s): ");
        String searchInput = scanner.nextLine();

        // Compare date keyword
        // check if the input matches the date format
        Date date = null;
        if (searchInput.matches("^\\d{2}\\/\\d{2}\\/\\d{4}$")) {
            try {
                // convert String date to Date object
                date = new SimpleDateFormat("dd/MM/yyyy").parse(searchInput);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }

        // check if the input is a late fee keyword
//        if ()

        // If the keywords are empty, display all items
        if (searchInput.isEmpty()) {
            printMemberList(memberList);
        } else {
            for (Member member : memberList) {
                // make sure the keywords can be found regardless of their case
                if (member.getName().toLowerCase().contains(searchInput.toLowerCase())
                        || member.getPhone().contains(searchInput)
                        || member.getEmail().toLowerCase().contains(searchInput.toLowerCase())
                        || member.getAddress().toLowerCase().contains(searchInput.toLowerCase())
                        || member.getExpireDate().compareTo(date) == 0
                        || member.getStatus().toLowerCase().contains(searchInput.toLowerCase())
                ) {
                    System.out.println(member.toString());
                }
            }
        }
    }

    public static void printMemberList(ArrayList<Member> list) {
        for (Member member : list) {
            System.out.println(member);
        }
    }

    public static void loadMember() {
        try {
            FileInputStream fis = new FileInputStream("members.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            memberList = (ArrayList) ois.readObject();

            ois.close();
            fis.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        printMemberList(memberList); // is equivalent to below
//        for (Member member : memberList) {
//            System.out.println(member);
//        }
    }

    public static void saveMember() {
        try {
            FileOutputStream fos = new FileOutputStream("members.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(memberList);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
