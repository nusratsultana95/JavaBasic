package utility;

import java.io.*;

public class DataReader {
    public static void main(String[] args) {
        //write a file
      // FileWriter fileWriter = new FileWriter("src\\utility\\information.txt")
        try {
            BufferedWriter bufferedWriter= new BufferedWriter(new FileWriter("src\\utility\\information.txt",true));
        bufferedWriter.write("test writing using buffered writer");
        bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public String readMyfile(String filepath){
        String text;
        String a = null;
        try {
            FileReader fileReader= new FileReader(filepath);//filereader is a class
            //filereader + bufferdraeder
            BufferedReader bufferedReader= new BufferedReader(fileReader);// read the file we need help of buffered reader class
            //we have to put this bufferedreader inside because to use filereader object.while this object is inside a try block and you cannot use it outside.
            while ((text=bufferedReader.readLine())!=null){//readline is a method use to read file
                a=text;
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
       return a;

    }
}
