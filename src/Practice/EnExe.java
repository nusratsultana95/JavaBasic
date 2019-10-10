package Practice;

public class EnExe extends Abstrac implements InterF{
    @Override
    public void play() {
        super.play();
        System.out.println("new games");
    }

    @Override
    public void walk() {
        System.out.println("i can walk");
    }

    @Override
    public void eat() {
        System.out.println("i want to eat food");

    }

    @Override
    public void sleep() {
        System.out.println("i want to sleep");

    }

    public static void main(String[] args) {
        EnExe enExe = new EnExe();
        enExe.play();
        enExe.play();
        enExe.eat();
        enExe.sleep();
        enExe.walk();
        Test test= new Test();
        test.walk();
        //encapsulation
        En en= new En();
        en.setKeys(12);
        System.out.println(en.getKeys());
        en.setNames("owner");
        System.out.println(en.getNames());

    }


}
