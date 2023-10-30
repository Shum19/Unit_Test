package HW.HW_5;

import HW.HW_5.listener.PhoneBookListener;
import HW.HW_5.paneles.PanelAddContact;
import HW.HW_5.paneles.PanelAllContacts;
import HW.HW_5.paneles.PanelEditContact;
import HW.HW_5.paneles.PanelFindContact;
import HW.HW_5.repo.BookRepository;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class PhoneBook extends JFrame {

    private JMenuBar optionBar;
    private JButton showAllContacts, addContact, findContact, deleteContacts, editButton;
    private PanelAllContacts allContacts = new PanelAllContacts();
    private BookRepository bookRepository;





    public PhoneBook(){
        super("Phone Book");
        this.bookRepository = new BookRepository();
        this.optionBar = new JMenuBar();

        FlowLayout fl = new FlowLayout();
        this.setLayout(fl);






        this.showAllContacts = new JButton("Показать все контакты");
        this.addContact = new JButton("Добавить контакт");
        this.findContact = new JButton("Найти контакт");
        this.deleteContacts = new JButton("Удалить контакт/Редактировать котакт");




        this.optionBar.add(this.showAllContacts);
        this.optionBar.add(this.addContact);
        this.optionBar.add(this.findContact);
        this.optionBar.add(this.deleteContacts);



        super.setJMenuBar(this.optionBar);
        this.allContacts.getTextAria().setText(this.bookRepository.showContacts());
        super.setContentPane(this.allContacts.getScrollPane());
        ActionListener myLis = new PhoneBookListener(this);



        this.showAllContacts.addActionListener(myLis);
        this.addContact.addActionListener(myLis);
        this.findContact.addActionListener(myLis);
        this.deleteContacts.addActionListener(myLis);



    }

    public JMenuBar getOptionBar() {
        return optionBar;
    }
    public JButton getShowAllContacts(){return this.showAllContacts;}

    public JButton getAddContact() {
        return this.addContact;
    }

    public JButton getFindContact() {
        return this.findContact;
    }

    public JButton getDeleteContacts() {
        return this.deleteContacts;
    }
    public BookRepository getBookRepository(){
        return this.bookRepository;
    }

    public PanelAllContacts getPanelAllContacts() {
        return allContacts;
    }



}
