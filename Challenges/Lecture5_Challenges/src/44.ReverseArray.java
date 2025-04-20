import java.util.Arrays;

class ReverseArray {

    public static void main(String[] args) {

        /*
        int[] arr = ArrayUtility.inputArray();
        int lastpos = arr.length - 1;

        int[] reversearr = reverseArray(arr, lastpos);
        System.out.println("Reverse Array is: "+ Arrays.toString(reversearr));

         */

        //Faculty Logic
        System.out.println("Welcome to Array Reversal\n");
        int[] numArr = ArrayUtility.inputArray();
        reverse(numArr);
        System.out.println("Your Reversal Array is:");
        System.out.println(Arrays.toString(numArr));

    }
    /*
    public static int[] reverseArray(int[] array, int lp){

        int i = 0;
        int lastpos = lp;
        int[] newArr = new int[lp+1];
        while( i <= lp ){
            newArr[i] = array[lastpos];
            i++;
            lastpos--;
        }

        return newArr;
    }

     */

    //Faculty Logic : Changes made in original array because when we pass an array we actually passed the array reference.
    public static void reverse(int[] arr){
        int i = 0;
        while(i < arr.length / 2){
            int swap = arr[i];
            arr[i] = arr[(arr.length - 1) - i];
            arr[(arr.length - 1) - i] = swap;
            i++;
        }
    }
}
