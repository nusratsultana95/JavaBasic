package practice3;

public class Enum02data {
    Enum02 enum02;
    public Enum02data(Enum02 enum02){
        this.enum02=enum02;
    }
    public void en02(){
        switch (enum02){
            case MK:
                System.out.println("expensive");
                break;
                default:
                    System.out.println("random");
                    break;
        }

    }
}
