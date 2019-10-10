package base;

public class ConstructorExecution {
    public static void main(String[] args) {
        ConstructorTest cons = new ConstructorTest();
        ConstructorTest cons1 = new ConstructorTest(2019);
        System.out.println(cons1.year);

        cons.method1();


    }
}
