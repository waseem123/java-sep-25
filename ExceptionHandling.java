import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        int nr, dr;
        int result = 0;
        int[] arr = {10, 20, 30, 40};
        Scanner s = new Scanner(System.in);
        try {
            System.out.println("ENTER NUMERATOR - ");
            nr = s.nextInt();
            System.out.println("ENTER NUMERATOR - ");
            dr = s.nextInt();
            result = nr / dr;
            System.out.println(arr[50]);
        } catch (InputMismatchException e) {
            System.out.println("INVALID INPUT! PLEASE ENTER A VALID NUMBER");
        } catch (ArithmeticException e) {
            System.out.println("YOU CAN NOT DIVIDE ANY NUMBER BY ZERO");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ARRAY ERROR");
        } catch (Exception e) {
            System.out.println("EXCEPTION");
        }finally{
            System.out.println("DIVISION IS - " + result);
        }

    }
}
