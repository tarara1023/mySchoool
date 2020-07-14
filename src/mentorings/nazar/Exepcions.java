package mentorings.nazar;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exepcions {

    public static void main(String[] args)  {
        FileReader reader = null;
        try{
             reader = new FileReader("");
        }catch (FileNotFoundException e) {
            BufferedReader bufferedReade1 = new BufferedReader(reader);
            e.printStackTrace();
        }
    }
}
