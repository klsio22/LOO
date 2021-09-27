package Exercises.Book;

public class Book {
    private String author,title,numReference;
    private int pages, borrowed;

    public Book(String bookAuthor, String bookTitle, int bookPages) {
        this.author = bookAuthor;
        this.title = bookTitle;
        this.pages = bookPages;
        this.numReference = "";
    }

    public void loan() {
        this.borrowed++;
    }

    public int getBorrowed() {
        return borrowed;
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
            numReference = ref;
        else
            numReference = "";
    }

    public void printDatails() {
        if (numReference.length() != 0)
            System.out.printf("\nAuthor: %s.\n" +
                            "Title: %s.\n" +
                            "Pages: %d\n" +
                            "Emprestimo(s): %d.\n",
                    author, title, pages, borrowed);
        else {
            System.out.print("Erro de referência");
            System.out.println("\nZZZ\n");
        }
    }

}


