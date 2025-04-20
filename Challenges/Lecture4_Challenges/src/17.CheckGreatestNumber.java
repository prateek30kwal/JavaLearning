import java.util.Scanner;

class CheckGreatestNumber {

    public static void main(String[] args) {

        System.out.println("Please Enter the three number: ");
        Scanner input = new Scanner(System.in);

        int firstnum = input.nextInt();
        int secondnum = input.nextInt();
        int thirdnum = input.nextInt();

        if ( firstnum >= secondnum && firstnum >= thirdnum) System.out.println("Greatest number is "+firstnum);
        else if( secondnum >= thirdnum ) System.out.println("Greatest number is "+secondnum);
        //Here we can check only secondnum with thirdnum because with first condition firstnum is not largest.
        // else if( secondnum >= thirdnum )
        else System.out.println("Greatest number is "+thirdnum);

    }
}
