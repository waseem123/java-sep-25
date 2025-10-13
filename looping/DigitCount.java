class DigitCount {
    public static void main(String[] args) {
        int x = 5568; // 5+5+6+8 = 24
        int count = 0;

        while (x != 0) {
            count++;  //1
            x /= 10; // x = x/10 ->both syntaxes work
        }

        System.out.println(count);
    }
}
