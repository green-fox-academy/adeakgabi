import java.util.*;

public class Matchmaking {
    public static void main(String... args) {
        ArrayList<String> girls = new ArrayList<>(Arrays.asList("Eve", "Ashley", "Claire", "Kat", "Jane"));
        ArrayList<String> boys = new ArrayList<>(Arrays.asList("Joe", "Fred", "Tom", "Todd", "Neef", "Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // If someone has no pair, he/she should be the element of the list too
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

        System.out.println(makingMatches(girls, boys));
    }

    public static ArrayList<String> makingMatches(ArrayList<String> girlsList, ArrayList<String> boysList) {
        ArrayList<String> couples = new ArrayList<>();
        for (int i = 0; i < boysList.size(); i++) {

            if (i < girlsList.size()) {
                couples.add(girlsList.get(i));
                couples.add(boysList.get(i));
            } else {
                couples.add(boysList.get(i));
            }
        }
        return couples;


    }
}