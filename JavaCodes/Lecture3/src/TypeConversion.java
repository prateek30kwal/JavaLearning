public class TypeConversion {

    public static void main(String[] args) {

        //Automatic type conversion(Implicit)
        float myFloat = 5;
        System.out.println(myFloat);

        //Explicit Type conversion it is forceful by coder!!
        int myInt = (int)5.0f; //casting and data loss occur
        System.out.println(myInt);

    }
}
