package L03_02_2025.library;

import L30_01_2025.Wheel;

public class Library {
    private Book[] books;
    private int size;

    public Library(int capasity) {
        books = new Book[capasity];

    }

    // добавить элемент в массиве (добовлем книги)
    public void addBook (Book book) {
        if (size < books.length) {
            books[size++] = book;

        } else {
            Book[] books1 = new Book[books.length + 1];
            for (int i = 0; i < books.length; i++) {
                books1[i] = books[i];
            }
            books1[size++] = book;
            books = books1;

        }

    }

    public Book get(int index) {
        return books[index];
    }

    // сортировка книг по году издания (новые идут первыми)
    public void sortBooksByYear() {
        for (int i = 0; i < books.length - 1; i++) {
            for (int j = 0; j < books.length - i - 1; j++) {
                if (books[j] == null || books[j + 1] == null) {
                    continue;
                }
                if (books[j].getYear() > books[j + 1].getYear()) {
                    Book temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                }
            }
        }
    }

    // сортировка по году рождения Автора (новые идут первыми)
    public void sortBooksByAuthorBirthYear() {
        for (int i = 0; i < books.length - 1; i++) {
            for (int j = 0; j < books.length - i - 1; j++) {
                if (books[j] == null || books[j + 1] == null) {
                    continue;
                }
                if (books[j].getAuthor().getBirthYear() < books[j + 1].getAuthor().getBirthYear()) {
                    Book temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                }
            }
        }
    }

    public int getSize() {
        return size;
    }

    public Book[] getBooks() {
        return books;
    }

    //выводит список книг
    public void printBooks() {
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }
    }

    //выводит список книг
    public Book findBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }
}