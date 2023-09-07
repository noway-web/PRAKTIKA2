import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shop shop = new Shop();

        // Добавление компьютеров в магазин
        System.out.println("Введите информацию о компьютерах (бренд, модель, цена), 'конец' для завершения:");
        while (true) {
            System.out.print("Введите бренд: ");
            String brand = scanner.nextLine();
            if (brand.equals("конец")) {
                break;
            }
            System.out.print("Введите модель: ");
            String model = scanner.nextLine();

            if (model.equals("конец")) {
                break; // Остановить ввод, если введено "конец" в качестве модели.
            }

            // Проверка наличия числа во входных данных
            double price = 0.0;
            while (true) {
                System.out.print("Введите цену: ");
                if (scanner.hasNextDouble()) {
                    price = scanner.nextDouble();
                    scanner.nextLine(); // Чтение символа новой строки после ввода цены
                    break;
                } else {
                    System.out.println("Введите корректное число для цены.");
                    scanner.nextLine(); // Очистка буфера ввода
                }
            }

            Computer computer = new Computer(brand, model, price);
            shop.addComputer(computer);
        }




        // Вывод всех компьютеров в магазине
        System.out.println("\nСписок компьютеров в магазине:");
        shop.displayAllComputers();

        // Поиск компьютера по ключевому слову
        System.out.print("\nВведите ключевое слово для поиска: ");
        String keyword = scanner.nextLine();
        List<Computer> foundComputers = shop.search(keyword);

        if (!foundComputers.isEmpty()) {
            System.out.println("\nНайденные компьютеры:");
            for (Computer computer : foundComputers) {
                System.out.println(computer);
            }
        } else {
            System.out.println("\nКомпьютеры с заданным ключевым словом не найдены.");
        }

        scanner.close(); // После окончания использования сканнера, его нужно закрыть.
    }
}