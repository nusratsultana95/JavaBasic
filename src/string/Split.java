package string;

import java.util.HashSet;

public class Split {
    public static void main(String[] args) {
        String st = "Java is a programming language.Java is also an island of Indonesia";
        String[] words = st.split(" ");
        System.out.println(words.length);


        //duplicate words

        HashSet<String> hashSet = new HashSet<>();
        //hashset doesnt allow duplicate value.
       for (String newword : words) { //looping over array elements
           if (hashSet.add(newword) == false) { //inserting newword into hashset using "add()"
               //if its return false, that means the elements dont allow in hashset , is a duplicate value
               System.out.println("Duplicate words are: "+newword);

        } }

    }
}
