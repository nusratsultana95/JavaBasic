package Practice;

public class Xyz extends PolumorphismClass {
    @Override
    public void yess() {
        System.out.println("new testing");
    }

    public static void main(String[] args) {
        Abc abc = new Abc();
        abc.setName("nusrat");
        System.out.println(abc.getName());
        abc.setRoll(200);
        System.out.println(abc.getRoll());
        Xyz xyz = new Xyz();
        xyz.yess();




    }
}
