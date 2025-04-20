import java.util.Scanner;

class BitwiseRightShift {

    public static void main(String[] args) {

        System.out.println("Welcome to Bitwise RightShift program");

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        int first = input.nextInt();

        int result = first >>1;
        System.out.println("Result is: "+result);

        //Note : This is the Integer division by 2
    }
}
