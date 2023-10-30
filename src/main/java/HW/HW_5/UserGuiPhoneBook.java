package HW.HW_5;

import javax.swing.*;

public class UserGuiPhoneBook {
    private JFrame phoneBookFrame;
    public UserGuiPhoneBook (){
        this.phoneBookFrame = new PhoneBook();
        this.phoneBookFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.phoneBookFrame.setSize(700, 300);
        this.phoneBookFrame.setVisible(true);

    }

}
