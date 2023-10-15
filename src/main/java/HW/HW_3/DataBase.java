package HW.HW_3;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private List<User>  users = new ArrayList<>();
    public List<User> getUsers(){
        String[] names = {"Qa", "We", "Er", "Rt", "Ty", "Yu", "Ui", "Io", "Op"};
        String [] passwords = {"1234", "1234", "1234", "1234", "1234", "1234", "1234", "1234", "1234", };
        boolean[] isAdmin = {false, false, false, false, false, false, false, true, true};
        for (int i = 0; i < 9; i++) {
            this.users.add(new User(names[i], passwords[i], isAdmin[i]));
        }
        return this.users;
    }

}
