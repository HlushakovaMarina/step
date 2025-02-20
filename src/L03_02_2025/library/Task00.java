package L03_02_2025.library;

public class Task00 {
    public static void main(String[] args) {
        Library library = new Library(6);

        Author tolkien = new Author("Джон", "Толкин", 1892);
        Book lordOfTherings = new Book("Властельн колец", tolkien, 1954);
        library.addBook(lordOfTherings);
        Book lordOfTherings3 = new Book("Властельн колец-3", tolkien, 1955);
        library.addBook(lordOfTherings3);
        EBook leBook = new EBook("Властелин колец 2", tolkien, 1954, 40);

        System.out.println(leBook.getDescription());

       /* Author pyshkin = new Author("Александр", "Пушкин", 1799);
        Book mermaid = new Book("Русалка", pyshkin, 1829);
        library.addBook(mermaid);
        Book dubrovsky = new Book("Дубровский", pyshkin, 1833);
        library.addBook(dubrovsky);

        Author king = new Author("Стивен", "Кинг", 1947);
        Book it = new Book("Оно", king, 1986);
        library.addBook(it);
        Book greenMile = new Book("Зеленая миля", king, 1996);
        library.addBook(greenMile);

        System.out.println("Все книги:");
        library.printBooks();

        System.out.println("Поиск книги 'Властелин колец':");
        System.out.println(library.findBook("Властелин колец"));

        System.out.println("Книги после сортировки по году издания:");
        library.sortBooksByYear();
        library.printBooks();

        System.out.println("Книги после сортировки по году рождения автора:");
        library.sortBooksByAuthorBirthYear();
        library.printBooks();*/
    }
}
