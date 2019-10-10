package Practice2;

public class DataReaderExecution {
    public static void main(String[] args) {
        DataReaderPractice dataReaderPractice = new DataReaderPractice();
        String newpath = dataReaderPractice.method1("src\\Practice2\\newfile.txt");
        System.out.println(newpath);
        //*******************
        //new class

        DataReaderPractice2 dataReaderPractice2 = new DataReaderPractice2();
       //String path=dataReaderPractice2.readermethod("src\\Practice2\\newfile.txt");
        //System.out.println(path);  //here i couldnt print path.i only could print empty.
         dataReaderPractice2.readermethod("src\\Practice2\\newfile.txt");

    }
}
