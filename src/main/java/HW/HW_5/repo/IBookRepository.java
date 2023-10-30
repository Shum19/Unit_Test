package HW.HW_5.repo;

import HW.HW_5.entity.Contact;

public interface IBookRepository {
    void addContact(Contact contact);
    void deleteContact(Contact contact);
    int findIndexContact(String name, String surname);
    String showContacts();
    void changeContact(int index, Contact contact);

}
