package Practice2;

import java.io.*;

public class BufferedWriterPractice {
    public static void main(String[] args) {
        WriterMethod("src\\Practice2\\practiceFile.txt","something");
    }
    //write file
   // FileWriter fileWriter = new FileWriter("src\\Practice2\\practicefile2.txt");
  public static void WriterMethod(String locator,String value){
        BufferedWriter bufferedWriter;
        try {
              bufferedWriter = new BufferedWriter(new FileWriter(locator,true));
              //bufferedWriter.write("this is pnt");
               bufferedWriter.write(value);
              bufferedWriter.close();
          } catch (IOException e) {
              e.printStackTrace();
          }
     }
            //buffuredreader

    public String buffMethod(String location){
        String files;
        String newfile= null;
        try {
            FileReader fileReader = new FileReader(location);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while((files=bufferedReader.readLine())!=null){
                newfile=files;
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
       return newfile;
    }
}
