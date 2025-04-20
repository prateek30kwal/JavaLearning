import java.util.Scanner;

class IsArraySorted {

    public static void main(String[] args) {

        greet();
        int[] arr = ArrayUtility.inputArray();

        if(isDecreasing(arr)) System.out.println("Array is in Decreasing Order");
        else if (isIncreasing(arr)) System.out.println("Array is in Increasing Order");
        else System.out.println("Array is not in sorted form");


    }
    public static void greet(){

        System.out.println("Welcome to the Array Sorting Check Program");
    }
    /*
    public static int[] inputArray(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the value of Array");
        int i = 0;
        int[] arr = new int[10];
        while( i < arr.length){
            arr[i] = input.nextInt();
            i++;
        }
        return arr;
    }
    */

    /*
    public static boolean isArraySorted(int[] array){

        int i = 0;
        i = 1;
        while( i < array.length ){

            if( array[i] < array[i-1] ){
                return false;
            }
            i++;
        }
        return true;

    }

     */

    public static boolean isIncreasing(int[] numArr){

        int i = 1;
        while( i < numArr.length ){
            if( numArr[i] < numArr[i-1]) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isDecreasing(int[] numArr){

        int i = 1;
        while( i < numArr.length ){
            if( numArr[i] > numArr[i-1]) {
                return false;
            }
            i++;
        }
        return true;
    }

}
