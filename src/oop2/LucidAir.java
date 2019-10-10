package oop2;

public class LucidAir extends RunableCar {
    public void stop(){
        super.stop();//this super keyword or method brings old data and only can use in extends class
        System.out.println("Auto Stop when user leave the car with keys");
    }

}
