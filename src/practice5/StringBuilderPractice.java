package practice5;

public class StringBuilderPractice {
    public static void main(String[] args) {
        String name = "flower";
        String name2= "vase";
        StringBuilder stringBuilder= new StringBuilder();
        stringBuilder.append(name);
        stringBuilder.append(name2);
        System.out.println(stringBuilder);

        for(int a=0;a<5;a++){
            //name+=a;
           // System.out.println(name);
            stringBuilder.append(a);

        }System.out.println(stringBuilder);

    }
}
