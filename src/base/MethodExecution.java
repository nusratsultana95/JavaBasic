package base;

public class MethodExecution {
    public static void main(String[] args) {
        MethodPractice m = new MethodPractice();
        m.testMethod1();

        String value = m.testMethodReturn();
        System.out.println(value);
        MethodPractice.newTest();

        String value2 = MethodPractice.country();
        System.out.println(value2);

    }
}
