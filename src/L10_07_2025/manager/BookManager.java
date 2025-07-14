package L10_07_2025.manager;

import by.ilyushenko.model.Book;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookManager {
    private static final String URL = "jdbc:mysql://localhost:3307/library_db";
    private static final String USER = "root";
    private static final String PASSWORD = "rootpass";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            System.out.println("Подключение к базе данных успешно!");

            System.out.println("Все книги");
            List<Book> books = getAllBooks(connection);
            books.forEach(System.out::println);

            System.out.println("Добавление новой книги!");
            addBook(connection, "Мастер и Маргарита", "Михаил Булгаков", 1967);
            System.out.println("Книга добавлена. Обновлённый список:");
            getAllBooks(connection).forEach(System.out::println);

            System.out.println("Обновляем год книги");
            updateBookYear(connection, 1, 1867);
            Book updateBook = getBookById(connection, 1);
            System.out.println(updateBook);

            System.out.println("Удаляем книгу с ID=2...");
            deleteBook(connection, 2);
            getAllBooks(connection).forEach(System.out::println);
        } catch (SQLException e) {
            System.err.println("Ошибка при работе с БД: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Непредвиденная ошибка : " + e.getMessage());
        }
    }

    private static Book getBookById(Connection connection, int id) throws SQLException {
        String sql = "SELECT * FROM books WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                Book book = new Book(
                        resultSet.getInt("id"),
                        resultSet.getString("title"),
                        resultSet.getString("author"),
                        resultSet.getInt("year")
                );
                return book;
            }
        }
        return null;
    }

    private static void deleteBook(Connection connection, int id) throws SQLException {
        String sql = "DELETE FROM books WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        }
    }

    private static void addBook(Connection connection, String title,
                                String author, int year) throws SQLException {
        String sql = "INSERT INTO books (title, author, year) VALUES (?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, title);
            preparedStatement.setString(2, author);
            preparedStatement.setInt(3, year);
            preparedStatement.executeUpdate();
        }
    }

    private static void updateBookYear(Connection connection, int id, int newYear) throws SQLException {
        String sql = "UPDATE books SET year = ? WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, newYear);
            preparedStatement.setInt(2, id);
            preparedStatement.executeUpdate();
        }
    }


    private static List<Book> getAllBooks(Connection connection) throws SQLException {
        List<Book> books = new ArrayList<>();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM books");
        while (resultSet.next()) {
            Book book = new Book(
                    resultSet.getInt("id"),
                    resultSet.getString("title"),
                    resultSet.getString("author"),
                    resultSet.getInt("year")
            );
            books.add(book);
        }
        return books;
    }
}
