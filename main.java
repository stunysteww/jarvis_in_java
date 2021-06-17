package com.company;
import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws URISyntaxException, IOException {

//code by Stunysteww
//follow on instagram @stunysteww        
        
        
        //securityunits
        String UserName = "Stew";
        String password = "123qwe";

        //tasks
        String task1 = "open_my_webapp";
        String task2 = "open_notepad";


        Scanner sc = new Scanner(System.in);
        System.out.println("Hello this is Jarvis please fill in the details so that i can help you");
       //login
        System.out.println("Your name:");
        String name = sc.next();
        System.out.println("Your Username:");
        String un = sc.next();
        if (un.matches(UserName)) {
            System.out.println("Password:");
        } else {
            System.out.println("Username Does not exist");
        }
        String pw = sc.next();
        if (pw.matches(password)) {
            System.out.println("welcome back " + name);
            System.out.println("So, what can i do for you " + name + "?");
        }else {
            System.out.println("Wrong password for"+ UserName);
        }

        String tasks = sc.next();
        if (tasks.matches(task1)) {


            Desktop desk = Desktop.getDesktop();

            // now we enter our URL that we want to open in our
            // default browser
            desk.browse(new URI("https://bit.ly/stunystew"));
        } else if (tasks.matches(task2)) {


            Runtime runtime = Runtime.getRuntime();     //getting Runtime object

            try {
                runtime.exec("notepad.exe");        //opens new notepad instance

                //OR runtime.exec("notepad");
            } catch (IOException e) {
                e.printStackTrace();

            }
        }
    }
}










