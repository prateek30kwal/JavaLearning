import java.util.Scanner;

class MultiplicationDemo {

    public static void main(String[] args) {

        greet();
        Multiply(inputNumber());
        System.out.println("End of Program");
    }

    public static void Multiply(int no){
        int i=1;
        while(i <= 10){
            System.out.println(no+" X "+i+" = "+(no*i));
            i++;
        }

    }
    public static void greet(){
        System.out.println("Welcome to the Table Display!");
    }

    public static int inputNumber(){

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the Number:");
        int num = input.nextInt();
        return num;
    }

}