package base;

public class ConstructorTest {

    public ConstructorTest(){
    }
    int year;
    String name;
    public ConstructorTest(int year){
        this.year= year;
    }
    public void method1(){
        System.out.println(name);
    }
}
