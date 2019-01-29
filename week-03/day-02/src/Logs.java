import sun.security.x509.IPAddressName;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Logs {
    public static void main(String[] args) {
        // Read all data from 'log.txt'.
        // Each line represents a log message from a web server
        // Write a function that returns an array with the unique IP adresses.
        // Write a function that returns the GET / POST request ratio.

        String file = "../log.txt";
        returnIPAddresses(file);
    }

    public static String[] returnIPAddresses (String file){
        try {
            Path filePath = Paths.get(file);
            List<String> lines = Files.readAllLines(filePath);
            String[] IpAddresses = new String[lines.size()];

            for (int i = 0; i< lines.size(); i++) {
                String[] splitArray = lines.get(i).split(" ");
                String IpColumn = splitArray[8];
                IpAddresses[i] = IpColumn;
            }
            return IpAddresses;
        } catch (Exception ex){
            return new String[]{};
        }
    }

    public static int returnGetPostRatio (String file){
        try {
            Path filePath = Paths.get(file);
            List<String> lines = Files.readAllLines(filePath);
            List<String> sortedWords = new ArrayList<>();
            List<String> getWord = new ArrayList<>();

            for (int i = 0; i< lines.size(); i++) {
                String[] splitArray = lines.get(i).split(" ");
                String getPostColumn = splitArray[11];
                sortedWords.add(getPostColumn);
                getWord.sort();

            }

        } catch (Exception ex){
        }
    }
}
