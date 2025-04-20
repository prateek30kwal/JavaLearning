public class Car_thisDemo {

    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLitres;
    int noOfSeats;

    public Car_thisDemo start(){

        if(currentFuelInLitres == 0){
            System.out.println("Car is out of fuel , not started");
        } else if (currentFuelInLitres < 5) {
            System.out.println("Car is in reserve mode, please refuel");
        }
        else{
            System.out.println("Car is starting, bruhhhh....");
        }

        // 'this' keyword is used to refer the current class instance variable.
        return this;
    }

    public void drive(){

        currentFuelInLitres--;
        System.out.println("Car is driving !!!");


    }

    // Now if we change the variable name 'fuel' to 'currentFuelInLitres' than priority is given to the local variable.
    // In that case to invoke the class variable we use 'this' keyword to call that actual variable.
    public void addFuel(float currentFuelInLitres){
        this.currentFuelInLitres += currentFuelInLitres;
    }

    public float getCurrentFuelInLitres(){
        return currentFuelInLitres;
    }
}
