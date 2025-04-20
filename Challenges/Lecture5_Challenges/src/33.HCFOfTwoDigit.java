import java.util.Scanner;

class HCFOfTwoDigit {

    public static void main(String[] args) {
        greet();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("HCF of two number "+a+" , "+b+" is "+hcf(a,b));

    }
    public static void greet(){
        System.out.println("Welcome to the HCF of two digit Program ");
    }

    public static int hcf(int firstnum, int secondnum) {
        int i = 2;
        int max = 0;
        int gcd = 1;
        if (firstnum >= secondnum) {
            max = firstnum;
            //i = secondnum;
        } else {
            max = secondnum;
            //i = firstnum;
        }
        while (i < max) {
            if ((firstnum % i == 0) && (secondnum % i == 0))  gcd = i;
            i++;
        }
        return gcd;
    }


}
