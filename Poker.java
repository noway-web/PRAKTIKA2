import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество игроков: ");
        int numPlayers = scanner.nextInt();
        scanner.nextLine(); // Считываем лишний перевод строки

        List<String> deck = createDeck();
        shuffleDeck(deck);

        for (int i = 0; i < numPlayers; i++) {
            List<String> playerHand = dealHand(deck);
            System.out.println("Игрок " + (i + 1) + " получает карты:");
            displayHand(playerHand);
            System.out.println();
        }
    }

    // Создание колоды карт
    public static List<String> createDeck() {
        List<String> deck = new ArrayList<>();
        String[] suits = {"Пики", "Черви", "Бубны", "Трефы"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"};

        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + " " + suit);
            }
        }
        return deck;
    }

    // Перетасовка колоды
    public static void shuffleDeck(List<String> deck) {
        Collections.shuffle(deck);
    }

    // Раздача пяти карт из колоды
    public static List<String> dealHand(List<String> deck) {
        List<String> hand = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            hand.add(deck.remove(0));
        }
        return hand;
    }

    // Вывод карт в руке игрока
    public static void displayHand(List<String> hand) {
        for (String card : hand) {
            System.out.println(card);
        }
    }
}
