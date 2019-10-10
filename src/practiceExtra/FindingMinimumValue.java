package practiceExtra;

public class FindingMinimumValue {
    public static void main(String[] args) {
        int a=10;
        int b=7;
        int c= miniumum(a,b);
        System.out.println("minimum is"+ c);

    }

   public static int miniumum(int a, int b) {
        int num;
        if(a>b){
            num=b;
        }else{
            num=a;
        }return num;
    }
}
