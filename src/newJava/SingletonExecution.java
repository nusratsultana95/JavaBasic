package newJava;

public class SingletonExecution {
    public static void main(String[] args) {
        SingletonTEst singletonTEst=  SingletonTEst.getInstance();
        SingletonTEst singletonTEst2= SingletonTEst.getInstance();
        singletonTEst.x=singletonTEst.x.toUpperCase();
        singletonTEst2.x=singletonTEst2.x.toLowerCase();
        System.out.println(singletonTEst.x);
        System.out.println(singletonTEst2.x);
    }
}
