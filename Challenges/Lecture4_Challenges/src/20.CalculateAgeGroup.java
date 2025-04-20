import java.util.Scanner;

class CalculateAgeGroup {

    public static void main(String[] args) {

        System.out.println("Please enter the Age of the child");
        Scanner input = new Scanner(System.in);

        int age = input.nextInt();

        if( age > 60) System.out.println("Group is Senior");
        else if( age > 20) System.out.println("Group is Adult");
        else if( age > 13) System.out.println("Group is Child");
        else System.out.println("Group is Teenage");
    }
}
