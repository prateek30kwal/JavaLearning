import java.util.Scanner;

class BitwiseAnd {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing bitwiseAND operator\n");
        System.out.println("Enter the First number: ");

        int first = input.nextInt();
        System.out.println("Enter the second number: ");

        int second = input.nextInt();

        int result = first & second ;

        System.out.println("Result is:  "+ result);

    }

}
