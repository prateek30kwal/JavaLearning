import java.util.Scanner;

class BitwiseXOR {

    public static void main(String[] args) {

        System.out.println("Welcome to Bitwise XOR program");

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        int first = input.nextInt();

        System.out.println("Please enter the second number: ");
        int second = input.nextInt();

        int result = first ^ second ;
        System.out.println("Result is: " + result);
    }
}
