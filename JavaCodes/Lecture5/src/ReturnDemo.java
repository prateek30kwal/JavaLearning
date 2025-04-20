import java.util.Scanner;

public class ReturnDemo {

    public static void main(String[] args) {

        greet();
        int first = readNumber();
        int second = readNumber();
        System.out.println("Sum of the number: "+(first + second));

    }
    public static void greet(){
        System.out.println("Welcome to Calculator\n");
    }

    public static int readNumber(){

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number: ");
        int number = input.nextInt();
        return number;
    }


}
