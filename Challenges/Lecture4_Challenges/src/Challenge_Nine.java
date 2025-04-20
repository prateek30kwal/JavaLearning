import java.util.Scanner;

public class Challenge_Nine {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first floating number:");
        double a = input.nextDouble();

        System.out.println("Enter second floating number:");
        double b = input.nextDouble();

        System.out.println("MULTIPLICATION OF TWO DECIMAL NUMBER:   "+ a * b);

        /* Now For multiplication the precedence is followed but for addition the precedence is same and that is why
         addition operation not works here and to do it correct we have to put the expression in bracket.
         System.out.println("ADDITION OF TWO DECIMAL: "+ a + b); -------> NOT WORK
         System.out.println("ADDITION OF TWO DECIMAL: "+ (a + b)); -----> WORK
         */

        System.out.println("ADDITION OF TWO DECIMAL: "+ a + b);
        System.out.println("ADDITION OF TWO DECIMAL: "+ (a + b));

    }
}
