import java.util.Arrays;
import java.util.Scanner;

public class ArrayUtility {

    public static int[] inputArray(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the number of elements: ");
        int size = input.nextInt();
        int[] nums = new int[size];
        int i = 0;
        while(i < size){
            System.out.print("Please enter the element number "+(i+1)+": ");
            nums[i] = input.nextInt();
            i++;
        }

        System.out.println("Array is: "+ Arrays.toString(nums));
        return nums;
    }

    public static int[][] input2DArray(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Please Enter the number of columns: ");
        int column = input.nextInt();

        int[][] arr =new int[rows][column];

        int i = 0;
        while(i < rows){
            int j = 0;
            while(j < column){
                System.out.println("Please enter element rows: "+(i+1)+", column: "+(j+1)+" :");
                arr[i][j] = input.nextInt();
                j++;
            }
            i++;
        }

        System.out.println(Arrays.deepToString(arr));
        return arr;
    }
}
