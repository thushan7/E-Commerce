package ecommerce;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Product> cart;


    public void addProduct(Product p) {
        cart.add(p);
    }

    public void removeProduct(Product p) {
        cart.remove(p);
    }

    public boolean hasProduct(Product p) {
        return cart.contains(p);
    }

    public double totalCartPrice() {
        double total = 0;
        for (Product p : cart) {
            total += p.getRetailPrice();
        }
        return total;
    }

    public double beforeTaxPrice() {
        double total = 0;
        for (Product p : cart) {
            total += p.getCost() * (1 + p.getMarkupRate());
        }
        return total;
    }

    public double checkout() {
        double total = totalCartPrice();
        cart.clear();
        return total;
    }

    public int getCartSize() {
        return cart.size();
    }

    public String toString() {
        String s = "";
        for (Product p : cart) {
            s += p.toString() + "\n";
        }
        return s;
    }
}
