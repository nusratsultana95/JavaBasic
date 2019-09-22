package newJava;

public class SingletonTEst {
    //uses>>create same object in one class use it in multiple terms

    String x;
    //SingletonTEst singletonTEst = new SingletonTEst();
    private static SingletonTEst getSingletonTEst = null;// we created half of the object here// rule 02

    private SingletonTEst() {// rule 01 // it has to be private
        x = "this is a singleton class";
    }


    public static SingletonTEst getInstance() { // getinstance is a method to get the instance/object of a class
        if ( getSingletonTEst == null){ // means>> when its null make an object
            getSingletonTEst = new SingletonTEst();// and the other half is here

        }
        return getSingletonTEst;// and when that is done return me the object
    }


}
