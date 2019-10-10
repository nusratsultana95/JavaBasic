package dataStructure.array;

import java.util.ArrayList;

public class ArrayPractice2 {
    public static void main(String[] args) {
        int [] numbers= new int[3];
        numbers[0]=11;
        numbers[1]=12;
        numbers[2]=13;
        System.out.println(numbers[2]);
        int[] newarray = numbers.clone();
        System.out.println(newarray.length);
        for (int a=0; a<numbers.length;a++){
            System.out.println(numbers[a]);
        }
        String[]names = new String[3];
        names[0]="nusrat";
        names[1]="hannan";
        names[2]="swadesh";
        System.out.println(names[2]);
        String[] newString= names.clone();
        System.out.println(newString.length);
        for(String x:newString){
            System.out.println(x);
        }


    }
}
