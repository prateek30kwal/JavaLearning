import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Name:");
        //String name = input.nextLine();
        String name = input.nextLine();
        System.out.println("Good Morning\t"+name);

        System.out.println(name + ", Also tell me your Age:");
        int age= input.nextInt();
        System.out.println("Your Age is :"+age);


    }
}
