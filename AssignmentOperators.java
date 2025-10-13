class AssignmentOperators {
    public static void main(String[] args) {
        int x = 1000;
        int y = x;

        x = 200;

        System.out.println(x);
        System.out.println(y);
        int z = x + y;
        System.out.println(z);

        x += 50; //x = x + 50
        System.out.println(x);

        x -= 10;
        System.out.println(x);

        x *= 10;
        System.out.println(x);

        x /= 2;
        System.out.println(x);

        x %= 3;
        System.out.println(x);
    }
}
