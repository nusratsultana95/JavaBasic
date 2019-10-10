package dataStructure;

import java.util.LinkedList;

public class LinkedListPractice {
    //in term of data manipulating point of view linklist faster than arraylist
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("XYZ");
        linkedList.add("ABC");
        linkedList.add("PSH");
        linkedList.add("RVB");
        for(int i=0;i<linkedList.size();i++){
            System.out.println(linkedList.get(i));
        }
        System.out.println(linkedList.getFirst());// to get first and last data
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.peek());//peek always return first value or getting the top index
        System.out.println(linkedList.element());//it throws nosuchelement exception and same as peek
        System.out.println(linkedList.remove());//removes first elements
        System.out.println(linkedList.size());
        linkedList.set(0,"SGH");//so set or edit value
        System.out.println(linkedList.getFirst());
    }
}
