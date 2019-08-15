package oop;

public class Bmw extends Car {
    //inheritance
   // public int getWheels(){
       // int hp= wheels;
       // return hp;
    //}
    public void method2(){
        CarClass();
        System.out.println("new car");
    }
    //overriding(polymorphism)
    @Override
    public void PolymorphismTest() {
        System.out.println("bmw");
    }

    public static void main(String[] args) {
        Bmw bmw = new Bmw();
        //int newvalue= bmw.getWheels();
        //System.out.println(newvalue);
        bmw.method2();
        bmw.PolymorphismTest();
    }

}
