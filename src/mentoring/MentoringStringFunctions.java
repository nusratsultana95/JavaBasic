package mentoring;

import java.rmi.activation.ActivationGroup_Stub;
import java.util.HashSet;

public class MentoringStringFunctions {
    public static void main(String[] args) {
        //concat
        String city= "Tampa";
        String state= "FL";

        String x= city.concat(state);
        System.out.println(x);

        city=city.concat(" is a city of FL");
        System.out.println(city);
        System.out.println("****************************************");

        //duplicate word
        String sentence="Amazon is burning and this is not a good news for this planet";
        String[] newArray=sentence.split(" ");
        HashSet<String> hashSet= new HashSet<>();
        for(String newWord:newArray){
            if(hashSet.add(newWord)==false){
                System.out.println("Duplicate word is: "+newWord);
            }
        }
        //index
        String name="nusrat";
        System.out.println(name.indexOf("r"));
        System.out.println(name.charAt(3));


        //replaceing index

        System.out.println(name.replace('n','N'));
        System.out.println(name.replace('a','A'));


        //breaking down string elements
        String sentence2="Amazon is burning and this is not a good news for this planet";
        char[]word=sentence2.toCharArray();
        for(char newWord:word){
            System.out.println(newWord);
        }





    }
}
