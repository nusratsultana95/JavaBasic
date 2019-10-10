package dataStructure.array;

import java.util.HashSet;
import java.util.Iterator;

public class UniqueValue {
    //you are given an array of int
    //{1,3,2,2,3,10,7,3}
    //write code to find the unique values of the array
    //and sort the array
    //output should be like this>>{1,2,3,7,10}
    public static void main(String[] args) {

       int[]numbers={1,3,2,2,3,10,7,3};
        HashSet<Integer>hashSet=new HashSet<>();
        for (int i=0;i<numbers.length;i++){
           hashSet.add(numbers[i]);
        }
        Iterator<Integer> iterator=hashSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }




    }
}
