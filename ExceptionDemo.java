import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        int nr, dr;
        int result;
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER NUMERATOR - ");
        nr = s.nextInt();
        System.out.println("ENTER DENOMINATOR - ");
        dr = s.nextInt();
        result = nr / dr;
        System.out.println("DIVISION IS - " + result);
    }
}
