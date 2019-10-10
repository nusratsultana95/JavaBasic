package mentoring;

public class EnumData01 {
    EnumMentoring enumMentoring;

    public EnumData01(EnumMentoring enumMentoring){
        this.enumMentoring= enumMentoring;

    }
    public void testmethod(){
        switch (enumMentoring){
            case TASIN:
                System.out.println("he is a brother of mine");
                break;

            case HANNAN:
                System.out.println("he is my husband");
                break;
                default:
                    System.out.println("random relatives");
        }
    }
}
