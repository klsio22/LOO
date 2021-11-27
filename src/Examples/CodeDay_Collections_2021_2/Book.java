package Examples.CodeDay_Collections_2021_2;

import java.util.Objects;

public class Book {// implements Comparable<Book>{
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

//    @Override
//    public int compareTo(Book o) { // negativo (sou menor); 0 (somos iguais); positivo (sou maior)
//        return this.title.compareTo(o.title);
//    }

    @Override
    public boolean equals(Object o) {
        Book other = (Book)o;
        return this.title.equals(other.title); // se comparar com o outro por meio do "title"
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }
}
