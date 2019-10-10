package basic;

public class TestMethods {
    public static void main(String[] args) {
       math();
       math1(5,10);
    }
    public static void math(){
        int a=10;
        int b=11;
        int c=a+b;
        System.out.println(c);

    }
    public  static void math1(int a, int b){
        int c=a+b;
        System.out.println(c);
    }
}
