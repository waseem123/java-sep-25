class Recursion {
    public static void count(int n) {
        if (n > 0) {
            System.out.println("Hello World " + n);
            count(n - 1);
        }
    }

    public static void main(String[] args) {
        count(3);
    }
}
