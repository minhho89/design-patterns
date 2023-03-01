package com.minhho.obeservers.example2;

import java.io.File;

public class ObserversEx2Runner {
    public static void run() {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener(new File("/path/to/log/file.txt")));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
