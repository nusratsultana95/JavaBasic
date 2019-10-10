package mentoring;

import Practice.Poly;

public class PolymorphismExecution extends PolymorphismClass{
    @Override
    public void method01() {
        System.out.println("this is a new method");
    }

    public static void main(String[] args) {
        PolymorphismExecution polymorphismExecution= new PolymorphismExecution();
        polymorphismExecution.method01();
    }
}
