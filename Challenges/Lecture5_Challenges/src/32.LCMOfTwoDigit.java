import java.util.Scanner;

class LCMOfTwoDigit {

    public static void main(String[] args) {

        greet();
        int num=lcm(input(),input());
        System.out.println("LCM of the two numbers "+num);

    }
    public static void greet(){
        System.out.println("Welcome to the LCM Program!");
    }
    public static int input(){

        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the number: ");
        int Num = input.nextInt();

//        System.out.print("Please Enter the number: ");
//        int secondNum = input.nextInt();

        return Num;
    }
    // ---> tHis is the function made by me which is incorrect!!
    /*
    public static void lcm(int a, int b){
        if(a >= b){
            if(a%b == 0) System.out.println("LCM of two number: "+a);
            else System.out.println("LCM of two number: "+(a*b));
        }
        else{
            if(b%a == 0) System.out.println("LCM of two number: "+b);
            else System.out.println("LCM of two number: "+(a*b));
        }
    }

     */
    public static int lcm(int a, int b){
         int i = 2;
//       while(true) ---> This can also be written because loop will always exit in atleast one condition.
         while(i <= (a*b)){
             if((i % a == 0) && (i % b == 0)){
                 return i;
             }
             i++;
         }
         return 0; //-- For while(true) we don't have to right this return statement.
    }
 // This is the second way to make this LCM function with less iteration.
 /*
    public static int lcm(int first, int second){
        int i = 1;
        // while(true) can also be written
        while(i <= second){
            int factor = first * i;
            if (factor % second == 0){
                return factor;
            }
            i++;
        }
        return 0;
    }

  */


}
