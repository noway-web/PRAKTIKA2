
// Класс TestAuthor для тестирования класса Author
public class TestAuthor {
    public static void main(String[] args) {
        // Создаем объект класса Author
        Author author = new Author("John Smith", "john@example.com", 'M');

        // Выводим информацию об авторе
        System.out.println(author);

        // Изменяем email автора
        author.setEmail("john.smith@example.com");

        // Выводим обновленную информацию об авторе
        System.out.println(author);
    }
}
