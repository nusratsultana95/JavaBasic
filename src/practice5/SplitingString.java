package practice5;

public class SplitingString {
    public static void main(String[] args) {
        //splits is a method to count the strings elements.
        String line= "My name is Nusrat. I am Bangladesh";
        //String[] word= line.split("");//it counts every word and spaces.
        String[]word=line.split(" ");//it counts only words.
        System.out.println(word.length);

    }
}
