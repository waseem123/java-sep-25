class PrintStatements {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = a + b;

        String name = "Waseem";

        System.out.println("ADDITION OF " + a + " AND " + b + " IS " + c);
        System.out.printf("ADDITION OF %d and %d IS %d\n", a, b, c);

        System.out.println("MY NAME IS " + name);
        System.out.print("I am "+name+"\n");
        System.out.printf("MY NAME IS %s", name);
    }
}
