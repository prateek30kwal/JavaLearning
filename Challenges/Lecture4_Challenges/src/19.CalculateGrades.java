import java.util.Scanner;

class CalculateGrades {

    public static void main(String[] args) {

        System.out.println("Please enter the percentage: ");
        Scanner input = new Scanner(System.in);

        float per = input.nextFloat();

        if( per >= 90) System.out.println("Grades will be A");
        else if( per >= 75) System.out.println("Grades will be B");
        else if( per >= 60) System.out.println("Grades will be C");
        else if( per >= 30) System.out.println("Grades will be D");
        else System.out.println("Grades will be E");

    }
}
