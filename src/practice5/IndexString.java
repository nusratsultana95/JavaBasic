package practice5;

public class IndexString {
    public static void main(String[] args) {
        String name = "Nusrat";
        System.out.println(name.indexOf('u')); // to see the index number
        System.out.println(name.charAt(5)); // to see the char/letter inside the index

        //replace index

        System.out.println(name.replace('u','U'));


        //breaking down string elements

        String character = "nusrat is a pnt student";

        char[] sentence = character.toCharArray();
        for (char breaking:sentence){
            System.out.println(breaking);
        }

    }
}
