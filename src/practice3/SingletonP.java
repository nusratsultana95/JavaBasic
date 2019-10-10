package practice3;

public class SingletonP {
    String i;
    private static SingletonP singletonP =null;
    private SingletonP(){
        i= "singleton practice";
    }
    public static SingletonP getInstance() {
        if(singletonP==null){
            singletonP=new SingletonP();
        }
        return singletonP;
    }
}
