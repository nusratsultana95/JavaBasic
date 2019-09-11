package practice4;

import java.util.LinkedList;

public class LinkDist01 {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("xyz");
        linkedList.add("abc");
        System.out.println(linkedList.get(0));
        linkedList.add("yes");
        linkedList.add("no");
        linkedList.add("ok");
        linkedList.add("great");

        linkedList.remove(0);
        System.out.println(linkedList.get(0));
    }


}
