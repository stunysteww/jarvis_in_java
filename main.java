package com.company;


import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;

public class Debugjr {
    public static void main(String[] args) throws URISyntaxException, IOException {


        //tasks
        String task1 = "open_my_webapp";
        String task2 = "open_notepad";
        String task3 = "open_youtube";
        String task4 = "open_instagram";


        Scanner sc = new Scanner(System.in);
        System.out.println("Hello this is Jarvis please fill in the details so that i can help you");
        System.out.println("Your name:");
        String name = sc.next();

        System.out.println("How can i help you " + name + " ?");
        String tasks = sc.next();
        if (tasks.matches(task1)) {


            Desktop desk = Desktop.getDesktop();

            // now we enter our URL that we want to open in our
            // default browser
            desk.browse(new URI("https://bit.ly/stunystew"));
        } else if (tasks.matches(task2)) {


            Runtime runtime = Runtime.getRuntime();
            try {
                runtime.exec("notepad.exe");
                //OR runtime.exec("notepad");
            } catch (IOException e) {
                e.printStackTrace();

            }
        } else if (tasks.matches(task3)) {
            Desktop desk = Desktop.getDesktop();
            desk.browse(new URI("https://youtube.com"));
        } else if (tasks.matches(task4)) {
            Desktop desk = Desktop.getDesktop();
            desk.browse(new URI("https://instagram.com"));
        }
    }
}










