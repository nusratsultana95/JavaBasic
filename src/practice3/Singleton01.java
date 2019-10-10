package practice3;

public class Singleton01 {
    String n;
    private Singleton01(){
        n= "singleton practice";
    }
    private static Singleton01 singleton01=null;

    public static Singleton01 getInstance(){
        if(singleton01==null){
            singleton01= new Singleton01();
        }
        return singleton01;
    }


}
