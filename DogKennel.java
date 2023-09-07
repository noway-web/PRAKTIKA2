class DogKennel {
    private Dog[] dogs;
    private int numberOfDogs;

    public DogKennel(int capacity) {
        dogs = new Dog[capacity];
        numberOfDogs = 0;
    }

    // Метод для добавления собаки в питомник
    public void addDog(Dog dog) {
        if (numberOfDogs < dogs.length) {
            dogs[numberOfDogs] = dog;
            numberOfDogs++;
        } else {
            System.out.println("Питомник полон, невозможно добавить больше собак.");
        }
    }

    // Метод для вывода всех собак в питомнике
    public void displayAllDogs() {
        for (int i = 0; i < numberOfDogs; i++) {
            System.out.println(dogs[i]);
        }
    }
}
