package practice4;

public class Array01 {
    public static void main(String[] args) {
        int num []={1,2,3,4,5};
        System.out.println(num[0]);
        System.out.println(num.length);
        System.out.println(num.clone());
        int[] id =new int[4];
        id[0]=10;
        id[1]=11;
        id[2]=12;
        id[3]=14;
        System.out.println(id[3]);
        int[] arraynew= id.clone();
        System.out.println(arraynew.length);
        for(int b:arraynew){
            System.out.println(b);
        }

        for(int x=0;x<arraynew.length;x++){
            System.out.println(arraynew[x]);
        }

    }
}
