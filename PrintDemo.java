class PrintDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int c = a + b;

        String city = "solapur";

        System.out.println("Addition of " + a +" and "+ b + " IS " + c);
        System.out.printf("ADDITION OF %d and %d IS %d\n",b,a,c);

        System.out.println("I live in "+city);
        System.out.printf("I live in %s\n",city);
    }
}
