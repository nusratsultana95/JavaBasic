package dataStructure.arrayList2;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPractice2 {
    public static void main(String[] args) {
        ArrayList<String>arrayList= new ArrayList();
        arrayList.add("ny");
        arrayList.add("va");
        arrayList.add("fl");


        //using Iterator(alternation of loop)
        Iterator iterator=arrayList.iterator();//it is a method
        // Iterator is interface thats why we cannot make object.
        // in order to interect with arraylist we need the object of arraylist and the method iterator
        while(iterator.hasNext()) {
            //hasnext is a boolean,it is going to return me next value from the arraylist.
            System.out.println(iterator.next());
        }

    }
}
