abstract class Vehicle{

    abstract void start();
    abstract void stop();

}


 interface FuelEfficiency  {
    void calculateMileage();
    
}

class Car extends Vehicle implements FuelEfficiency {
    
@Override
void start(){
    System.out.println("Car  Started...");
}

 @Override
 void stop(){
    System.out.println("Car  stopped");
 }

 @Override
 public void  calculateMileage(){
     System.out.println("Car Mileage : 18 km per litre");
 }
}


class Bike extends Vehicle implements FuelEfficiency{

    @Override
void start(){
    System.out.println("Bike started...");
}

 @Override
 void stop(){
    System.out.println("Bike stopped");
 }

 @Override
 public void  calculateMileage(){
     System.out.println("Bike Mileage : 55 km per litre");
 }
}



public class ManagmentClass {

    public static void main(String[] args) {
        
        Car c1= new Car();
        c1.start();
        c1.stop();
        c1.calculateMileage();

        System.out.println();

        Bike b1= new Bike();
        b1.start();
        b1.stop();
        b1.calculateMileage();

    }
}
