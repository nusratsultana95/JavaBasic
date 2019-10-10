package Practice2;

public class BufferedExecution {
    public static void main(String[] args) {
        BufferedWriterPractice bufferedWriterPractice = new BufferedWriterPractice();
        String newvalue = bufferedWriterPractice.buffMethod("src\\Practice2\\practicefile2.txt");
        System.out.println(newvalue);


    }
}