class Logical {
    public static void main(String[] args) {
        int a = 30;
        int b = 75;
        int c = 71;

        System.out.println(a > b && a > c); // false
        System.out.println(a > b && a < c); // false
        System.out.println(a < b && a > c); // false
        System.out.println(a < b && a < c); // true
        System.out.println("________________");

        System.out.println(a > b || a > c); // false
        System.out.println(a > b || a < c); // true
        System.out.println(a < b || a > c); // true
        System.out.println(a < b || a < c); // true
        System.out.println("________________");

        System.out.println(!(a > b)); // true
        System.out.println(!(a > b && a < c)); // true
        System.out.println(!(a < b) && !(a > c)); // false
        System.out.println(a < b && !(a < c)); // false
        System.out.println("________________");
    }
}