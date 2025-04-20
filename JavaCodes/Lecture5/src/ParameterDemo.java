public class ParameterDemo {

    public static void main(String[] args) {

//        int num = sumTwoNumbers(4, 7);
//        System.out.println(num);

        System.out.println(sumTwoNumbers(78,5));
        System.out.println(sumTwoNumbers(2,6));
        System.out.println(sumTwoNumbers(87,5));
        System.out.println(sumTwoNumbers(-6,+6));
    }

    public static int sumTwoNumbers(int first, int second){
        System.out.println("First Number Received: "+ first);
        System.out.println("Second Number Received: "+second);
        return first + second;
    }


}
