import java.util.Scanner;

public class QuickLibUI {
    public static void printOption(String opt) {
        switch (opt) {
            case "1":
                System.out.println("1");
                break;
            case "2":
                ItemList.addItem();
                break;
            case "3":
                System.out.println("3");
                break;
            case "4":
                MemberList.searchMember();
                System.out.println("4");
                break;
            case "5":
                MemberList.registerMember();
                System.out.println("5");
                break;
            case "6":
                System.out.println("6");
                break;
            case "7":
                System.out.println("7");
                break;
            case "8":
                System.out.println("8");
                break;
            case "9":
                System.out.println("9");
                QuickLib.save();
                break;
            case "10":
                System.out.println("10");
                QuickLib.save();
                System.exit(0);
            default:
                System.out.println("wrong option");
                break;
        }
    }

    public static void printMenu() {
        Scanner scanner = new Scanner(System.in);
        String opt;

        while (true) {
            System.out.print("Welcome to QuickLib!!!\n" +
                    "********************************\n" +
                    "1. Search items by keywords\n" +
                    "2. Add new item\n" +
                    "3. Update item info\n" +
                    "4. Search members by keywords\n" +
                    "5. Register new member\n" +
                    "6. Update member info\n" +
                    "7. Borrow items\n" +
                    "8. Return items\n" +
                    "9. Save data\n" +
                    "10. Quit\n" +
                    "**************************************\n" +
                    "Enter a function (1-10): ");

            opt = scanner.nextLine();
            printOption(opt);
            System.out.println("Enter to go back to menu");
            scanner.nextLine();
        }
    }

    public static void main(String[] args) {
        QuickLib.start();
        printMenu();
    }
}
