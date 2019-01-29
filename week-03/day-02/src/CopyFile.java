import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) {
        // Write a function that copies a file to an other
        // It should take the filenames as parameters
        // It should return a boolean that shows if the copy was successful

     String file1 = "../text.txt";
     String file2 = "../anotherfile.txt";
        System.out.println(copyOnFileToAnother(file1,file2));
    }

    public static Boolean copyOnFileToAnother (String fileA, String fileB){
        try {
            Path pathOfFileA = Paths.get(fileA);
            List<String> linesInMyFile1 = Files.readAllLines(pathOfFileA);
            Path pathOfFileB = Paths.get(fileB);
            Files.write(pathOfFileB, linesInMyFile1);

        } catch (Exception ex){
            return false;
        }
    return true;
    }
}
