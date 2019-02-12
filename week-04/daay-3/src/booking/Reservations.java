package booking;
import java.util.Random;

public class Reservations {
    public static void main(String[] args) {
    Reservations reservations = new Reservations();
        for (int i = 0; i < 10; i++) {
            System.out.println(String.format("%-10s","Booking#") + String.format("%-10s", reservations.getCodeBooking() +
                    String.format("%5s", "for") + String.format("%5s", reservations.getDowBooking()) ));
        }
    }

    public String getDowBooking(){
        String[] dow = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        int randomNum = (int) (Math.random() * 6);
        String randomDow = dow[randomNum];
        return randomDow;
    }

    public String getCodeBooking(){
        Random r = new Random();
        String code = "";
        String alphabet = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < 8; i++) {
            code += alphabet.charAt(r.nextInt(alphabet.length()));
        }
        return code;
    }
}