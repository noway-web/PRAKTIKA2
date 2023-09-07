// Класс Shop управляет списком компьютеров в магазине
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
// Класс Shop управляет списком компьютеров в магазине
class Shop implements ComputerSearch {
    private List<Computer> computers;

    public Shop() {
        computers = new ArrayList<>();
    }

    // Метод для добавления компьютера в магазин
    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    // Метод для удаления компьютера из магазина
    public void removeComputer(Computer computer) {
        computers.remove(computer);
    }

    // Метод для поиска компьютера по ключевому слову
    public List<Computer> search(String keyword) {
        List<Computer> foundComputers = new ArrayList<>();
        for (Computer computer : computers) {
            if (computer.getBrand().toLowerCase().contains(keyword.toLowerCase()) ||
                    computer.getModel().toLowerCase().contains(keyword.toLowerCase())) {
                foundComputers.add(computer);
            }
        }
        return foundComputers;
    }

    // Метод для вывода всех компьютеров в магазине
    public void displayAllComputers() {
        for (Computer computer : computers) {
            System.out.println(computer);
        }
    }
}


