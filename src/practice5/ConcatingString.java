package practice5;

public class ConcatingString {
    public static void main(String[] args) {
        //concating mean adding a different string to the end of the previous string.
        String a= "BD";
        String b = "India";
        String c = "Pak";
        String x= a.toLowerCase();
        System.out.println(x);
        String h= b.concat(c);
        System.out.println(h);


        a= a.concat(" is my country"); // here you need to give the same variable name.you can give
        //a different one from the existing variable too.
        System.out.println(a);
    }
}
