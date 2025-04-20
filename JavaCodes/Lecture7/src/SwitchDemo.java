import java.util.Scanner;

public class SwitchDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Day of the week detector");
        System.out.println("Enter your day in number: ");
        int day = input.nextInt();
        newSwitch(day);

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("You have enter Invalid Day");

        }

        //This is the demo of switch if we remove break statement.
        System.out.println("Please Enter the second number");
        int day2 = input.nextInt();

        //If we remove the break condition then it will execute the furthur case condition as well, it doesn't matter whether it matches or not
        switch (day2){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                //break;
            case 7:
                System.out.println("Sunday");
                //break;
            default:
                System.out.println("You have enter Invalid Day");

        }

        //Post Java 12 it introduced enhancements


    }

    public static void newSwitch(int day){

        String dayStr = switch (day){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6,7 -> "Holiday it's WEEKEND!!!";
            default -> "Sunday";
        };
        System.out.println(dayStr);
    }
}
