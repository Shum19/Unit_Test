package fifth.hw;

import HW.HW_5.entity.Contact;
import HW.HW_5.repo.BookRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookRepositoryTest {
    BookRepository bookRepository = new BookRepository();
    Contact testContact = new Contact("ИВан", "ИваноВ","8911-111-11-11");
    @Test
    public void findIndexContactTest(){
        assertEquals(0, bookRepository.findIndexContact(testContact.getName(), testContact.getSurname()));
    }

    @Test
    public void addContactTest(){
        int expect = this.bookRepository.getContacts().size();
        this.bookRepository.addContact(testContact);
        int act = this.bookRepository.getContacts().size();
        assertEquals(expect+1, act);
    }

    @Test
    public void deleteContactTest(){
        int expect = this.bookRepository.getContacts().size();
        this.bookRepository.deleteContact(testContact);
        int act = this.bookRepository.getContacts().size();
        assertEquals(expect-1, act);
    }

    @Test
    public void changeContact(){
        int i = this.bookRepository.findIndexContact(testContact.getName(), testContact.getSurname());
        this.bookRepository.changeContact(i, testContact);
        assertEquals(testContact.getName(), this.bookRepository.getContacts().get(i).getName());
        assertEquals(testContact.getSurname(), this.bookRepository.getContacts().get(i).getSurname());
        assertEquals(testContact.getPhoneNumber(), this.bookRepository.getContacts().get(i).getPhoneNumber());
    }

}
