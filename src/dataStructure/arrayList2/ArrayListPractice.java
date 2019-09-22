package dataStructure.arrayList2;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("Mr.x");
        arrayList.add("Mr C");
        System.out.println(arrayList.get(1));
        arrayList.remove(0);
        System.out.println(arrayList.size());
        for (int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
        arrayList.clear();
        System.out.println(arrayList.size());







       /* ArrayList<String>arrayList1= new ArrayList<>();
        arrayList1.add("Nusrat");

        for (int n=0;n<arrayList1.size();n++){
            System.out.println(arrayList1.get(n));
        }*/
    }
}
