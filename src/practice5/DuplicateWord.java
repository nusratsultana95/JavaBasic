package practice5;

import java.util.HashSet;

public class DuplicateWord {
    public static void main(String[] args) {
        String sentence="Amazon is burning and this is not a good news for this planet";
        String[]newArray=sentence.split(" ");
        HashSet<String> hashSet = new HashSet<>();
        for (String newWord:newArray){
            if(hashSet.add(newWord)==false){
                System.out.println("Duplicate word is:"+newWord);
            }
        }
    }
}
