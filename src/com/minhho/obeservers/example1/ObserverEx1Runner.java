package com.minhho.obeservers.example1;

public class ObserverEx1Runner {
    public static void run() {
        Database database = new Database();
        Archiver archiver = new Archiver();
        Client client = new Client();
        Boss boss = new Boss();

        database.registerObserver(archiver);
        database.registerObserver(client);
        database.registerObserver(boss);

        database.editRecord("delete", "record 1");
    }
}
