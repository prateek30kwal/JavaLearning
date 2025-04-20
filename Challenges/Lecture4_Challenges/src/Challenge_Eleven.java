import java.util.Scanner;

public class Challenge_Eleven {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the breadth and height of triangle:");
        int br = input.nextInt();
        int he = input.nextInt();

        System.out.println("Area of Triangle:");
        System.out.println();
        System.out.println((br*he)/2);

    }
}
