package gabi.deak.basicwebshop.model;

public class ShopItem implements Comparable<ShopItem> {

    private String name;
    private String description;
    private double price;
    private int quantityOfStock;

    public ShopItem (String name, String description, double price, int quantityOfStock){
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantityOfStock = quantityOfStock;
    }

    public String getName(){
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }

    public double getPrice(){
        return this.price;
    }

    public int getQuantityOfStock(){
        return this.quantityOfStock;
    }

    @Override
    public int compareTo(ShopItem item) {
        return Integer.compare((int)this.price,(int)item.getPrice());

    }
}
