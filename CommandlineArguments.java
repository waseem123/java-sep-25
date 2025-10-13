class CommandlineArguments {
    public static void main(String[] args) {
        String name = args[0];
        String city = args[1];
        int x = 25;
        System.out.printf("My name is %s. I live in %s.\n", name, city);

        int a = Integer.parseInt(args[2]);
        int b = Integer.parseInt(args[3]);
        System.out.println(a + x);

    }
}
