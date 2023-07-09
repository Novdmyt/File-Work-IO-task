package app;
import utils.Constants;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteService {

    public static String writeFile(String myName, String myText){

        try {
            FileOutputStream file = new FileOutputStream(writeFile(myName));
            byte [ ]  byArr = myText.getBytes();
            file.write(byArr, 0, byArr.length);
            System.out.println("Success!");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
                             }
        return myName;
    }
    public static String writeFile(String myName){
        String myFile;
        if(myName.isEmpty()){
            System.out.println("Invalid file name!");
             return myName;
                    }else {
            myFile = Constants.BASE_PATH_IN + myName + ".txt";
        }
        return myFile;
    }

}