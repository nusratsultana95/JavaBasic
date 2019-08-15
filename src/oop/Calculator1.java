package oop;

public class Calculator1 {
    //polymorphism
//overloading
    public static int multiply(int a,int b){
        return a*b;
    }
    public static int multiply(int a,int b, int c){
        return a*b*c;
    }
    public static Object multiply(String name,int id){
        return name+id;
    }

    public static void main(String[] args) {
        int z= multiply(10,2);
        System.out.println(z);
        Object new1 = multiply("n",1);
        System.out.println(new1);




    }
}
