package practice3;

public class Singletonprac2 {
    String n;
    private static Singletonprac2 singletonprac2= null;
    private Singletonprac2(){
        n="practising singleton 2nd time";
    }
    public static Singletonprac2 getInstance(){
        if(singletonprac2==null){
            singletonprac2=new Singletonprac2();
        }
        return singletonprac2;
    }

}
