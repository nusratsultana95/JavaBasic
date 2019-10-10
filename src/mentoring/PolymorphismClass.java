package mentoring;

import Practice.PolumorphismClass;

public class PolymorphismClass {
    //method overloading= same method, diffrent parameter, same class
     public static void calculator(int a,int b){
         int c= a+b;
         System.out.println(c);
     }
     public static void calculator(int d,int e,int i){
         int x= d+e+i;
         System.out.println(x);
     }


     public void method01(){
         System.out.println("this is a method");
     }

    public static void main(String[] args) {
         calculator(10,20);
         calculator(15,10,15);

    }






    }





    //method overridding= same method , same parameter, different class , different body.

