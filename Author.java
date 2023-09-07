// Класс Author, соответствующий диаграмме класса UML
public class Author {
    private String name;
    private String email;
    private char gender;

    // Конструктор для инициализации полей
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    // Геттер для имени автора
    public String getName() {
        return name;
    }

    // Геттер для email автора
    public String getEmail() {
        return email;
    }

    // Геттер для пола автора
    public char getGender() {
        return gender;
    }

    // Метод для изменения email автора
    public void setEmail(String email) {
        this.email = email;
    }

    // Переопределение метода toString() для вывода информации об авторе
    @Override
    public String toString() {
        return "Author[name=" + name + ", email=" + email + ", gender=" + gender + "]";
    }
}
