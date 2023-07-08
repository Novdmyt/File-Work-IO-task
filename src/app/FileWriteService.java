package app;
import utils.Constants;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteService {

    public static void writeFile(String myName, String myText){
        String myFile;
        if(myName.isEmpty()){
            System.out.println("Invalid file name!");
            return;
        }else {
         myFile = Constants.BASE_PATH_IN + myName + ".txt";
        }
        try {
            FileOutputStream file = new FileOutputStream(myFile);
            byte [ ]  byArr = myText.getBytes();
            file.write(byArr, 0, byArr.length);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
           System.exit(0);
                    }
        System.out.println("Success!");
    }

}