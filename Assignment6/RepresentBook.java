package Assignment6;

class Book{
    int bookId;
    String title;
    double price;
    String author;

    void setBookId(int id){
        bookId = id;
    }
    void setTitle(String title){
        this.title = title;
    }
    void setPrice(double price){
        this.price= price;
    }
    void seAuthor(String author){
        this.author=author;
    }

    void getBookId(){
        System.out.println("Book id = "+bookId);
    }
    void getTitle(){
        System.out.println("Book title = "+title);
    }
    void getPrice(){
        System.out.println("Book Price = "+price);
    }
    void getAuthor(){
        System.out.println("Book Author = "+author);
    }
}

public class RepresentBook {
    public static void main(String []argu){
        Book obj = new Book();

        obj.setBookId(78);
        obj.setTitle("My Life");
        obj.setPrice(25000.00);
        obj.seAuthor("Chandrabhan");

        obj.getBookId();
        obj.getTitle();
        obj.getPrice();
        obj.getAuthor();
    }
    
}
