import java.util.Scanner;

class CheckPalindrome {

    public static void main(String[] args) {

        greet();
        System.out.println("Please Enter the Number: ");
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int rev = reverseDigit(a);
        if(rev == a) System.out.println("Number is Palindrome");
        else System.out.println("Number is not a Palindrome");

    }
    public static void greet(){
        System.out.println("Welcome to the Palindrome Program");
    }

    public static int reverseDigit(int no){
        int temp = 0;
        while(no > 0){
            temp = temp + (no % 10);

            no = no / 10;
            if(no > 0) temp = temp * 10;
        }
        //System.out.println("Reverse of Digit: "+temp);
        return temp;
    }


}
