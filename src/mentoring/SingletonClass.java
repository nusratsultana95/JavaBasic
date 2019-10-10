package mentoring;

public class SingletonClass {
    String x;


    private SingletonClass() {
        x = "this is a singleton class";

    }

    private static SingletonClass singletonClass = null;


    public static SingletonClass getInstance(){
        if (singletonClass==null){
            singletonClass= new SingletonClass();

        }
        return singletonClass;

    }


}


