import java.util.Scanner;

class SumOfDigit {
    public static void main(String[] args) {
        greet();
        System.out.println("Sum of the digits: "+digitSum(input()));
    }
    public static void greet(){
        System.out.println("Welcome to the Sum of Digit Program!!");
    }
    public static int input(){
        System.out.print("Please Enter the number: ");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    public static int digitSum(int no){
        int i = 0;
        while(no > 0){
            i = i + (no % 10);
            no = no/10;
        }
        return i;
    }
}
