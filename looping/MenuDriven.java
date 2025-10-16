import java.util.Scanner;

class MenuDriven {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String c = "";
        int total_bill = 0;
        int total_qty=0;
        do {
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
                    bill = (qty * 150);
                    total_bill = bill + total_bill;
                    System.out.printf("YOUR BILL FOR %d BIRYANI IS INR. %d.\n", qty, bill);
                    break;

                case 2:
                    System.out.print("ENTER QUANTITY OF SHAWARMA - ");
                    qty = s.nextInt();
                    bill = (qty * 120);
                    total_bill = bill + total_bill;
                    System.out.printf("YOUR BILL FOR %d SHAWARMA IS INR. %d.\n", qty, bill);
                    break;

                case 3:
                    System.out.print("ENTER QUANTITY OF PIZZA - ");
                    qty = s.nextInt();
                    bill = (qty * 199);
                    total_bill = bill + total_bill;
                    System.out.printf("YOUR BILL FOR %d PIZZA IS INR. %d.\n", qty, bill);
                    break;

                case 4:
                    System.out.print("ENTER QUANTITY OF TEA - ");
                    qty = s.nextInt();
                    bill = (qty * 15);
                    total_bill = bill + total_bill;
                    System.out.printf("YOUR BILL FOR %d TEA IS INR. %d.\n", qty, bill);
                    break;
                default:
                    System.out.println("WRONG OPTION SELECTED! PLEASE SELECT MENU BETWEEN 1 TO 4.\n");
                    break;
            }
            System.out.print("DO YOU WANT TO ORDER MORE ITEMS?(Y:YES | N:NO) - ");
            c = s.next();
        } while (c.equalsIgnoreCase("Y"));
        System.out.println("YOUR TOTAL BILL IS - " + total_bill);
        System.out.println("THANKS! VISIT AGAIN.");
    }
}
