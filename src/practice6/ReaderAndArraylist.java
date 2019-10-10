package practice6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderAndArraylist {

    public  String methodReader(String filepath){
        String x=null;
        String a;

        FileReader fileReader;
        try {
            fileReader = new FileReader(filepath);
            BufferedReader bufferedReader= new BufferedReader(fileReader);
            while ((a=bufferedReader.readLine())!=null){
                x=a;
            }fileReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return x;

    }
}
