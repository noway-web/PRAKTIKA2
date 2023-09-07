import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// Класс Computer представляет компьютеры
class Computer {
    private String brand;
    private String model;
    private double price;

    public Computer(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Computer: " + brand + " " + model + ", Price: $" + price;
    }
}

// Интерфейс ComputerSearch для поиска компьютеров
interface ComputerSearch {
    List<Computer> search(String keyword);
}