package Practice;

public class MainClass extends AbstractionClass implements InterfaceC {
    @Override
    public void spicy() {
        super.spicy();
        System.out.println("new spicy");
    }

    @Override
    public void sweet() {
        System.out.println("its sweet");
    }

    @Override
    public void sour() {
        System.out.println("its sour");

    }
}
