package AbstractClasses;

/**
 *
 * @author hrishimane
 */
class MyBook extends Book {

    private int price;

    public MyBook(String title, String author, int price) {
        super(title, author);
        this.price = price;

    }
    
    @Override
    void display() {
        System.out.println("Title: " + super.title);
        System.out.println("Author: " + super.author);
        System.out.println("Price: " + this.price);

    }

}
