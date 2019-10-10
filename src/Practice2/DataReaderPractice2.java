package Practice2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DataReaderPractice2 {
    public String readermethod(String readerpath) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        String empty = "";

        try {
            fileReader = new FileReader(readerpath);
            bufferedReader = new BufferedReader(fileReader);
            while (true) {
                if ((empty = bufferedReader.readLine()) == null)
                    break;
                System.out.println(empty);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                bufferedReader = null;

            }
            if (fileReader != null) {
                fileReader = null;
            }

        }
        return empty;

    }

}
