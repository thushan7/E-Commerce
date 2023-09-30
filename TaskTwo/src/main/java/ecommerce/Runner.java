package ecommerce;

public class Runner {
    public static void main(String[] args) {
        Product p = new Product();

        System.out.println("set and get product id: 123");
        p.setProductId(123);
        System.out.println("product id: " + p.getProductId());

        System.out.println("set and get product name: book");
        p.setName("book");
        System.out.println("product name: " + p.getName());

        System.out.println("set and get wholesale cost: 5.50");
        p.setCost(5.5);
        System.out.println("wholesale cost: " + p.getCost());

        System.out.println("set taxRate=1.5, should remain 0.13");
        p.setTaxRate(1.5);
        System.out.println("tax rate: " + p.getTaxRate());
        System.out.println("set taxRate=0.2");
        p.setTaxRate(0.2);
        System.out.println("tax rate: " + p.getTaxRate());

        System.out.println("set markup=1.5, should default to 0.25");
        p.setMarkUp(1.5);
        System.out.println("markup: " + p.getMarkupRate());
        System.out.println("set markup=0.5");
        p.setMarkUp(0.5);
        System.out.println("markup: " + p.getMarkupRate());

        System.out.println("get retail price, should be 9.90");
        System.out.println("retail price: " + p.getRetailPrice());

        System.out.println("=========================================");

        ShoppingCart c = new ShoppingCart();

        c.addProduct(p);
        System.out.println("shopping cart with book");
        System.out.println(c);

        Product p2 = new Product();
        p2.setProductId(456);
        p2.setName("book2");
        p2.setCost(7.0);
        p2.setMarkUp(0.5);

        c.addProduct(p2);
        System.out.println("shopping cart with book2 added");
        System.out.println(c);

        c.removeProduct(p);
        System.out.println("shopping cart with book removed");
        System.out.println(c);

        System.out.println("check cart for book, should be false");
        System.out.println(c.hasProduct(p));

        System.out.println("check cart for book2, should be true");
        System.out.println(c.hasProduct(p2));

        System.out.println("before tax price of cart with book added back, should be 18.75");
        c.addProduct(p);
        System.out.println(c.beforeTaxPrice());

        System.out.println("total cart price, should be 22.5");
        System.out.println(c.totalCartPrice());

        System.out.println("cart size, should be 2");
        System.out.println(c.getCartSize());

        System.out.println("checkout function should output total cart price and clear cart");
        System.out.println(c.checkout());
        System.out.println("contents of shopping cart after checkout:");
        System.out.println(c);
    }
}
