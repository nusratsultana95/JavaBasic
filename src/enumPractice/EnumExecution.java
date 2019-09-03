package enumPractice;

public class EnumExecution {
    public static void main(String[] args) {
        Weeks weeks= new Weeks(Days.Sunday);//this constructor is only for sunday
        weeks.nextstep();

        //*********************

        Year year= new Year(Months.December);
        year.implement();
        Year year1 = new Year(Months.January);
        year1.implement();
    }
}
