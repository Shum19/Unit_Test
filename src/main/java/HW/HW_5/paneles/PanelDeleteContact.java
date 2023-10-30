package HW.HW_5.paneles;

import javax.swing.*;
import java.awt.*;

public class PanelDeleteContact extends JPanel {
    private JPanel jPanel;
    private JTextField nameField, surnameField;
    private JButton deleteButton, editButton ;
    public  PanelDeleteContact(){
        JLabel nameL = new JLabel("Имя");
        JLabel surnameL = new JLabel( "Фамиля");


        this.nameField = new JTextField();
        this.surnameField = new JTextField();
        this.deleteButton = new JButton("Удалить контакт");
        this.editButton = new JButton("Редактировать котакт");

        this.jPanel = new JPanel();
        this.jPanel.setLayout(new GridLayout(3, 2));



        this.jPanel.add(nameL);
        this.jPanel.add(this.nameField);

        this.jPanel.add(surnameL);
        this.jPanel.add(this.surnameField);

        this.jPanel.add(this.editButton);
        this.jPanel.add(this.deleteButton);
    }
    public JPanel getjPanel(){
        return this.jPanel;
    }
    public JButton getDeleteButton(){return this.deleteButton;}
    public JButton getEditButton(){return this.editButton;}

    public JTextField getNameField() {
        return nameField;
    }

    public JTextField getSurnameField() {
        return surnameField;
    }
    public boolean isEmpty(){
        if(this.nameField.getText().equals("") || this.surnameField.getText().equals("")){
            return true;
        }
        return false;
    }
}
