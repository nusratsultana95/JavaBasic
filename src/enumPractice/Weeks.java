package enumPractice;

public class Weeks {
    Days days;
    public Weeks(Days days){ //this is a parameterized/customized constructor
        this.days= days;
    }
    public void nextstep(){//inside the method we have use switch statement
        //everytime u use switch statement u have to use case
        switch (days) { //means>> switch to the days enum
            case Friday:
                System.out.println("working days");
                break;  // break is a keyword.while using, next line will not get executed until you tell the program.
            case Monday:
                System.out.println("another day of work");
                break;
            case Sunday:
            case Tuesday:
            case Saturday:
            case Thursday:
            case Wednesday:
                break;
                default:// none of them work default will work
                    System.out.println("today is holiday");
                    break;

        }}
}
