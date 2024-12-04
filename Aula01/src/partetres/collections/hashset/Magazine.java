package partetres.collections.hashset;

import java.util.Objects;

public class Magazine implements LibraryItem {
    private final String title;
    private final String issue;
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
            System.out.println(title + " (" + issue + ") foi verificado.");
        } else {
            System.out.println(title + " (" + issue + ") já está verificado.");
        }
    }

    @Override
    public void returnItem() {
        if (isCheckedOut) {
            isCheckedOut = false;
            System.out.println(title + " (" + issue + ") foi devolvido.");
        } else {
            System.out.println(title + " (" + issue + ") não foi verificado.");
        }
    }

    @Override
    public String getTitle() {
        return title + " (" + issue + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Magazine magazine = (Magazine) o;
        return title.equals(magazine.title) && issue.equals(magazine.issue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, issue);
    }
}

