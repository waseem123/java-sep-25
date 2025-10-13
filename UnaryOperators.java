class UnaryOperators {
    public static void main(String[] args) {
        int x = 500;
        System.out.println(x);

        x++; // x = x + 1
        System.out.println(x);

        x--; // x = x - 1
        System.out.println(x);
        System.out.println("_______________");

        //500
        System.out.println(++x); //501
        System.out.println(x++); //501=>502
        
        System.out.println(x);
        System.out.println(x--); // 502 => 501
        System.out.println(--x);
    }
}
