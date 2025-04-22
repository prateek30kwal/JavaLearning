import java.util.Scanner;

class CalculatorSwitch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Calculator\n");
        System.out.println("Please Enter the first Number: ");
        int num1 = input.nextInt();
        System.out.println("Now, Enter the Second Number: ");
        int num2 = input.nextInt();
        System.out.println("Now Enter the Operations: ");
        String operations = input.next();

        int result = switch (operations) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            default -> -1;
        };
        System.out.println("Your Answer is : "+ result);
    }
}
