import java.util.Arrays;

public class ArraysDemo {

    public static void main(String[] args) {

        int[] myArr = new int[5];
        myArr[0] = 98;
        myArr[1] = 68;
        myArr[2] = 55;
        myArr[3] = 9;
        myArr[4] = 67;

        System.out.println(myArr[0]);
        System.out.println(myArr[1]);
        System.out.println(myArr[2]);
        System.out.println(myArr[3]);
        System.out.println(myArr[4]);
        //System.out.println(myArr[5]);   ---> Array Index OutOfBound Exception
        System.out.println("Array prints in a single line");
        System.out.println(myArr);
        System.out.println(Arrays.toString(myArr));

        System.out.println("this is Traverse by Loop");
        int index = 0;
        while(index < myArr.length){
            System.out.println(myArr[index]);
            index ++;
        }

        String[] strArr = new String[4];
        strArr[0] = "My String";
        System.out.println(strArr);

        String[] newstrArr = {"first", "second", "third", "fourth"};
        System.out.println(newstrArr.length);
        System.out.println(Arrays.toString(newstrArr));

    }
}
