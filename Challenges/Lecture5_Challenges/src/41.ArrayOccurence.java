import java.util.Scanner;

class ArrayOccurence {

    public static void main(String[] args) {

        System.out.println("Welcome to the Array Occurence Program");
        /*
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        int i = 0;
        while( i < arr.length){
            arr[i] = input.nextInt();
            i++;
        }

         */
        int[] arr = ArrayUtility.inputArray();
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the Element to be found in an Array: ");
        int findElement = input.nextInt();

        int fo = findOccurence(arr, findElement);
        System.out.println("No of times Element found: "+fo);
    }

    public static int findOccurence(int[] array, int fe){

        int i = 0;
        int count = 0;
        while(i < array.length){
            if(array[i] == fe) count++;
            i++;
        }
        return count;

    }
}
