package practice6;

import java.util.Properties;

public class PropertiesValues {
    public static void main(String[] args) {
        PropertiesPracticeMain propertiesPracticeMain = new PropertiesPracticeMain();
        Properties properties=propertiesPracticeMain.getProperties("src\\practice6\\myfile.properties");
     //we are returning this properties object and already being initialized in other class
    //and getproperties()is going to return all the properties(values).

        System.out.println(properties.getProperty("user"));
        System.out.println(properties.getProperty("company"));
        System.out.println(properties.getProperty("company2"));

        //adding new file

        Properties properties1=propertiesPracticeMain.getProperties("src\\practice6\\newfile.properties");
        System.out.println(properties1.getProperty("server"));
        System.out.println(properties1.getProperty("newUser"));

    }

}
