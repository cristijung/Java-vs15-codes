package partetres.collections.arraylists;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<LibraryItem> libraryItems = new ArrayList<>();

        LibraryItem book1 = new Book("1984", "George Orwell");
        LibraryItem book2 = new Book("Drácula", "Bram Stoker");
        LibraryItem magazine1 = new Magazine("National Geographic", "Junho 2024");

        libraryItems.add(book1);
        libraryItems.add(book2);
        libraryItems.add(magazine1);

        //confere todos os itens
        for (LibraryItem item : libraryItems) {
            item.checkOut();
        }

        //retorna todos os itens
        for (LibraryItem item : libraryItems) {
            item.returnItem();
        }
    }
}

