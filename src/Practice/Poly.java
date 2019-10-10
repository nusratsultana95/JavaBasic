package Practice;

public class Poly extends NVhfsh {
    public void method(int se,int ee){
        int nn= se+ee;
        System.out.println(nn);
    }
    public void method(int hh,String dd){
        String mm= hh+dd;
        System.out.println(mm);
    }

    @Override
    public void mew() {
        System.out.println("id");

    }

    public static void main(String[] args) {
        Poly poly= new Poly();
        poly.method(10,7);
        poly.method(9," k");
        poly.mew();

    }
}
