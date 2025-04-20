import java.util.Scanner;

class UsingBitwiseEvenOdd {

    public static void main(String[] args) {

        System.out.println("Program to check Odd Even using Bitwise\n");

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter your number: ");
        int num = input.nextInt();

        if ((num & 1) == 1) System.out.println("Number is odd");
        else System.out.println("Number is even");

    }
}
