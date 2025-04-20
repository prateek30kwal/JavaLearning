public class Unary {

    public static void main(String[] args) {

        int x = 5;
        int y = -x;
        int z = -y;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        System.out.println("check post increment");
        int w = z++;
        System.out.println(z);
        System.out.println(w);

        System.out.println("check pre decrement");
        int k = --z;
        System.out.println(z);
        System.out.println(k);

    }
}
