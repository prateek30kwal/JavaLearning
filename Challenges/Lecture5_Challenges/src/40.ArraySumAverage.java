import java.util.Scanner;

class ArraySumAverage {

    public static void main(String[] args) {
/*
        int i = 0;
        int[] arr = new int[10];
        int add = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter the 10 digits to an array: ");
        while( i < arr.length){
            arr[i]=input.nextInt();
            i++;
        }
        arraySumAverage(arr);

 */
        //Her we are using the ArrayUtility class to input Array. ArrayUtility class made by us.
        int[] numArray = ArrayUtility.inputArray();
        arraySumAverage(numArray);

    }
    public static void arraySumAverage(int[] array){
        float add = 0.0f;
        int i = 0;
        while( i < array.length){
            add = add + array[i];
            i++;
        }
        float average = add / (array.length);
        System.out.println("Addition of all the Element : "+add);
        System.out.println("Average of all element: "+average);

    }
}
