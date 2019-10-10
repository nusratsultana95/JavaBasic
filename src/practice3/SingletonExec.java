package practice3;

public class SingletonExec {
    public static void main(String[] args) {
        SingletonP singletonP= SingletonP.getInstance();
        singletonP.i=singletonP.i.toUpperCase();
        System.out.println(singletonP.i);

        //*****************************

        Singletonprac2 singletonprac2 = Singletonprac2.getInstance();
        singletonprac2.n=singletonprac2.n.toLowerCase();
        Singletonprac2 singletonprac3 = Singletonprac2.getInstance();
        singletonprac3.n=singletonprac3.n.toUpperCase();// what ever u put at last that will reflect both.
        System.out.println(singletonprac3.n);
        System.out.println(singletonprac2.n);

        //*********************************************


        Singleton01 singleton01 = Singleton01.getInstance();
        singleton01.n=singleton01.n.toUpperCase();
        Singleton01 refvar=Singleton01.getInstance();
        refvar.n=refvar.n.toLowerCase();
        System.out.println(singleton01.n);
        System.out.println(refvar.n);




    }
}
