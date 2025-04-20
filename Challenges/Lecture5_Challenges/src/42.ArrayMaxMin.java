import java.util.Scanner;

class ArrayMaxMin {

    public static void main(String[] args) {

        System.out.println("Welcome to the Array Max Min Program");

        int[] arr = ArrayUtility.inputArray();
        int i=0;

        //This is the max and min value of 'int' in Java
        int max = -2147483648 ;
        int min = 2147483647;
        while(i < arr.length){
            if(arr[i]>max) max = arr[i];
            if(arr[i]<min) min = arr[i];
            i++;
        }
        System.out.println("Maximum Element in the Array is: "+max);
        System.out.println("Minimum Element in the Array is: "+min);
    }
}
