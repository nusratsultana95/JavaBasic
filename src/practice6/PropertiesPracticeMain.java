package practice6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesPracticeMain {
    public Properties getProperties(String filepath){ //we need to create a Properties type method which will return you properties object
        Properties properties=new Properties();
        try {
            InputStream inputStream=new FileInputStream(filepath);
            properties.load(inputStream);//properties is loading filepath
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;

    }
 //   public static void main(String[] args) {
//        //at first we need to call a class cal Properties
//        Properties properties = new Properties();
//
//        //and we need to call another class call InputStream which will take the path of the properties file we just created
//        try {
//            InputStream inputStream= new FileInputStream("src\\practice6\\myfile.properties");
//        //inside the try block we need our object properties and need to feed with inputstream
//            properties.load(inputStream);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) { //this is a inputOutput exception
//            e.printStackTrace();
//        }
//        //now we can print values
//
//        System.out.println(properties.getProperty("user"));
//        System.out.println(properties.getProperty("company"));
//        System.out.println(properties.getProperty("company2"));


//        //what if i want to make it parameterized? make a method!

   // }


}
