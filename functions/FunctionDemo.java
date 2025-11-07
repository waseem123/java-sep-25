class FunctionDemo {
    public static void add() {
        int a, b, c;
        a = 100;
        b = 700;
        c = a + b;
        System.out.println(c);
    }

    public static void sub(int x, int y) {
        int z = x - y;
        System.out.println(z);
    }

    public static int multiply() {
        int x = 30;
        int y = 5;
        int z = x * y;
        return z;
    }

    public static int divide(int n, int d) {
        return n / d;
    }

    public static void main(String[] args) {
        add();
        sub(150, 55);
        int result = multiply();
        System.out.println(result);

        int x = divide(30, 5);
        System.out.println(x);

        System.out.println(divide(100, 10));

        System.out.println(divide(result, x));
        System.out.println(divide(10,5));
    }
}