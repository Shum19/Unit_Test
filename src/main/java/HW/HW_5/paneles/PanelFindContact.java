package HW.HW_5.paneles;

import javax.swing.*;
import java.awt.*;

public class PanelFindContact extends JPanel {
    private JPanel jPanel;
    private JTextField nameField;
    private JTextField surnameField;
    private JButton searchButton;
    public  PanelFindContact(){
        JLabel nameL = new JLabel("Имя");
        JLabel surnameL = new JLabel( "Фамиля");


        this.nameField = new JTextField();
        this.surnameField = new JTextField();
        this.searchButton = new JButton("Поиск");

        this.jPanel = new JPanel();
        this.jPanel.setLayout(new GridLayout(3, 2));



        this.jPanel.add(nameL);
        this.jPanel.add(this.nameField);

        this.jPanel.add(surnameL);
        this.jPanel.add(this.surnameField);

        this.jPanel.add(this.searchButton);
    }
    public JPanel getjPanel(){
        return this.jPanel;
    }
    public JButton getSearchButton(){return this.searchButton;}

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
