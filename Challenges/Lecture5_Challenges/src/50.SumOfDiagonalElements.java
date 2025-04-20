class SumOfDiagonalElements {

    public static void main(String[] args) {
        System.out.println("Welcome to Diagonal Sum ");
        int[][] numArr = ArrayUtility.input2DArray();
        long ld = leftDiagonal(numArr);
        long rd = rightDiagonal(numArr);
        System.out.println("Sum of Diagonals : "+(ld + rd));
    }

    public static long leftDiagonal(int[][] arr){
        int i = 0;
        int j = 0;
        int sumLeftDiagonal = 0;
        while(i < arr.length){
            sumLeftDiagonal = sumLeftDiagonal + arr[i][j];
            i++;
            j++;

        }
        return sumLeftDiagonal;
    }

    public static long rightDiagonal(int[][] arr){
        int i = 0;
        int j = (arr[0].length - 1);
        int sumRightDiagonal = 0;
        while(i < arr.length){
            sumRightDiagonal = sumRightDiagonal + arr[i][j];
            i++;
            j--;
            if(i == j){
                if(arr.length % 2 != 0) sumRightDiagonal = (sumRightDiagonal - arr[i][j]);
            }
        }
        return sumRightDiagonal;
    }
}
