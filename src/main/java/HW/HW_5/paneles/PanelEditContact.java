package HW.HW_5.paneles;

import javax.swing.*;
import java.awt.*;

public class PanelEditContact {
    private JPanel jPanel;
    private JTextField nameField, surnameField, phoneNumberField;
    private JButton editButton, backButton;
    public  PanelEditContact(){
        JLabel nameL = new JLabel("Имя");
        JLabel surnameL = new JLabel( "Фамиля");
        JLabel phoneNumberL = new JLabel("Номер телефона");


        this.nameField = new JTextField();
        this.surnameField = new JTextField();
        this.phoneNumberField = new JTextField();
        this.editButton = new JButton("Изменить");
        this.backButton = new JButton("Назад");

        this.jPanel = new JPanel();
        this.jPanel.setLayout(new GridLayout(4, 2));



        this.jPanel.add(nameL);
        this.jPanel.add(this.nameField);

        this.jPanel.add(surnameL);
        this.jPanel.add(this.surnameField);

        this.jPanel.add(phoneNumberL);
        this.jPanel.add(phoneNumberField);

        this.jPanel.add(this.backButton);
        this.jPanel.add(this.editButton);
    }
    public JPanel getjPanel(){
        return this.jPanel;
    }
    public JButton getEditButton(){return this.editButton;}
    public JButton getBackButton(){return this.backButton;}

    public JTextField getNameField() {
        return nameField;
    }

    public JTextField getSurnameField() {
        return surnameField;
    }
    public JTextField getPhoneNumberField(){return this.phoneNumberField;}
    public boolean isEmpty(){
        if(this.nameField.getText().equals("") || this.surnameField.getText().equals("")){
            return true;
        }
        return false;
    }
}
