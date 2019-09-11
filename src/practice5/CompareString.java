package practice5;

public class CompareString {
    public static void main(String[] args) {
     String name ="Nusrat";
     //String hubby ="Nusratdfkjgkjg";// this wil print -8(index) bcuz after Nusrat here is 8 digit more which doesnt match
        // String hubby="Hannan"; //its printing me 6(index) bcuz the whole String is different
       String name2 = "hNusrat";// if anything in front of Nusrat,this will print -26
        String x= "NUSRAT";

        System.out.println(name.compareTo(name2));
        System.out.println(name.compareToIgnoreCase(x)); // comparing elements from the string(upper/lower case)

    }
}
