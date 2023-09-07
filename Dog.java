class Dog {
    private String name;
    private int age;

    // Конструктор собаки
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Геттер для имени собаки
    public String getName() {
        return name;
    }

    // Сеттер для имени собаки
    public void setName(String name) {
        this.name = name;
    }

    // Геттер для возраста собаки
    public int getAge() {
        return age;
    }

    // Сеттер для возраста собаки
    public void setAge(int age) {
        this.age = age;
    }

    // Метод для перевода возраста собаки в "человеческий" возраст
    public int convertToHumanAge() {
        return age * 7;
    }

    // Метод ToString для возвращения описания собаки в виде строки
    @Override
    public String toString() {
        return "Dog Name: " + name + ", Age: " + age + " years";
    }
}
