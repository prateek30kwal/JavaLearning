import java.util.Scanner;

class BitwiseLeftShift {

    public static void main(String[] args) {

        System.out.println("Welcome to Bitwise LeftShift program");

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        int first = input.nextInt();

        int result = first << 4;
        System.out.println("Result is: "+result);

        //Note : When we left shift it gets multiplied by 2. If it is 1 then ---> 2's power 1
        //If it is 4 then ---> 2's power 4
        // Use is what is the value of 2's power 32 ---> we write 2 << 32
    }
}
