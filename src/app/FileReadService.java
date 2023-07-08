package app;

import utils.Constants;
import java.io.*;
import java.nio.charset.StandardCharsets;
public class FileReadService {
public static void fileRead(String myName){
    String myFile = Constants.BASE_PATH_IN + myName + ".txt";

    try {
        BufferedReader br = new BufferedReader(new InputStreamReader
                (new FileInputStream(myFile),
                        StandardCharsets.UTF_8));
        String nextString;
        while ((nextString = br.readLine()) != null){
            System.out.println(nextString);
        }
    } catch (IOException ex){
               System.out.println(ex.getMessage());
    }

}
}

