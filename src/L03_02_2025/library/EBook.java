package L03_02_2025.library;

public class EBook extends Book {
    private int fileSize;

    public EBook(String title, Author author, int year, int fileSize) {
        super(title, author, year);
        this.fileSize = fileSize;
    }

    @Override
    public String toString() {
        return super.toString() + " fileSize " + fileSize + " Мб";

    }

    @Override
    public String getDescription() {
        return super.getDescription() + " fileSize " + fileSize + " Мб";
    }
}
