package string;

public class StringCompare {
    public static void main(String[] args) {
        String v ="pnt";
        String v2="pnt2";
        String v3="PNT";
        System.out.println(v.compareTo(v2));
        System.out.println(v.compareToIgnoreCase(v3));//which case(upper/lower>> like sql)

        //ends/starts with
        System.out.println(v.startsWith("d"));
        System.out.println(v.endsWith("t"));

        //replace

        System.out.println(v.replace('n','&'));

        //upper&lower
        System.out.println(v.toLowerCase());
    }
}
