package Exercises.Book;

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

    @Test
    public void mustShowIfNumReferenceSetting(){
        book.setNumReference("pOP");
        book.printDatails();

    }

    @Test
    public void mustShowErroCaseReferenceNotExist(){
        book.setNumReference("");
        book.printDatails();
    }

    @Test
    public void mustShowLoanNumber(){
        book.setNumReference("PPP");

        book.loan();
        book.loan();
        book.loan();
        book.printDatails();
        assertEquals(3,book.getBorrowed());

    }


}
