import java.util.Scanner;

public class Challenge_Ten {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the 4 sides of the rectangle: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();

        System.out.println("Perimeter of the Rectangle----->");
        System.out.println();
        System.out.println(a+b+c+d);
    }
}
