package string;

public class StringConvert {
    public static void main(String[] args) {
        //String------>decimal,boolean,float,integer(use valueOf)
        //using Integer.valueOf(..)
        String a="10";
        Integer b = Integer.valueOf(a);
        System.out.println(b);


        //String>>>Float

        String j = "3.16";
         Float fl = Float.valueOf(j);
        System.out.println(fl);

        //String>>>Boolean

        String n ="true";
        Boolean bl = Boolean.valueOf(n);
        System.out.println(bl);

        //using Integer.parseInt()

        int c = Integer.parseInt(a);
        System.out.println(c);

        //
        String x = "12A"; //when u have 12A this will show exception but if u say 12 it will run.
        try {
            Integer y = Integer.valueOf(x);
            System.out.println(y);
        }catch (NumberFormatException ee){
            System.out.println("NumberFormatException occured");
        }
        //printstacktrace>>>to track exception quickly

    }
}
