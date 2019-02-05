import sun.security.x509.IPAddressName;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Logs {
    public static void main(String[] args) {
        // Read all data from 'log.txt'.
        // Each line represents a log message from a web server
        // Write a function that returns an array with the unique IP adresses.
        // Write a function that returns the GET / POST request ratio.

        String file = "../log.txt";
        returnIPAddresses(file);
        returnGetPostRatio(file);
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
            List <String> getPostColumn = new ArrayList<>();
            List<String> getWord = new ArrayList<>();
            int numberOfGetWords = 0;
            int numberOfPostWords = 0;
            int ratio;

            for (int i = 0; i< lines.size(); i++) {
                String[] splitArray = lines.get(i).split(" ");
                getPostColumn.add(splitArray[11]);
                Collections.sort(getPostColumn);
            }
            for (int i = 0; i < getPostColumn.size(); i++) {
                if(getPostColumn.equals("get")) {
                    numberOfGetWords += 1;
                } else {
                    numberOfPostWords += 1;
                }
            }
            ratio = numberOfGetWords/numberOfPostWords;
            return ratio;

        } catch (Exception ex){
            return 0;
        }
    }
}
