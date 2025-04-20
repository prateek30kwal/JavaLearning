class ArrayPalindrome {

    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Checker");
        int[] arr = ArrayUtility.inputArray();

        if(isArrayPalindrome(arr)){
            System.out.println("Array is Palindrome");
        }
        else System.out.println("Array is not Palindrome");

    }
    public static boolean isArrayPalindrome(int[] newArr){

        int i = 0;
        int j = newArr.length - 1;

        while(i < j){
            if( newArr[i] == newArr[j] ){
                i++;
                j--;
            }
            else return false;
        }
        return true;

     //This is Faculty Logic same as previous one.
     /*
        int i = 0;
        while(i < newArr.length / 2){
            if(newArr[i] != newArr[newArr.length - 1 - i]){
                return false;
            }
            i++;
        }
        return true;

      */

    }
}
