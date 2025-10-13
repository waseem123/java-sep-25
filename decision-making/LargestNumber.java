import java.util.Scanner;

class LargestNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("ENTER FIRST NUMBER - ");
        int x = s.nextInt();

        System.out.print("ENTER SECOND NUMBER - ");
        int y = s.nextInt();

        System.out.print("ENTER THIRD NUMBER - ");
        int z = s.nextInt();

        if (x > y && x > z) {
            System.out.printf("x IS LARGEST");
        } else if (y > x && y > z) {
            System.out.printf("y IS LARGEST");
        } else if (z > x && z > y) {
            System.out.printf("z %d IS LARGEST", z);
        } else {
            System.out.println("NUMBERS ARE EQUAL");
        }
    }
}
