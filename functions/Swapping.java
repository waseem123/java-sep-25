import java.util.Scanner;

class Swapping {
    public static void swap() {
        int a, b;
        Scanner s = new Scanner(System.in);
        System.out.print("ENTER FIRST NUMBER - ");
        a = s.nextInt();
        System.out.print("ENTER SECOND NUMBER - ");
        b = s.nextInt();
        System.out.println("ORIGINAL VALUE OF a -" + a);
        System.out.println("ORIGINAL VALUE OF b -" + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("NEW VALUE OF a -" + a);
        System.out.println("NEW VALUE OF b -" + b);
    }

    public static void main(String[] args) {
        // swap(100,200);
        swap();
    }
}