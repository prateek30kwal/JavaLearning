import java.util.Scanner;

class SumOddNumber {

    public static void main(String[] args) {

        greet();
        sumOfOddNumber(inputNumber());
    }
    public static void greet(){
        System.out.println("Welcome to the Odd number Addition!");
    }

    public static int inputNumber(){

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the Number:");
        int num = input.nextInt();
        return num;
    }
    public static void sumOfOddNumber(int oddno){
        int i = 1;
        int sum = 0;
        while(i <= oddno){
            sum = sum + i;
            i=i+2;
        }
        System.out.println("sum of Odd no: "+sum);

    }

}
