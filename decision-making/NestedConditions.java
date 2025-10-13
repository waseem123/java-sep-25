import java.util.Scanner;

class NestedConditions {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("ENTER YOUR AGE - ");
        int age = s.nextInt();

        if (age >= 18) {
            System.out.println("DO YOU HAVE VOTER ID? (Y:YES | N:NO) - ");
            String voterId = s.next();
            if (voterId.equalsIgnoreCase("Y")) {
                System.out.println("CONGRATULATIONS! YOU CAN VOTE.");
            } else {
                System.out.println("SORRY! YOU CAN NOT VOTE.");
            }
        } else {
            System.out.println("YOU ARE NOT ELIGIBLE FOR VOTING.");
        }
    }

}