package enumPractice;

public class Year {

    Months months;
    public Year(Months months){
        this.months=months;
    }
    public void implement(){
        switch (months){
            case January:
                System.out.println("this is january");
                break;
            case February:
                System.out.println("this is february");
                break;
            case May:
            case July:
            case June:
            case April:
            case March:
                break;
                default:
                    System.out.println("random months");
                    break;
        }

    }
}
