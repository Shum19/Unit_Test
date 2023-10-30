package HW.HW_5.repo;

import HW.HW_5.entity.Contact;

import java.util.*;

public class BookRepository implements IBookRepository {
    private List<Contact> contacts;
    public BookRepository(){
        this.contacts = exampleList();
    }
    public List <Contact> getContacts(){return contacts;}

    @Override
    public void addContact(Contact contact) {
        this.contacts.add(contact);
    }

    @Override
    public void deleteContact(Contact contact) {
        int index = findIndexContact(contact.getName(), contact.getSurname());
        this.contacts.remove(index);
    }

    @Override
    public int findIndexContact(String name, String surname) {
        int index = 0;
        for (int i = 0; i < this.contacts.size(); i++) {
            if (this.contacts.get(i).getName().equalsIgnoreCase(name) &&
                    this.contacts.get(i).getSurname().equalsIgnoreCase(surname)){
                index = i;}
        }
        return index;
    }

    @Override
    public String showContacts() {
        String res = "";
        for (Contact contact : this.contacts) {
            res = res + contact.toString() + "\n";
        }
        return res;
    }

    @Override
    public void changeContact(int index, Contact contact) {
        this.contacts.get(index).setName(contact.getName());
        this.contacts.get(index).setSurname(contact.getSurname());
        this.contacts.get(index).setPhoneNumber(contact.getPhoneNumber());
    }

    public List <Contact> exampleList(){
        List<Contact> testContact = new ArrayList<>();
        String [] surnames = {"Иванов", "Сергеев", "Михайлов","Антонов"};
        String [] names = {"Иван", "Сергей", "Михаил", "Антон"};
        String [] phoneNumbers = {"8911-111-11-11", "8922-222-22-22", "8933-333-33-33", "8944-444-44-44"};
        for (int i = 0; i < names.length; i++) {
            testContact.add(new Contact (names[i], surnames[i], phoneNumbers[i]));
        }
        return testContact;
    }

}
