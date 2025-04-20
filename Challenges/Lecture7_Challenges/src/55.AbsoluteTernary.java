import java.util.Scanner;

class AbsoluteTernary {

    int no;
    int absoluteno;
    public static void main(String[] args) {
        System.out.println("Welcome to the Absolute Program!!!!!!");

        System.out.println("Please enter the number");

        Scanner input = new Scanner(System.in);

        AbsoluteTernary at =new AbsoluteTernary();
        at.no = input.nextInt();

        at.absoluteno=at.absoluteValue(at.no);

        System.out.println("Absolute Number is: "+ at.absoluteno);
    }
    public int absoluteValue(int num){

        return num >= 0 ? num : -num;
    }
}
