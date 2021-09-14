package Book;

public class Book {
    private String author;
    private String title;

    private Book(String bookAuthor, String bookTitle){
        this.author = bookAuthor;
        this.title = bookTitle;
    }



    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
}
