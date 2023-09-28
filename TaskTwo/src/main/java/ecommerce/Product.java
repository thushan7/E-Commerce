package ecommerce;

public class Product {
    private int id;
    private String name;
    private double cost;
    private static double taxRate = 0.13;
    private double markup;


    void setProductId(int i) {
        id = i;
    }
    void setName(String n) {
        name = n;
    }
    void setCost(Double c) {
        cost = c.doubleValue();
    }

    double getCost() {
        return cost;
    }

    static void setTaxRate(double t) {
        if (t>=0 && t<=1) {
            taxRate = t;
        }
    }

    void setMarkUp(Double m) {
        if (m.doubleValue()>=0 && m.doubleValue()<=1) {
            markup = m.doubleValue();
        } else {
            markup = 0.25;
        }
    }

    public int getProductId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public double getRetailPrice() {
        double retail = (getCost() * (1 + getMarkupRate())) * (1 + getTaxRate());
        return retail;
    }

    public double getMarkupRate() {
        return markup;
    }

    public String toString() {
        String s = getName() + ": " + String.format("%.2f", getRetailPrice());
        return s;
    }

    public static double getTaxRate() {
        return taxRate;
    }
}
