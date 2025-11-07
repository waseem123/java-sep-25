class Swapping {
    public static void main(String[] args) {
        int a = 100;
        int b = 400;
        System.out.printf("ORIGINAL A AND B -> %d and %d\n",a,b);
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.printf("SWAPPED  A AND B -> %d and %d\n",a,b);
    }
}
