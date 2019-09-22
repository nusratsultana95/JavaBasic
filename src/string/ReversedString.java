package string;

public class ReversedString {
    //u are given a string
    //create a method which will take a String param
    //and return reversed string of that


    //Example
    //Elpmaxe
    public static String getReversed(String value){
        //using String(option 2)

        String finaltext="";

        for(int a=value.length()-1;a>=0;a--){
            finaltext=finaltext+value.charAt(a);
        }
        return finaltext;


//        StringBuilder stringBuilder= new StringBuilder();
//        for(int i= value.length()-1;i>=0;i--){ //everytime u run it ,this will append one string (-1)
//            stringBuilder.append(value.charAt(i));
//        }
//
//        return  stringBuilder.toString();
    }

    public static void main(String[] args) {
       // System.out.println(getReversed("Example"));
        System.out.println(getReversed("example"));

    }
}
