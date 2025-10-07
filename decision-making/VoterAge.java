import java.util.Scanner;

class VoterAge {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("ENTER YOUR AGE - ");
        int age = s.nextInt();

        if(age>=18){
            System.out.println("YOU ARE ELIGIBLE FOR VOTING.");
        }else{
            System.out.println("YOU ARE NOT ELIGIBLE.");
        }
    }
}
