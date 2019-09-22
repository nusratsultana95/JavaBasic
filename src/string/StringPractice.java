package string;

public class StringPractice {
    public static void main(String[] args) {
        //concating string
        String a="people";
        String b="and";
        String c="tech";
        System.out.println(a+" "+b+" "+c);
        String x = a.concat(c);
        System.out.println(x);

        //StringBuilder
        StringBuilder stringBuilder = new StringBuilder(); //stringbuilder
        stringBuilder.append("rock");//its adding "rock"
        stringBuilder.append("star");//its adding "rockstar"
        System.out.println(stringBuilder);

        //using stringbuilder inside a loop

        String numbers="";
        StringBuilder stringBuilder2 = new StringBuilder();
        for(int i=0;i<5;i++){
            stringBuilder2.append(i);
            numbers+=i; //it prints 0,01,012,0123....
            System.out.println(numbers);
        }
       // System.out.println(stringBuilder2); //it prints 01234

    }
}
