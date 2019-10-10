package Practice;

public class Prac extends Exe {
    //overloading

    public void calory(int a,int b){
        int c= a-b;
        System.out.println(c);
    }
    public void calory(int a,int h,int e){
        int d= h*e*a;
        System.out.println(d);
    }
    public static void count (String person,String word){
        String sentence = person+word;
        System.out.println(sentence);
    }
    public static void count(String p, String w,String j){
        String s= p+w+j;
        System.out.println(s);
    }

    @Override
    public void thismethod() {
        super.thismethod();
        System.out.println("this is a new method 2");
    }





    public static void main(String[] args) {
        Prac prac = new Prac();
        prac.calory(200,100);
        prac.calory(10,20,5);
        prac.thismethod();
        count("i"," love java");
        count("i"," hate"," java");





    }

}
