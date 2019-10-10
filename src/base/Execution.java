package base;

public class Execution {
    public static void main(String[] args) {
        Car c = new Car();
        c.name= "Benz";
        System.out.println(c.name);
        c.year= 2019;
        c.year= 2018;
        System.out.println(c.year+" "+c.name);
        c.engine= "v8";
        System.out.println(c.engine);

    }
}
