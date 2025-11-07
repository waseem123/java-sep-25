import java.util.Scanner;

class PrimeNumber {
    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER A NUMBER - ");
        int num = s.nextInt();
        if (isPrime(num) == true) {

            System.out.println(num + " IS PRIME");
        } else {

            System.out.println(num+" IS NOT PRIME");
        }
    }
}
