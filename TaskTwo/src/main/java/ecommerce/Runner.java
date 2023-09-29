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
        System.out.println(c);
    }
}
