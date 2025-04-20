import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Challenge_Twelve {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of Principle:");
        int pr = input.nextInt();

        System.out.println("Enter the value of Rate of Interest:");
        float rate =  input.nextFloat();

        System.out.println("Enter the value of Time period:");
        float time = input.nextFloat();

        System.out.println("SIMPLE INTEREST---->");
        System.out.println();

        System.out.println((pr * rate * time)/100);


    }
}
