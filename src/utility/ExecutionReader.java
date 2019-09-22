package utility;

public class ExecutionReader {
    public static void main(String[] args) {
        DataReader dataReader= new DataReader();
        String value=dataReader.readMyfile("src\\utility\\text.txt");
        System.out.println(value);
        String value2 = dataReader.readMyfile("src\\utility\\information.txt");
        System.out.println(value2);


    }
}
