public class  Driver {

    static int minAgeForDriver =  18;
    String name;
    String dateOfLicense;
    int age;

    public boolean isAllowedToDrive(){
        //In non static method we can access static variable.
        return this.age >= minAgeForDriver;
    }


    public static void main(String[] args) {

        //This is the demo for simply object creation.
        /*
        Car myCar = new Car();



        myCar.addFuel(6);
        myCar.drive();
        myCar.drive();
        myCar.drive();
        myCar.drive();
        myCar.drive();
        myCar.drive();
        myCar.drive();
        myCar.drive();
        System.out.println(myCar.getCurrentFuelInLitres());

         */

        // Now underline is the demo for 'this' keyword !!!

        /*
        Car_thisDemo swift = new Car_thisDemo();
        swift.addFuel(6);
        Car_thisDemo swiftstarted = swift.start();
        swiftstarted.drive();

         */

        Car swift = new Car();
        swift.drive();
        System.out.println(swift.color);
        System.out.println(swift.maxSpeed);
        System.out.println(swift.noOfSeats);
        System.out.println(swift.noOfWheels);

        Car alto = new Car("Red");
        alto.drive();
        System.out.println(alto.color);
        System.out.println(alto.maxSpeed);
        System.out.println(alto.noOfSeats);
        System.out.println(alto.noOfWheels);


        //This is the Demo for "No access to non static member".
        Driver myDriver = new Driver();
        myDriver.name = "Driver Nahush";

        //This line will give error because dateOfLicence is non-static member and can not be accesed through class name.
        //Driver.dateOfLicense = "09/04/2025";


        //In static method we can access static variable.
        //System.out.println(minAgeForDriver); //or
        //System.out.println(Driver.minAgeForDriver);
    }
}
