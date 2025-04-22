import java.util.Scanner;

class MonthPrintDemo {

    int month;
    public static void main(String[] args) {
        System.out.println("Welcome to the MonthPrintDemo");

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the Month of the Year: ");

        MonthPrintDemo mpd = new MonthPrintDemo();
        mpd.month = input.nextInt();

        mpd.checkMonth(mpd.month);

    }

    public void checkMonth(int month){
        String monthname = switch (month){
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid Input";
        };
        System.out.println("Month of the Year is: "+monthname);
    }
}
