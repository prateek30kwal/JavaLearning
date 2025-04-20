import java.util.Scanner;

class PrintReverseDigit {

    public static void main(String[] args) {
        greet();
        reverseDigit(inputNum());
    }
    public static void greet(){
        System.out.println("Welcome to the Reverse Digit Program");
    }
    public static int inputNum(){
        System.out.print("Please Enter the number: ");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    /*
    public static void reverseDigit(int no){
        while(no > 0){
            System.out.print(no%10);
            no = no/10;
        }
    }

     */

    //Downward is faculty logic and it is the best aas it is reusable in Palindrome Program.
    public static void reverseDigit(int no){
        int temp = 0;
        while(no > 0){
            temp = temp + (no % 10);

            no = no / 10;
            if(no > 0) temp = temp * 10;
        }
        System.out.println("Reverse of Digit: "+temp);
    }
}
