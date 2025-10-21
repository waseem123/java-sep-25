import java.util.Scanner;

class ArrayInput {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = 5;
        int[] arr = new int[n];
        System.out.println("ENTER 5 ELEMENTs - ");

        for (int i = 0; i < arr.length; i++) {
            System.out.println("'ENTER ARRAY ELEMENT - '");
            arr[i] = s.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
