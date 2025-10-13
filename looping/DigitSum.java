class DigitSum {
    public static void main(String[] args) {
        int num = 10;
        int temp = num;
        int sum = 0;

        while(temp!=0){
            int r = temp % 10; // 1
            sum = sum + r;  //1
            temp = temp / 10;  //0
        }

        System.out.println(sum);
    }
}
