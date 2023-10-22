package HW;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter");
        Scanner input = new Scanner(System.in);
        String txt = input.nextLine();
        txt = txt.replace(".", "").replace(" ", "_"). replace(":", "");
        System.out.println(txt);
    }
}
