public class FunctionDemo {

    public static void main(String[] args) {
        System.out.println("In main method");
        greetUser();
        System.out.println("Method calling complete");

        printFirstPattern();
        printSecondPattern();
        printThirdPattern();

    }
    public static void printFirstPattern(){

        /*System.out.println("* * * * *");
        System.out.println("* * * *");
        System.out.println("* * *");
        System.out.println("* *");
        System.out.println("*");

         */

        int rows = 0;
        while (rows < 10){
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

    public static void printSecondPattern(){

      /*  System.out.println("*");
        System.out.println("* *");
        System.out.println("* * *");
        System.out.println("* * * *");
        System.out.println("* * * * *");

       */

    }

    public static void printThirdPattern(){

       /* System.out.println("        *");
        System.out.println("      * *");
        System.out.println("    * * *");
        System.out.println("  * * * *");
        System.out.print("* * * * *");

        */

    }

    public static void greetUser(){
        System.out.println("Welcome to Prateek Coding");
    }



}
