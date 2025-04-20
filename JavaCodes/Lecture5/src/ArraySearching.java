import java.util.Scanner;

public class ArraySearching {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] arr = {3,6,8,87,65,4,68,23,9,98,34};
        System.out.println("Welcome to the Array Searching\n");
        System.out.println("Enter the number you want to search: ");
        int num = input.nextInt();
        boolean isFound = isFound(arr, num);
        if (isFound){
            System.out.println("Your Number was found in the Array");
        }
        else System.out.println("Number is not Found");
    }

    public static boolean isFound(int[] arr, int num){
        int index = 0;
        while(index < arr.length){
            if (arr[index] == num) return true;
            index++;
        }

        return false;
    }


}
