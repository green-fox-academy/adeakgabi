package clone;

public class Main {
    public static void main(String[] args) {

        Student john = new Student("John Doe", 20, "male", "BME");
        Student johnTheClone = john.clone();
        johnTheClone.introduce();

    }
}
