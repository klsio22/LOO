package Book;

import java.util.Objects;
import java.util.logging.ErrorManager;

public class Book {
    private String author;
    private String title;
    private int pages;
    private String numReference;
    private String erro = "";

    public Book(String bookAuthor, String bookTitle, int bookPages) {
        this.author = bookAuthor;
        this.title = bookTitle;
        this.pages = bookPages;
        this.numReference = "";
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

    public void printAutor() {
        System.out.print(author);
    }

    public void printTitle() {
        System.out.print(title);
    }

    public void setNumReference(String ref) {
        if (ref.length() >= 3)
            this.numReference = ref;
    }

    public void printDatails() {
        if (numReference.length() != 0)
            System.out.printf("\nAuthor: %s. Title: %s. Pages: %d\n",
                    author, title, pages);
        else
            System.out.println("\nZZZ\n");


    }

}


