import java.util.Scanner;

class Area {

    public static double areaOfCircle(int r) {
        return 3.14 * r * r;
    }

    public static int areaOfRectangle(int l, int b) {
        return l * b;
    }

    public static int areaOfSquare(int s) {
        return s * s;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int c = 0;
        do{

            System.out.println("1. Area of Circle");
            System.out.println("2. Area of rectangle");
            System.out.println("3. Area of Square");
            int choice = s.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("ENTER RADIUS OF CIRCLE - ");
                    int radius = s.nextInt();
                    System.out.println("AREA OF CIRCLE IS - " + areaOfCircle(radius));
                    break;
                case 2:
                    System.out.println("ENTER LENGTH OF RECTANGLE  - ");
                    int length = s.nextInt();
                    System.out.println("ENTER BREADTH OF RECTANGLE - ");
                    int breadth = s.nextInt();
                    System.out.println("AREA OF RECTANGLE - " + areaOfRectangle(length, breadth));
                    break;
                case 3:
                    System.out.println("ENTER THE SIDE OF SQUARE - ");
                    int side = s.nextInt();
                    System.out.println("AREA OF SQUARE IS - " + areaOfSquare(side));
                    break;
                default:
                    System.out.println("WRONG INPUT! PLEASE SELECT THE OPTION BETWEEN 1 TO 3.");
                    break;
            }
            System.out.println("DO YOU WANT TO CONTINUE? (1. YES / 2. NO)-");
            c = s.nextInt();
        }while(c==1);
    }
}
