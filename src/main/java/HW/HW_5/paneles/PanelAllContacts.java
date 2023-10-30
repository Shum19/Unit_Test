package HW.HW_5.paneles;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class PanelAllContacts extends JPanel{
    private JPanel allContacts;
    private JTextArea textAria;
    public PanelAllContacts(){
        this.allContacts = new JPanel();
        BorderLayout borderLayout = new BorderLayout();
        this.allContacts.setLayout(borderLayout);
        this.textAria = new JTextArea();
        this.textAria.setSize(100, 10);
        this.textAria.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(this.textAria);
        this.allContacts.add("Center", scrollPane);
    }
    public JPanel getScrollPane(){
        return this.allContacts;
    }
    public JTextArea getTextAria(){
        return this.textAria;
    }
}
