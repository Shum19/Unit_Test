package HW.HW_3;

public class User {

    String name;
    String password;
    private boolean rights;

    boolean isAuthenticate = false;

    public User(String name, String password, boolean isAdmin) {
        this.name = name;
        this.password = password;
        this.rights = isAdmin;

    }
    public boolean getRights(){
        return this.rights;
    }
    public void setRights(boolean rights){
        this.rights = rights;
    }


    //3.6.
    public boolean authenticate(String name, String password) {
        if (this.name.equalsIgnoreCase(name) && this.password == password){
            isAuthenticate = true;
            return true;
        }
        else {return false;}
    }

    @Override
    public String toString(){
        String rights = this.rights ? "Admin" : "Guest";
        String text = this.name + " You are as " + rights;
        return text;
    }

}