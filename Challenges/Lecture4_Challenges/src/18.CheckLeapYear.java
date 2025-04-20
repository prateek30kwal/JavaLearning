import java.util.Scanner;

class CheckLeapYear {

    public static void main(String[] args) {

        System.out.println("Welcome to Leap Year Project");
        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter the year to Check: ");
        int year = input.nextInt();

        if( year % 400 == 0 ) System.out.println("Its a leap Year");
        else if( year % 100 == 0 ) System.out.println("Not a Leap Year");
        else if( year % 4 == 0) System.out.println("Its a Leap year");
        else System.out.println("Not a Leap Year");
        /*
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) sop("Your Year is a leap year");
        else sop("Not a leap year");
         */

    }
}
