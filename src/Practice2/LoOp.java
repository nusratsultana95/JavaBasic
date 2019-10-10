package Practice2;

public class LoOp {
    public static void main(String[] args) {
        //for loop
        for(int a=0;a<5;a++){
            System.out.println("Bangladseh"+a);
        }
        //while loop

        int b= 5;
        while(b<6){
            System.out.println("print"+b);
            b++;
        }
        int c=1;
        while (c<7){
            System.out.println("while loop"+" "+c);
            c++;
        }
        //do while
        int x=0;
        do{
            System.out.println("do while");
            x++;
        }while(x<5);


        int y=0;
        do{
            System.out.println("do while 2");
            y++;
        }while(y<6);
        
        
        //for each loop

        int id[]= {1,2,3,4,5};
        for(int d:id){
            System.out.println(d);
        }

        String name []={"nusrat","hanan","tasin","swadesh"};
        for(String h:name){
            System.out.println("names are :"+" "+h.length());
        }
        //inner loop

        for(int i=0;i<6;i++){
            System.out.println("out"+i);
            for(int o=0;o<2;o++){
                System.out.println("in"+o);
            }
        }


        for(int e=0;e<4;e++){
            System.out.println("nusrat"+e);
            for(int w=0;w<3;w++){
                System.out.println("hannan"+w);
            }
        }
            


    }
}
