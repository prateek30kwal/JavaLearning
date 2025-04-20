import java.util.Scanner;
public class LogicalOperator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Ticket Discount Calculator");
        System.out.print("Please Enter your Age: ");
        int age = input.nextInt();

        System.out.println("Are you a female? (true/false)");
        boolean isfemale = input.nextBoolean();

        if (age < 5){
            System.out.println("you got 75% discount");
        }
        else if(isfemale) System.out.println("you got 50% discount");
        else if(age > 60 && !isfemale) System.out.println("you got 25% discount");
        else System.out.println("NO DISCOUNT");

    }
}
