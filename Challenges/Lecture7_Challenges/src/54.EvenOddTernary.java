import java.util.Scanner;

class EvenOddTernary {

    public static void main(String[] args) {

        System.out.println("Welcome to Even Odd checking via Ternary Operator !!!!");

        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter the number: ");
        int a = input.nextInt();

        EvenOddTernary ter = new EvenOddTernary();
        if(ter.checkEvenOdd(a)) System.out.println("Number is Even");
        else System.out.println("Number is odd");

    }
    public boolean checkEvenOdd(int num){
        return num % 2 == 0 ? true : false;
    }
}
