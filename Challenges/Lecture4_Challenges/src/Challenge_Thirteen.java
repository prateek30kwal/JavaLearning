import java.util.Scanner;

public class Challenge_Thirteen {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of Principle:");
        int pr = input.nextInt();

        System.out.println("Enter the value of Rate of Interest:");
        float rate =  input.nextFloat();

        System.out.println("Enter the value of Time period:");
        float time = input.nextFloat();

        System.out.println("COMPOUND INTEREST ------>");
        double ci = pr * Math.pow((1 + rate / 100), time);
        System.out.println(ci);

    }
}
