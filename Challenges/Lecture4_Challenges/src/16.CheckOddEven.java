import java.util.Scanner;

class CheckOddEven {

    public static void main(String[] args) {

        System.out.println("Please enter the number");
        Scanner input =new Scanner(System.in);

        int num = input.nextInt();

        if( num % 2 == 0 ) System.out.println("Number "+ num +" is even");
        else System.out.println("Number "+ num +" is odd");
    }
}
