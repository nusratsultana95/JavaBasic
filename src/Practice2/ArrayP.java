package Practice2;

public class ArrayP {
    public static void main(String[] args) {
        int num[]= {10,20,30,40};
        System.out.println(num.length);
        for(int j:num){
            System.out.println(j);
        }
        String city[]={"la","tampa","ny"};
        for(int s=0;s<city.length;s++){
            System.out.println(city[s]);
        }
        int count []={100,200,300,400};
        System.out.println(count[2]);
        for(int t=0;t<count.length;t++){
            System.out.println(count[t]);
        }


    }
}
