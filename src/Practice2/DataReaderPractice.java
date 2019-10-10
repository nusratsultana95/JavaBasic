package Practice2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DataReaderPractice {
    public String method1(String path){

        String x="";
        String a;

        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader= new BufferedReader(fileReader);
            while ((a=bufferedReader.readLine())!=null){
                x=a;
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return x;


    }
}
