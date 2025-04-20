import java.util.Scanner;
class MinimumTwoNumberTernary {

    public static void main(String[] args) {

        System.out.println("Welcome to the Minimum of two number through ternary operator!!!");

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the first Number:");
        int a = input.nextInt();

        System.out.println("Please Enter the second Number:");
        int b = input.nextInt();

        MinimumTwoNumberTernary ternary = new MinimumTwoNumberTernary();
        int minnum = ternary.min(a,b);

        System.out.println("Minimum Number is: "+minnum);

    }

    public int min(int num1, int num2){

        return num1 > num2 ? num2 : num1;
    }
}
