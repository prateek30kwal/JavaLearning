class SumAndAverage2DArray {

    public static void main(String[] args) {

        System.out.println("Welcome to the Sum and Average of 2D Array\n");

        int[][] numArr = ArrayUtility.input2DArray();
        System.out.println("Your Sum of Array is: "+sum(numArr));
        System.out.println("Your Avg of Array is: "+average(numArr));
    }
    public static long sum(int[][] numArr){

        int i = 0;
        long sum = 0;
        while(i < numArr.length){
            int j = 0;
            while(j < numArr[i].length){
                sum = sum + numArr[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }
    public static double average(int[][] numArr){

        if(numArr.length == 0){
            return 0;
        }
        int i = 0;
        int rows = numArr.length;
        int size = 0;
        //For unskewed array this will be the array :-[[ int cols = numArr[0].length; ]]
        //This is for skewed array
        while(i < rows){
            size = size + numArr[i].length;
            i++;
        }
        System.out.println("Value of Rows: "+numArr.length);
        System.out.println("Value of Column: "+size);
        return (double) sum(numArr) / size;
    }
}
