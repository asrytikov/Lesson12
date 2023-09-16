package p5;

import java.io.Console;

public class Main {
    public static void main(String[] args) {
        Console console = System.console();
        if (console!=null){
            String login = console.readLine("Input login: ");
            char[] password = console.readPassword("Input password:");

            console.printf("Login: %s \n", login);
            console.printf("Password: %s \n", password);

        }
    }
}
