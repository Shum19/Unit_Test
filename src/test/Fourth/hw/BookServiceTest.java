package Fourth.hw;

import HW.HW_4.book.Book;
import HW.HW_4.book.BookRepository;
import HW.HW_4.book.BookService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;


import static org.mockito.Mockito.*;


public class BookServiceTest {



    @Test
    public void bookServiceFindByIdTest(){
        Book book = new Book("1", "HJ", "djfas");
        BookRepository mockedBookRepository = mock(BookRepository.class);
        when(mockedBookRepository.findById("1")).thenReturn(book);
        BookService bookService = new BookService(mockedBookRepository);
        assertEquals(bookService.findBookById("1"), book);
    }
    @Test
    public void bookServiceFindAllTest(){
        BookRepository mockedBookRepository = mock(BookRepository.class);
        when(mockedBookRepository.findAll()).thenReturn(new ArrayList<>());
        BookService bookService = new BookService(mockedBookRepository);
        assertEquals(bookService.findAllBooks(), new ArrayList<>());
    }
}
