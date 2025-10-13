import java.util.Scanner;

class UserInput {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);

        System.out.println("ENTER A NUMBER - ");
        int x = p.nextInt();
        System.out.printf("VALUE IS %d", x);

        System.out.println("ENTER YOUR NAME");
        String name = p.next();
        System.out.printf("MY NAME IS %s", name);

        System.out.println("ENTER A DECIMAL VALUE - ");
        double d = p.nextDouble();
        System.out.printf("VALUE IS %f", d);
    }
}
