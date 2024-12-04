package partetres.collections.arraylists;

public class Magazine implements LibraryItem {
    private String title;
    private String issue; //significa emitido
    private boolean isCheckedOut;

    public Magazine(String title, String issue) {
        this.title = title;
        this.issue = issue;
        this.isCheckedOut = false;
    }

    @Override
    public void checkOut() {
        if (!isCheckedOut) {
            isCheckedOut = true;
            System.out.println(title + " issue " + issue + " foi verificado.");
        } else {
            System.out.println(title + " issue " + issue + " já foi verificado.");
        }
    }

    @Override
    public void returnItem() {
        if (isCheckedOut) {
            isCheckedOut = false;
            System.out.println(title + " issue " + issue + " foi devolvido.");
        } else {
            System.out.println(title + " issue " + issue + " não foi verificado.");
        }
    }

    @Override
    public String getTitle() {
        return title;
    }
}

