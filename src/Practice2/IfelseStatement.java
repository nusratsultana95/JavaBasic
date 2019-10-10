package Practice2;

public class IfelseStatement {
    //if else
    public static void main(String[] args) {
        int a=12;
        if(a<13){
            System.out.println("right");
        }else if(a==14){
            System.out.println("wrong");

        }else{
            System.out.println("nothing");
        }
        int b=10;
        if(b>7 | b<10){
            System.out.println("one should be right");
        }else if(b>9 && b==10){
            System.out.println("this is right");
        }else if(b!=10){
            System.out.println("false");
        }else {
            System.out.println("something else");
        }
    }
}
