package newJava;

public class ArrayPractise {
    public static void main(String[] args) {
        String[] name = {"nusrat", "sultana", "ali", "hannan"};
        System.out.println(name[0]);
        System.out.println(name.length);


        for (int a = 0; a < name.length; a++) {
            System.out.println(name[a]);
        }
        int[] number = {10, 11, 12, 13};
        Object[] objectarray = {"xyz", 20};
        System.out.println(number[3]);
        for (int b = 0; b < objectarray.length; b++) {
            System.out.println(objectarray[b]);
        }
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }

        //inner for loop
        for (int x = 0; x < 5; x++) {
            System.out.println("selenium" + x);
            for (int n = 0; n < 3; n++) {
                System.out.println("java" + n);
            }
        }





    }
}
