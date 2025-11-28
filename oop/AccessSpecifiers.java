class Pen {
    String brand = "Camlin";
    int price = 25;
    String inkColor = "Black";
    int stock = 150;
} // Class ends here

public class AccessSpecifiers {
    public static void main(String[] args) {
        Pen p1 = new Pen();

        p1.brand = "XO";
        p1.price = 10;
        p1.inkColor = "Blue";
        p1.stock = 240;

        System.out.println(p1.brand);
        System.out.println(p1.price);
        System.out.println(p1.inkColor);
        System.out.println(p1.stock);
    }
}
