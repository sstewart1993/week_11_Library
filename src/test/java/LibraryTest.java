import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;

    @Before
    public void before(){
        library = new Library(3);
        book1 = new Book("Shining", "S.King", "Horror");
        book2 = new Book("Lord of the Rings", "J. R. R. Tolkien", "fantasy");
        book3 = new Book("Harry Potter", "J K Rowling", "fantasy");
        library.addBook(book1);
    }

    @Test
    public void canAddBook(){
        assertEquals(1, library.bookCount());
        library.addBook(book1);
        assertEquals(2, library.bookCount());
    }

    @Test
    public void canRemoveBook(){
        assertEquals(1, library.bookCount());
        library.removeBook(book1);
        assertEquals(0, library.bookCount());
    }

    @Test
    public void hasCapacity(){
        assertEquals(3, library.getCapacity());
    }

    @Test
    public void hasBooks() {
        assertEquals(true, library.getBooks().contains(book1));
    }

    @Test
    public void canAddBookIfEnoughCapacity(){
        assertEquals(1, library.bookCount());
        library.addBook(book3);
        library.addBook(book2);
        assertEquals(3, library.bookCount());
        library.addBook(book1);
        assertEquals(3, library.bookCount());
    }
}
