import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before(){
        book = new Book("Shining", "S.King", "Horror");
    }

    @Test
    public void hasTitle(){
        assertEquals("Shining", book.getTitle());
    }

    @Test
    public void hasGenre(){
        assertEquals("Horror", book.getGenre());
    }
    @Test
    public void hasAuthor(){
        assertEquals("S.King", book.getAuthor());
    }
}
