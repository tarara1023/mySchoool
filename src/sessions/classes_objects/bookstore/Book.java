package sessions.classes_objects.bookstore;

public class Book {
    private String title;
    private int numOfPages;
    private boolean isHardCopy;
    private boolean isNew;
    private Autore autore;


    public Book(String title, int numOfPages, boolean isHardCopy, boolean isNew, Autore autore) {
        this.title = title;
        this.numOfPages = numOfPages;
        this.isHardCopy = isHardCopy;
        this.isNew = isNew;
        this.autore = autore;
        autore.setNumBooks(autore.getNumBooks()+1);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public boolean isHardCopy() {
        return isHardCopy;
    }

    public void setHardCopy(boolean hardCopy) {
        isHardCopy = hardCopy;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public Autore getAutore() {
        return autore;
    }

    public void setAutore(Autore autore) {
        this.autore = autore;
    }








}
