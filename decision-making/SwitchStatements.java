import java.util.Scanner;

class SwitchStatements {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("1. Biryani - INR. 150");
        System.out.println("2. Shawarma - INR. 120");
        System.out.println("3. Pizza - INR. 199");
        System.out.println("4. Tea - INR. 15");
        System.out.print("ENTER YOUR CHOICE  - ");
        int choice = s.nextInt();
        int qty = 0;
        int bill = 0;
        switch (choice) {
            case 1:
                System.out.print("ENTER QUANTITY OF BIRYANI - ");
                qty = s.nextInt();
                bill = qty * 150;
                System.out.printf("YOUR BILL FOR %d BIRYANI IS INR. %d.", qty, bill);
                break;

            case 2:
                System.out.print("ENTER QUANTITY OF SHAWARMA - ");
                qty = s.nextInt();
                bill = qty * 120;
                System.out.printf("YOUR BILL FOR %d SHAWARMA IS INR. %d.", qty, bill);
                break;

            case 3:
                System.out.print("ENTER QUANTITY OF PIZZA - ");
                qty = s.nextInt();
                bill = qty * 199;
                System.out.printf("YOUR BILL FOR %d PIZZA IS INR. %d.", qty, bill);
                break;

            case 4:
                System.out.print("ENTER QUANTITY OF TEA - ");
                qty = s.nextInt();
                bill = qty * 15;
                System.out.printf("YOUR BILL FOR %d TEA IS INR. %d.", qty, bill);
                break;
            default:
            System.out.println("WRONG OPTION SELECTED! PLEASE SELECT MENU BETWEEN 1 TO 4.");
                break;
        }

    }
}
