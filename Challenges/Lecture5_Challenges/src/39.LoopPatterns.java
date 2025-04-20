import java.util.Scanner;

class LoopPatterns {
    public static void main(String[] args) {

        System.out.println("Welcome to the Pattern Program");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the no of patter: ");
        int pattern = input.nextInt();
        printFirstPattern(pattern);
        printReverseRightHalfPyramid(pattern);
        leftHalfPyramid(pattern);

    }
    public static void printFirstPattern(int maxRows){

        int rows = 0;
        while (rows < maxRows){
            System.out.print("*");
            int i = 0;
            while (i < rows){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }


    }
    public static void printReverseRightHalfPyramid(int maxRows){
        System.out.println("welcome to the ReverseRightHalfPyramid");
        int rows = 0;
        while(rows < maxRows){
            System.out.print("*");
            int i = maxRows - 1;
            while(i > rows ){
                System.out.print(" *");
                i--;
            }
            System.out.println();
            rows++;
        }



    }

    public static void leftHalfPyramid(int maxRows){

        System.out.println("Welcome to the Left Half Pyramid");
        int rows = maxRows;
        while (rows > 0){
            int j = 0;

            //This loop prints spaces.
            while(j < rows-1){
                System.out.print("  ");
                j++;
            }

            //This loop print *
            int i = 0;
            while (i <= maxRows-rows){
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows--;
        }


    }

}
