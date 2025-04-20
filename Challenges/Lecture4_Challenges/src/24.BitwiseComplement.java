import java.util.Scanner;

class BitwiseComplement {

    public static void main(String[] args) {

        System.out.println("Welcome to Bitwise Complement program");

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        int first = input.nextInt();

        int result = ~first;
        System.out.println("Result is: " + result);

        //Note : Here the Bitwise complement perform operation on all 8 bits and the 8th bit become 1 which means
        //it is the negative number and then all 0's bit convert to 1
    }
}
