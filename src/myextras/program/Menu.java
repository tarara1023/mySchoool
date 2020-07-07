package myextras.program;

import java.util.List;

public class Menu {


    private String name;
    private String ingredients;
    private double price;
    int number;
    String type;

    @Override
    public String toString() {
        return "Menu{" +
                "name='" + name + '\'' +
                ", ingredients='" + ingredients + '\'' +
                ", price=" + price +
                '}';
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Menu (int number, String  type, String name, String ingredients, double price) {
        this.name = name;
        this.ingredients = ingredients;
        this.price = price;
        this.number = number;
        this.type = type;
    }

    public Menu(int number, String name, double price) {
        this.number = number;
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price > 0)
            this.price = price;
    }




}
