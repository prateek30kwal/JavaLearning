import java.util.Arrays;

class MergeTwoSortedArray {

    public static void main(String[] args) {

        int[] arr1 = ArrayUtility.inputArray();
        int[] arr2 = ArrayUtility.inputArray();
        if(arr1.length > arr2.length){
            int[] mergeArray = mergingArray(arr1,arr2);
            System.out.println("Merging of Sorted Array: "+ Arrays.toString(mergeArray));
        }
        else{
            int[] mergeArray = mergingArray(arr2,arr1);
            System.out.println("Merging of Sorted Array: "+ Arrays.toString(mergeArray));
        }

    }

    public static int[] mergingArray(int[] newArr1, int[] newArr2){
        int[] mergingArray = new int[newArr1.length + newArr2.length];
        int i = 0;
        int j = 0;
        int mergeindex = 0;

        while( i < newArr1.length){

            while( j < newArr2.length){
                if(newArr1[i] > newArr2[j]){
                    mergingArray[mergeindex] = newArr2[j];
                    j++;
                    mergeindex++;
                }
                else break;
            }
            mergingArray[mergeindex] = newArr1[i];
            mergeindex++;
            i++;
        }
        return mergingArray;
    }
}
