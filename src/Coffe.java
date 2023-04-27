import java.util.Scanner;

class Coffe {
    private String name;
    private double price;
    private int water;
    private int milk;
    private int beans;

    public Coffe(String name, double price, int water, int milk, int beans) {
        this.name = name;
        this.price = price;
        this.water = water;
        this.milk = milk;
        this.beans = beans;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getWater() {
        return water;
    }

    public int getMilk() {
        return milk;
    }

    public int getBeans() {
        return beans;
    }
}