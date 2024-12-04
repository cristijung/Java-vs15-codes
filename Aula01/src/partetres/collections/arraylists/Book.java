package partetres.collections.arraylists;

public class Book implements LibraryItem {
    private String title;
    private String author;
    private boolean isCheckedOut;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isCheckedOut = false;
    }

    @Override
    public void checkOut() {
        if (!isCheckedOut) {
            isCheckedOut = true;
            System.out.println(title + " foi verificado.");
        } else {
            System.out.println(title + " já foi verificado.");
        }
    }

    @Override
    public void returnItem() {
        if (isCheckedOut) {
            isCheckedOut = false;
            System.out.println(title + " foi devolvido.");
        } else {
            System.out.println(title + " não foi verificado.");
        }
    }

    @Override
    public String getTitle() {
        return title;
    }
}