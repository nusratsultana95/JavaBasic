package newJava;

public class Loops {
    public static void main(String[] args) {
        //for loops
        for(int a=0;a<5;a++){
            System.out.println("*");
        }
        //while loops

        int x=0;
        while(x<4){
            System.out.println("java"+x);
            x++;
    }

        //do while loop
        int y=0;
        do {
            System.out.println("i love java"+y);
            y++;
        }while (y<5);




        //for each loop
        int[] numbers = {10, 11, 12, 13};
        for (int s:numbers) {
            System.out.println(s);
        }

}}


