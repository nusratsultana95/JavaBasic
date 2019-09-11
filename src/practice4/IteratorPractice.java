package practice4;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorPractice {
    public static void main(String[] args) {
        //iterator is a similar to loops
        // you cannot use iterator in arrays
        // u always need some kind of list(arraylist,linkedlist)
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("nusrat");
        arrayList.add("hannan");
        arrayList.add("swadesh");
        arrayList.add("tasin");
        arrayList.add("mim");


        Iterator iterator = arrayList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
