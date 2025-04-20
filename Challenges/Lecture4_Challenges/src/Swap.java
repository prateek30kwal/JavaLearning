import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = scan.nextInt();
        System.out.println("Enter the second number");
        int b = scan.nextInt();
        System.out.println("Before Swapping number is  "+a+"   and   "+b);
        int c = a;
        a = b;
        b = c;
        System.out.println("After Swapping value of first number is:"+a);
        System.out.println("After Swapping value of second number is:"+b);

    }
}