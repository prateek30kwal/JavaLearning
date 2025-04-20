public class Car {

    static int noOfCarsSold;

    //This is the block which called only once during the class load.
    //static block
    static {
        noOfCarsSold = 0;
    }

    //This is the block which called every time when the object is created.
    //Non-static block

    {
        noOfCarsSold++;
        System.out.println("Total Number of Cars sold: "+noOfCarsSold);
    }


    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLitres;
    int noOfSeats;

    //This is the 1st way
    /*
    Car(){
        noOfSeats = 5;
        noOfWheels = 4;
        maxSpeed = 150;
        color = "Black";
        currentFuelInLitres = 2;

    }

     */

    //This is the 2nd way
    Car(){
        this("Black");
        currentFuelInLitres = 5;

    }

    Car(String color){

        noOfSeats = 5;
        noOfWheels = 4;
        maxSpeed = 150;
        this.color = color;
        currentFuelInLitres = 2;
    }


    //This drive() method is non-static method hence it can access non-static variables.
    public void drive(){
        if(currentFuelInLitres == 0){
            System.out.println("Car is out of fuel");
        } else if (currentFuelInLitres < 5) {
            System.out.println("Car is in reserve mode, please refuel");
            currentFuelInLitres--;
        }
        else{
            System.out.println("Car is driving");
            currentFuelInLitres--;
        }

    }

    public void addFuel(float fuel){
        currentFuelInLitres += fuel;
    }

    public float getCurrentFuelInLitres(){
        return currentFuelInLitres;
    }

}