package oop2;

public interface Vehicle {
    //we cant have a method body but can have parameters
    //cant make an object of interface
    //needs to implements to a different class with a main method
    // in interface all the methods are abstract by default, so we dont need to mention abstract, but on abstract class we need to mention abstract
    public void start();
    public void stop();
    public void name();

}
