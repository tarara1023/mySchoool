package myextras.program.akinai;

public class Restaurant {
    private String login;
    private String password;
    private int number;
    private String name;
    private String type;
    private String ingredients;
    private double price;
    public Restaurant(String login, String password) {
        this.login = login;
        this.password = password;
    }
    public Restaurant(int number, String type, String name, String ingredients, double price) {
        this.number = number;
        this.name = name;
        this.type = type;
        this.ingredients = ingredients;
        this.price = price;
    }
    public Restaurant(int number, String name, double price) {
        this.number = number;
        this.name = name;
        this.price = price;
    }
    public String getLogin() {
        return login;
    }
    public String getPassword() {
        return password;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    public String getIngredients() {
        return ingredients;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
