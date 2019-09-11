package practice4;

import java.util.Random;
import java.util.Scanner;

public class RndomNum {
    public static void main(String[] args) {
        //array+random

        int[] count = new int[7];
        Random random = new Random();
        for (int a=0; a<count.length;a++){
            count[a]= random.nextInt(50);
            System.out.println(count[a]);
        }

        //array+scanner

        String [] name=new String[3];
        Scanner scanner = new Scanner(System.in);
        for (int x=0;x<name.length;x++){
            System.out.println("insert names:");
            name[x]=scanner.next();
        }


    }
}
