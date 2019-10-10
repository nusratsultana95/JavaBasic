package Practice;

public class PolumorphismClass extends InheritanceClass{
    public static int   water(int d, int c){
        int aa = d+c;
        return aa;
    }
    public static String water(int a, String b){
        return a+b;
    }
    public void yess(){
        System.out.println("testing");
    }

    @Override
    public void inherite() {
        System.out.println("nope");
    }

    public static void main(String[] args) {
        System.out.println(water(100,200));
        System.out.println(water(10," no"));
        PolumorphismClass polumorphismClass= new PolumorphismClass();
        polumorphismClass.inherite();
    }
}
