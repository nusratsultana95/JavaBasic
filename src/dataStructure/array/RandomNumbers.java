package dataStructure.array;

import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt(100));//it is not gonna print more than 100

        //create an array and store 5 random numbers
        int[] numb= new int[5];

        Random random1 = new Random();
        for(int i=0;i<5;i++){
            numb[i]= random1.nextInt(100);//means>> numb becomes  random numbers

            System.out.println(numb[i]);
        }



        //create an array and store 5 numbers from console
        int[]digit= new int[5];
        Scanner scanner=new Scanner(System.in);

        for (int a=0;a<digit.length;a++){
            System.out.print("insert the value:");
            digit[a]= scanner.nextInt();

        }

    }

}
