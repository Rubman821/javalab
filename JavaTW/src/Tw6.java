abstract class Car{

    String carName,modelName;

    int chassiNum;

    Car(String carName,int chassiNum,String modelName){

        this.carName=carName;

        this.chassiNum=chassiNum;

        this.modelName=modelName;

    }

    abstract void startCar();

    abstract void operateSteering();

    void display(){

        System.out.println("Car Name:"+carName);

        System.out.println("Chassi number:"+chassiNum);

        System.out.println("Model Name:"+modelName);

    }

}



class MarutiCar extends Car{



    MarutiCar(String carName, int chassiNum, String modelName) {

        super(carName, chassiNum, modelName);

    }

    void startCar(){

        System.out.println("Starting a Maruti car....");

    }

    void operateSteering(){

        System.out.println("This car is manually steered.....");

    }

}



class BmwCar extends Car{



    BmwCar(String carName, int chassiNum, String modelName) {

        super(carName, chassiNum, modelName);

    }

    void startCar(){

        System.out.println("Starting a BMW car....");

    }

    void operateSteering(){

        System.out.println("This car is automatically steered.....");

    }

}



class Driver{

    String name,gender;

    int age;

    Driver(String name,int age,String gender){

        this.name=name;

        this.age=age;

        this.gender=gender;

    }

    void driveCar(Car obj){

        System.out.println("Driver:"+name);

        System.out.println("Age:"+age);

        System.out.println("Gender:"+gender);

        obj.display();

        obj.startCar();

        obj.operateSteering();

    }

}

public class Tw6 {

    public static void main(String []args){

        MarutiCar m=new MarutiCar("Suzuki",1253,"A21s");

        BmwCar b=new BmwCar("BMW5",4596,"S5");

        Driver d1=new Driver("Vishal",25,"Male");

        d1.driveCar(m);

        System.out.println();

        Driver d2=new Driver("Priya",23,"Female");

        d2.driveCar(b);

    }

} 