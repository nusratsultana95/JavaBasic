package practice6;

import java.util.ArrayList;
import java.util.Arrays;

public class ReaderAndArraylistValues {
    public static void main(String[] args) {
        ReaderAndArraylist readerAndArraylist = new ReaderAndArraylist();
        String value=readerAndArraylist.methodReader("src\\practice6\\read.txt");
        System.out.println(value);
        ArrayList<String> list= new ArrayList<>();
        String[]text=value.split(" ");
        list.addAll(Arrays.asList(text));
        //list.addAll(Arrays.asList(value.split(" ")));

        for(String result:text){
            System.out.println(result);
        }


    }
}
