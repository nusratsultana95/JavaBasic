package utility;

import java.util.Scanner;

public class TestScanner {
    public static  int calculator(){
        Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        int x =a+b;
        return x;
    }
    public static void studentinfo(){
        Scanner scanner= new Scanner(System.in);
        String name= scanner.nextLine();
        int age = scanner.nextInt();
        long mobileno=scanner.nextLong();
        char gender = scanner.next().charAt(0);
        System.out.println(name);
        System.out.println(age);
        System.out.println(mobileno);
        System.out.println(gender);



    }

    public static void main(String[] args) {
        //int result=calculator();
       // System.out.println(result);
        studentinfo();
    }
}
