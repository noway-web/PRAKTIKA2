public class DogKennelTester {
    public static void main(String[] args) {
        DogKennel kennel = new DogKennel(5);

        // Создание и добавление собак в питомник
        Dog dog1 = new Dog("Buddy", 3);
        Dog dog2 = new Dog("Rex", 5);
        Dog dog3 = new Dog("Luna", 2);

        kennel.addDog(dog1);
        kennel.addDog(dog2);
        kennel.addDog(dog3);

        // Вывод информации о собаках в питомнике
        kennel.displayAllDogs();
    }
}