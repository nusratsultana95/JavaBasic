package practice4;

import java.util.ArrayList;

public class Arraylist01 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("nusrat");
        arrayList.add("hannan");
        System.out.println(arrayList.size());
        arrayList.remove(0);
        System.out.println(arrayList.size());
        for (int a=0;a<arrayList.size();a++){
            System.out.println(arrayList.get(a));
        }

    }
}
