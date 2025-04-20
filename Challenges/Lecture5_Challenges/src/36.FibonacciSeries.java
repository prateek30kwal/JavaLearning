import java.util.Scanner;

class FibonacciSeries {

    public static void main(String[] args) {
        greet();
        fibonacciNumber(inputNumber());

    }
    public static void greet(){
        System.out.println("Welcome to the Fibonacci Series ");
    }
    public static int inputNumber(){
        System.out.print("Please Enter the Number: ");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    public static void fibonacciNumber(int no){
        int firstnum = 0;
        int secondnum = 1;
        int thirdnum = 1;
        System.out.print("0,");
        while(thirdnum < no){
            System.out.print(thirdnum+",");
            thirdnum = firstnum + secondnum;

            firstnum = secondnum;
            secondnum = thirdnum;
        }
    }

    //By Faculty
    /*
    public static void printfibonacci(int num){
        if (num < 0) return;
        System.out.println("0 ");
        if (num == 0) return;
        System.out.println("1 ");

        int first = 0, second = 1;
        while(first + second <= num){
            int third = first + second;
            System.out.println(third + " ");
            first = second;
            second = third;
        }
    }

     */
}
