import java.util.Scanner;

class CheckPrimeNumber {

    public static void main(String[] args) {
        greet();
        int number = inputNum();
        boolean isprimenum = isPrime(number);
        if(isprimenum) System.out.println(number +" is not a Prime Number");
        else System.out.println((number +" is a Prime Number"));
    }

    public static void greet(){
        System.out.println("Welcome to the Prime Number Calculator");
    }
    public static int inputNum(){
        System.out.println("Please Enter the Number: ");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    public static boolean isPrime(int no){
        if(no<2){
            System.out.println("Please Enter the valid number");
            return false;
        }
        if(no == 2) return false;
        int i=2;
        while(i<no) {
            if (no % i == 0) return true;
            i++;
        }
        return false;
    }

}
