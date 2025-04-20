import java.util.Scanner;

class SearchTwoDimensionalArray {

    public static void main(String[] args) {

        System.out.println("Welcome to the 2-D Array Searching");

        int[][] nums = ArrayUtility.input2DArray();

        System.out.println("Please Enter the number you want to search");
        Scanner input = new Scanner(System.in);
        int no = input.nextInt();

        boolean isFound = searching(nums,no);
        if(isFound) System.out.println("Number is Found");
        else System.out.println("Number is not found");

    }
    public static boolean searching(int[][] newArr, int num){

        int i = 0;
        while(i < newArr.length){
            int j = 0;
            while(j < newArr[i].length){
                if(newArr[i][j] == num) return true;
                j++;
            }
            i++;
        }

        return false;
    }
}
