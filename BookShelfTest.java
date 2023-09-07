public class BookShelfTest {
    public static void main(String[] args) {
        BookShelf shelf = new BookShelf(5);

        // Добавление книг на полку
        shelf.addBook(new Book("Book1", "Author1", 2000));
        shelf.addBook(new Book("Book2", "Author2", 1995));
        shelf.addBook(new Book("Book3", "Author3", 2010));

        // Вывод всех книг на полке
        System.out.println("Все книги на полке:");
        shelf.displayAllBooks();

        // Нахождение книги с самым ранним годом выпуска
        Book earliestBook = shelf.findEarliestBook();
        if (earliestBook != null) {
            System.out.println("\nСамая ранняя книга на полке: " + earliestBook);
        } else {
            System.out.println("\nНа полке нет книг.");
        }

        // Нахождение книги с самым поздним годом выпуска
        Book latestBook = shelf.findLatestBook();
        if (latestBook != null) {
            System.out.println("Самая поздняя книга на полке: " + latestBook);
        } else {
            System.out.println("На полке нет книг.");
        }

        // Сортировка книг по году выпуска и вывод отсортированных книг
        shelf.sortBooksByYear();
        System.out.println("\nКниги на полке, отсортированные по году выпуска:");
        shelf.displayAllBooks();
    }
}