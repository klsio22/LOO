package Book;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestBook {
    private Book book;

    @BeforeEach
    public void beforeTestes() {
        book = new Book("J.K.Rowling",
                "Harry Potter and the Philosopher's Stone" , 265);
    }

    @Test
    public void knowBooksExistedAndAuthor() {
        assertEquals("J.K.Rowling", book.getAuthor());
        assertEquals("Harry Potter and the Philosopher's Stone",book.getTitle());
        assertEquals(265,book.getPages());
    }

    @Test
    public void mustShowAuthor(){
        book.printAutor();
    }

    @Test
    public void mustShowTitle(){
        book.printTitle();
    }

    @Test
    public void mustShowDetails(){
        book.printDatails();
    }






}
