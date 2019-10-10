package practice3;

public class EnumData {
    EnumPrac enumPrac;

    public EnumData(EnumPrac enumPrac){
        this.enumPrac=enumPrac;
    }
    public void steps(){
        switch (enumPrac){
            case Mim:
                System.out.println("she is my sister");
                break;
            case Tasin:
                System.out.println("he is my brother");
                break;
            case Hannan:
                System.out.println("he is my husband");
                break;
            case Swadesh:
                System.out.println("he is my brother too");
                break;
                default:
                    System.out.println("thats me");
                    break;
        }
    }
}
