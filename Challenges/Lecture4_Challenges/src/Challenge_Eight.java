import java.util.Scanner;

public class Challenge_Eight {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the First number:");
        int a = input.nextInt();

        System.out.println("Enter the second number:");
        int b = input.nextInt();

        System.out.println("ADDITION:"+(a+b));
        System.out.println("SUBTRACTION:"+(a-b));
        System.out.println("MULTIPLICATION:"+(a*b));
        System.out.println("DIVIDE:"+(a/b));
        System.out.println("MODULUS:"+(a%b));

    }
}
