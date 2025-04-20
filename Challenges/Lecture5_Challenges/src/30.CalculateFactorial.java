import java.util.Scanner;

class CalculateFactorial {
    public static void main(String[] args) {
        greet();
        System.out.println("Factorial of the number: "+factorial(input()));
    }

    public static void greet(){
        System.out.println("welcome to the Factorial Calculator");
    }
    public static int input(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    public static int factorial(int no){
        int i = 1;
        int fact = 1;
        while(i <= no){
            fact =fact * i;
            i++;
        }
        return fact;
    }
}
