package HW.HW_5.listener;

import HW.HW_5.entity.Contact;
import HW.HW_5.PhoneBook;
import HW.HW_5.paneles.PanelAddContact;
import HW.HW_5.paneles.PanelDeleteContact;
import HW.HW_5.paneles.PanelEditContact;
import HW.HW_5.paneles.PanelFindContact;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PhoneBookListener implements ActionListener {
    private PhoneBook phoneBook;
    private PanelAddContact panelAddContact;
    private PanelFindContact panelFindContact;
   private PanelDeleteContact panelDeleteContact;
   private PanelEditContact panelEditContact;
  private int editIndex = 0;



    public PhoneBookListener(PhoneBook phoneBook){
        this.phoneBook = phoneBook;
        this.panelAddContact = new PanelAddContact();
        this.panelFindContact = new PanelFindContact();
        this.panelDeleteContact = new PanelDeleteContact();
        this.panelEditContact = new PanelEditContact();


        panelAddContact.getAddButton().addActionListener(this);
        panelFindContact.getSearchButton().addActionListener(this);
        panelDeleteContact.getDeleteButton().addActionListener(this);
        panelDeleteContact.getEditButton().addActionListener(this);
        panelEditContact.getEditButton().addActionListener(this);
        panelEditContact.getEditButton().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton) e.getSource();

//Панель отоброжения всех контактов
        if(clicked.equals(this.phoneBook.getShowAllContacts())){
            this.phoneBook.getPanelAllContacts().getTextAria().setText(phoneBook.getBookRepository().showContacts());
            this.phoneBook.setContentPane(this.phoneBook.getPanelAllContacts().getScrollPane());
            this.phoneBook.getPanelAllContacts().getScrollPane().setSize(500, 300);
        } else if (clicked.equals(this.phoneBook.getAddContact())) {
            this.phoneBook.setContentPane(panelAddContact.getjPanel());
            panelAddContact.getAddButton().setText("Добавить");
//Панель добавдения котакта
        }else if(clicked.equals(this.panelAddContact.getAddButton())){
            if(!this.panelAddContact.isEmpty()){
                JOptionPane.showMessageDialog(this.panelAddContact, "Вы не ввели данные");
            }else {
                String name = this.panelAddContact.getNameField().getText();
                String surname = this.panelAddContact.getSurnameField().getText();
                String phone = this.panelAddContact.getPhoneNumber().getText();
                Contact contact = new Contact(name, surname, phone);
                this.phoneBook.getBookRepository().addContact(contact);
                this.panelAddContact.getNameField().setText("");
                this.panelAddContact.getSurnameField().setText("");
                this.panelAddContact.getPhoneNumber().setText("");
                JOptionPane.showMessageDialog(this.panelAddContact, "Добавлен " + contact.toString());
            }
// Панель поиска контакта
        }else if(clicked.equals(this.phoneBook.getFindContact())){
            this.phoneBook.setContentPane(this.panelFindContact.getjPanel());

        }else if(clicked.getText().equals("Поиск")){
            if(this.panelFindContact.isEmpty()){
                JOptionPane.showMessageDialog(this.panelDeleteContact,  "Для поиска необходимо вести Имя и Фамилию");
            }else {
                int i;
                String name1 = this.panelFindContact.getNameField().getText();
                String surname1 = this.panelFindContact.getSurnameField().getText();
                i = this.phoneBook.getBookRepository().findIndexContact(name1, surname1);

                JOptionPane.showMessageDialog(this.panelFindContact, "Данные искомого контакта:\n" +
                        this.phoneBook.getBookRepository().getContacts().get(i));
                this.panelFindContact.getNameField().setText("");
                this.panelFindContact.getSurnameField().setText("");
            }
//Панель удаления и редактирования котакта
        }  else if (clicked.equals(this.phoneBook.getDeleteContacts())){
            this.phoneBook.setContentPane(this.panelDeleteContact.getjPanel());

        } else if (clicked.equals(this.panelDeleteContact.getEditButton())){

            String name1 = this.panelDeleteContact.getNameField().getText();
            String surname1 = this.panelDeleteContact.getSurnameField().getText();
            editIndex = this.phoneBook.getBookRepository().findIndexContact(name1, surname1);
            System.out.println(editIndex);
            Contact contact = this.phoneBook.getBookRepository().getContacts().get(editIndex);
            this.panelEditContact.getNameField().setText(contact.getName());
            this.panelEditContact.getSurnameField().setText(contact.getSurname());
            this.panelEditContact.getPhoneNumberField().setText(contact.getPhoneNumber());
            this.phoneBook.setContentPane(this.panelEditContact.getjPanel());
            this.panelDeleteContact.getNameField().setText("");
            this.panelDeleteContact.getSurnameField().setText("");

        } else if (clicked.equals(panelEditContact.getEditButton())) {
            String name1 = this.panelEditContact.getNameField().getText();
            String surname1 = this.panelEditContact.getSurnameField().getText();
            String phoneNumber = this.panelEditContact.getPhoneNumberField().getText();
            Contact contact = new Contact(name1, surname1, phoneNumber);
            System.out.println(editIndex);
            this.phoneBook.getBookRepository().changeContact(editIndex, contact);
            this.phoneBook.getPanelAllContacts().getTextAria().setText(phoneBook.getBookRepository().showContacts());
            this.phoneBook.setContentPane(this.phoneBook.getPanelAllContacts().getScrollPane());

        } else if (clicked.getText().equals("Удалить контакт")){
            if(this.panelDeleteContact.isEmpty()){
                JOptionPane.showMessageDialog(this.panelDeleteContact,  "Для поиска необходимо вести Имя и Фамилию");
            }else {
                int i;
                String name1 = this.panelDeleteContact.getNameField().getText();
                String surname1 = this.panelDeleteContact.getSurnameField().getText();
                i = this.phoneBook.getBookRepository().findIndexContact(name1, surname1);

                JOptionPane.showMessageDialog(this.panelFindContact, "Данные контакта удалены:\n" +
                        this.phoneBook.getBookRepository().getContacts().get(i));
                this.phoneBook.getBookRepository().getContacts().remove(i);
                this.panelDeleteContact.getNameField().setText("");
                this.panelDeleteContact.getSurnameField().setText("");
            }
        }

    }
}
