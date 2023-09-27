package book;

public class Book {
    private String title;
    private String author;
    private boolean borrowed;


    void setTitle(String t) {
        title = t;
    }
    void setAuthor(String a) {
        author = a;
    }
    void setBorrowed(boolean b) {
        borrowed = b;
    }


    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public boolean isBorrowed() {
        return borrowed;
    }


    public String borrow() {
        if (isBorrowed()) {
            return "";
        } else {
            setBorrowed(true);
            return getTitle();
        }
    }
    public boolean giveBack() {
        if (isBorrowed()) {
            setBorrowed(false);
            return true;
        } else {
            return false;
        }
    }
    public String toString() {
        String s = getTitle() + ": " + getAuthor();
        return s;
    }
}
