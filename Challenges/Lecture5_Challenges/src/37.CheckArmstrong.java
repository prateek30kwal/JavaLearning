import java.util.Scanner;

class CheckArmstrong {

    public static void main(String[] args) {
        greet();
        Scanner input = new Scanner(System.in);
        checkArmstrongNumber(input.nextInt());

    }
    public static void greet() {
        System.out.println("welcome to the Armstrong Number");
    }
    public static void checkArmstrongNumber(int no){
        int i = 0;
        int arm = 0;
        int num1 = no;
        int num2 = no;
        while(num1>0){
            num1 = num1/10;
            i++;
//            System.out.println("Value of i: "+i);
        }
        while(num2>0){
            int digit = num2%10;
            arm = (int) (arm + Math.pow(digit,i));
            num2 = num2/10;
//            System.out.println("Value of digit: "+digit);
//            System.out.println("Value od Arm: "+arm);
//            System.out.println("Value of num2 "+num2);
        }
        if(arm == no) System.out.println(no+" is Armstrong Number");
        else System.out.println(no+" not a Armstrong Number");

    }

}
