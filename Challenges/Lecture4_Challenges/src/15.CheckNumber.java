import java.util.Scanner;

class CheckNumber {

    public static void main(String[] args) {

        System.out.println("Enter the number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(num > 0) System.out.println("Number is positive");
        else if(num < 0) System.out.println("Number is negative");
        else System.out.println("Number is Zero");

    }
}
