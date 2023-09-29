package book;

public class Runner {
    public static void main(String[] args) {
        Book b = new Book();

        System.out.println("set and get title: 1984");
        b.setTitle("1984");
        System.out.println("title: " + b.getTitle());

        System.out.println("set and get author: George Orwell");
        b.setAuthor("George Orwell");
        System.out.println("author: " + b.getAuthor());

        System.out.println("toString() method should output: 1984: George Orwell");
        System.out.println(b);

        System.out.println("set and get borrowed status: true");
        b.setBorrowed(true);
        System.out.println(b.isBorrowed());

        System.out.println("try to borrow, should output empty string");
        System.out.println(b.borrow());

        System.out.println("return book, should output true");
        System.out.println(b.giveBack());

        System.out.println("try to return, should output false");
        System.out.println(b.giveBack());

        System.out.println("borrow book, should output title");
        System.out.println(b.borrow());
    }
}
