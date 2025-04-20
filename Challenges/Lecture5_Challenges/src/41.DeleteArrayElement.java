import java.util.Arrays;
import java.util.Scanner;

class DeleteArrayElement {

    public static void main(String[] args) {

        System.out.println("Welcome to the Array Deletion");
        Scanner input = new Scanner(System.in);
        int[] numArr = ArrayUtility.inputArray();
        System.out.println("Now, enter the number you want to delete: ");
        int numToDelete = input.nextInt();
        int[] newArr = deleteNumber(numArr, numToDelete);
        System.out.println("Here is your new Array: "+ Arrays.toString(newArr));
    }
    public static int[] deleteNumber(int[] numArr, int numToDelete){

        int occ = ArrayOccurence.findOccurence(numArr, numToDelete);
        if( occ == 0){
            return numArr;
        }
        int newSize = numArr.length - occ;
        int[] newArr = new int[newSize];

        int i = 0, j = 0;
        while(i < numArr.length){
            if(numArr[i] != numToDelete){
                newArr[j] = numArr[i];
                j++;
            }
            i++;
        }

        return newArr;
    }
}
