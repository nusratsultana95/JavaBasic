package mentoring;

public class SingletonExecution {
    public static void main(String[] args) {
       SingletonClass singletonClass = SingletonClass.getInstance();
        singletonClass.x=singletonClass.x.toLowerCase();
        System.out.println(singletonClass.x);
    }
}
