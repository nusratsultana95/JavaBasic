package dataStructure;

import java.util.HashMap;

public class HashmapPractice {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"NY");
        hashMap.put(2,"NJ");
        hashMap.put(30,"FL");

        System.out.println(hashMap);
        System.out.println(hashMap.get(3));//this is not index this is key
        System.out.println(hashMap.containsKey(3));

    }
}
