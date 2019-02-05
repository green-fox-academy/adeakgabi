package sharpieset;

public class Sharpie {
    String color;
    double width;
    double inkAmount;

    public Sharpie(String color, double width, double inkAmount) {
        this.color = color;
        this.width = width;
        this.inkAmount = inkAmount;
    }

    public void use() {
        inkAmount--;
    }
}
