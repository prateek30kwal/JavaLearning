import java.util.Scanner;

public class Challenge_Fourteen {

    public static void main(String[] args) {

        System.out.println("Enter the value of Fahrenheit:");
        Scanner input =new Scanner(System.in);
        float fah = input.nextFloat();


        System.out.println();

        System.out.println("CELSIUS SCALE:");
        System.out.println();
        System.out.println(((fah - 32)*5)/9);
    }
}
