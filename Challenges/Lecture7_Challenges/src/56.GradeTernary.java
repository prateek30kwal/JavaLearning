import java.util.Scanner;

class GradeTernary {

    float marks;
    String category;
    public static void main(String[] args) {
        System.out.println("Welcome to the Grades Project");

        System.out.println("Please enter the marks of the student: ");
        Scanner input = new Scanner(System.in);

        GradeTernary gt = new GradeTernary();
        gt.marks = input.nextFloat();

        gt.gradeCheck(gt.marks);
        System.out.println("Marks in the range of  "+gt.category+"  category");

    }
    public String gradeCheck(float marks){

        category = marks > 80 ? "** HIGH **" : (marks > 50 ? "** MODERATE **" : "** LOW **");
        return category;
    }
}
