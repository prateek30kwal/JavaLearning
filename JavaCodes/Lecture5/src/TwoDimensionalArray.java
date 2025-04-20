public class TwoDimensionalArray {

    public static void main(String[] args) {

        int[][] myArr = new int[2][3];
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9},{10,11},{12,13,14}};
        System.out.println(arr.length);
        System.out.println(arr[0].length);

        int i = 0;
        //This loop is for outer Array.
        while (i < arr.length){
            int j = 0;

            //This loop is for outer Array.
            while(j < arr[i].length){
                System.out.print(arr[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }

    }
}
