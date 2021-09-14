package Book;

public class Book {
    private String author;
    private String title;
    private int pages;

    public Book(String bookAuthor, String bookTitle ,int bookPages) {
        this.author = bookAuthor;
        this.title = bookTitle;
        this.pages = bookPages;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public void printAutor(){
        System.out.print(author);
    }

    public void printTitle(){
        System.out.print(title);
    }

    public void printDatails(){
        System.out.printf("Author: %s. Title: %s. Pages: %d",author,title,pages);
    }



}


