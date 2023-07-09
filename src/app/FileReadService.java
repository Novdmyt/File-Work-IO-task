package app;

import utils.Constants;
import java.io.*;
import java.nio.charset.StandardCharsets;
public class FileReadService {
public static String  fileRead(String myName) {
    String myFile = Constants.BASE_PATH_IN + myName + ".txt";

   String nextString = " ";
    try {
        BufferedReader br = new BufferedReader(new InputStreamReader
                (new FileInputStream(myFile),
                        StandardCharsets.UTF_8));
        while ((nextString = br.readLine()) != null) {
            System.out.println(nextString);
        }
    } catch (IOException ex) {
        System.out.println(ex.getMessage());
    }
    return nextString;

}
}

