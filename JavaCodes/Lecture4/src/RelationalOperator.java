import java.util.Scanner;

public class RelationalOperator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Driving License portal");
        System.out.println("Please enter your Age:");
        int age = input.nextInt();

        if ( age >= 18 ){
            System.out.println("Eligible for Driving License");
        }
        else{
            System.out.println("NOT ELIGIBLE");
        }
    }
}
