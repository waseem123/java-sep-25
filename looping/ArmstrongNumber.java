class ArmstrongNumber {
    public static void main(String[] args) {

        int n = 88;
        int power = 0;
        int result = 0;
        int temp = n;

        while (temp != 0) {
            power++;
            temp = temp / 10;
        }

        // System.out.println(power);

        temp = n;
        while (temp != 0) {
            int r = temp % 10;
            int x = 1;
            for (int i = 1; i <= power; i++) {
                x = x * r;
            }
            result = result + x;
            temp = temp / 10;
        }
        System.out.println((result == n) ? "ARMSTRONG" : "NOT ARMSTRONG");
    }
}
