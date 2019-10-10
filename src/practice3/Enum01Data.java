package practice3;

public class Enum01Data {
    Enum01 enum01;
    public Enum01Data(Enum01 enum01){
        this.enum01=enum01;
    }
    public void Enm(){
        switch (enum01){
            case Bank:
                System.out.println("It's open 5 days a week");
                break;
            case School:
                System.out.println("It is also open 5 days a week");
                break;
            case Hospital:
                System.out.println("It is open 7 days a week");
                break;
                default:
                    System.out.println("They run on their own schedule");
                    break;

        }

    }
}
