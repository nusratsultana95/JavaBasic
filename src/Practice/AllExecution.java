package Practice;

public class AllExecution extends InheritanceClass{

    public int  newMethod(){
       int nm= id;
       return nm;

    }
    public void thisMethod(){
        inherite();
        System.out.println("a new method");
    }



    public static void main(String[] args) {
        AllExecution all = new AllExecution();
        System.out.println(all.newMethod());
        all.thisMethod();

        //encapsulation

        EncapsulationClass encapsulationClass = new EncapsulationClass();
        encapsulationClass.setFood(73);

        System.out.println(encapsulationClass.getFood());
        encapsulationClass.setCity("ctg");
        System.out.println(encapsulationClass.getCity());



    }
}
