import java.util.Scanner;

class UserInput {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER YOUR NAME - ");
        String name = s.nextLine();

        System.out.println("MY NAME IS - " + name);

        System.out.println("ENTER YOUR CITY - ");
        String city = s.nextLine();
        System.out.println("I live in " + city);

        System.out.println("ENTER YOUR PERCENTAGE - ");
        double marks = s.nextDouble();
        System.out.println(marks);
    }
}
