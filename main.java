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
        String task5 = "open_github";
        String task6 = "play_music";
        //emotions
        String em1 = "Hi";
        String em2 = "hi";
        String em3 = "Hello";
        String em4 = "hello";


        Scanner sc = new Scanner(System.in);
        System.out.println("Hello this is Jarvis please fill in the details so that i can help you");
        System.out.println("Your name:");
        //name input
        String name = sc.next();
        //name output
        System.out.println("How can i help you " + name + " ?");

        //task input
        String s = sc.next();
        //task result
        if (s.matches(task1)) {
            Desktop desktop = Desktop.getDesktop();
            // now we enter the URL that we want to open
            // Link will open in the default browser
            desktop.browse(new URI("https://bit.ly/stunystew"));
        } else if (s.matches(task2)) {


            Runtime runtime = Runtime.getRuntime();
            try {
                runtime.exec("notepad.exe");
                //OR runtime.exec("notepad");
            } catch (IOException e) {
                e.printStackTrace();

            }
        } else if (s.matches(task3)) {
            Desktop desktop = Desktop.getDesktop();
            desktop.browse(new URI("https://youtube.com"));
        } else if (s.matches(task4)) {
            Desktop desktop = Desktop.getDesktop();
            desktop.browse(new URI("https://instagram.com"));
        } else if (s.matches(task5)) {
            Desktop desktop = Desktop.getDesktop();
            desktop.browse(new URI("https://github.com"));
        } else if (s.matches(task6)) {
            Desktop desktop = Desktop.getDesktop();
            desktop.browse(new URI("https://www.youtube.com/watch?v=6swmTBVI83k"));
        } else if (s.matches(em1)) {
            System.out.println("Hello " + name + " how can i help you?");
            String t = sc.next();
            if (t.matches(task1)) {
                Desktop desktop = Desktop.getDesktop();
                // now we enter the URL that we want to open
                // Link will open in the default browser
                desktop.browse(new URI("https://bit.ly/stunystew"));
            } else if (t.matches(task2)) {


                Runtime runtime = Runtime.getRuntime();
                try {
                    runtime.exec("notepad.exe");
                    //OR runtime.exec("notepad");
                } catch (IOException e) {
                    e.printStackTrace();

                }
            } else if (t.matches(task3)) {
                Desktop desktop = Desktop.getDesktop();
                desktop.browse(new URI("https://youtube.com"));
            } else if (t.matches(task4)) {
                Desktop desktop = Desktop.getDesktop();
                desktop.browse(new URI("https://instagram.com"));
            } else if (t.matches(task5)) {
                Desktop desktop = Desktop.getDesktop();
                desktop.browse(new URI("https://github.com"));
            } else if (t.matches(task6)) {
                Desktop desktop = Desktop.getDesktop();
                desktop.browse(new URI("https://www.youtube.com/watch?v=6swmTBVI83k"));
            }
            } else {
                System.out.println("Such command not exist");
            }

        }
    }










