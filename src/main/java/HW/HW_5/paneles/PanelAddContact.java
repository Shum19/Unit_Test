package HW.HW_5.paneles;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class PanelAddContact extends JPanel {
    private JPanel jPanel;
    private JTextField nameField;
    private JTextField surnameField;
    private JTextField phoneNumber;
    private JButton addButton;
    public  PanelAddContact(){
        JLabel nameL = new JLabel("Имя");
        JLabel surnameL = new JLabel( "Фамиля");
        JLabel phoneNumberL = new JLabel("Номер телефона");

        this.nameField = new JTextField();
        this.surnameField = new JTextField();
        this.phoneNumber = new JTextField();
        this.addButton = new JButton("Добавить");

        this.jPanel = new JPanel();
        this.jPanel.setLayout(new GridLayout(4, 2));

        this.jPanel.add(nameL);
        this.jPanel.add(this.nameField);

        this.jPanel.add(surnameL);
        this.jPanel.add(this.surnameField);

        this.jPanel.add(phoneNumberL);
        this.jPanel.add(this.phoneNumber);

        this.jPanel.add(this.addButton);

    }
    public boolean isEmpty(){
        if(this.nameField.getText().equals("") && this.surnameField.getText().equals("") &&
                this.phoneNumber.getText().equals("")){
            return false;
        }
        return true;
    }
    public JPanel getjPanel(){
        return this.jPanel;
    }
    public JButton getAddButton(){return this.addButton;}

    public JTextField getNameField() {
        return nameField;
    }

    public JTextField getSurnameField() {
        return surnameField;
    }

    public JTextField getPhoneNumber() {
        return phoneNumber;
    }
}
