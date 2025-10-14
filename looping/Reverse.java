class Reverse {
    public static void main(String[] args) {
        int num = 161;
        int temp = num;
        int rev = 0;
        while (num != 0) {
            int r = num % 10;  //6
            rev = rev * 10 + r; // 2 * 10 + 6 = 26
            num = num / 10;  //0
        }
        System.out.println(rev);  //26

        if(temp==rev){
            System.out.println(temp+" IS PALINDROME NUMBER.");
        }else{
            System.out.println(temp+" IS NOT A PALINDROME NUMBER.");
        }
    }
}
