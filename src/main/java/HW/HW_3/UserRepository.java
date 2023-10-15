package HW.HW_3;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    // Тут можно хранить аутентифицированных пользователей
    List<User> data = new ArrayList<>();
    private List<User> dataBase = new DataBase().getUsers();



    public void addUser(User user) {
        for (User usr : this.dataBase) {
            if (usr.authenticate(user.name, user.password)) {
                if(usr.getRights() != user.getRights()){
                    user.setRights(usr.getRights());
                }
                data.add(user);
                String rights = user.getRights() ? "Admin" : "Guest";
                System.out.println("You logged in under " + user.name + " as " + rights);
                return;
            }
        }
            System.out.println("No such user or password/name is incorrect");

    }
    public List<User> getData(){
        return this.data;
    }
    public boolean findByName(String username) {
        for (User user : this.dataBase) {
            if (user.name.equalsIgnoreCase(username)) {
                return true;
            }
        }
        return false;
    }
    public void logoutNotAdminUsers(){
        data.removeIf(user -> !user.getRights());
        }

}