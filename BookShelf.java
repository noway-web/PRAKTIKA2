class BookShelf {
    private Book[] books;
    private int numberOfBooks;

    public BookShelf(int capacity) {
        books = new Book[capacity];
        numberOfBooks = 0;
    }

    public void addBook(Book book) {
        if (numberOfBooks < books.length) {
            books[numberOfBooks] = book;
            numberOfBooks++;
        } else {
            System.out.println("Книжная полка заполнена, невозможно добавить больше книг.");
        }
    }

    public Book findEarliestBook() {
        if (numberOfBooks == 0) {
            return null;
        }

        Book earliestBook = books[0];
        for (int i = 1; i < numberOfBooks; i++) {
            if (books[i].getYear() < earliestBook.getYear()) {
                earliestBook = books[i];
            }
        }
        return earliestBook;
    }

    public Book findLatestBook() {
        if (numberOfBooks == 0) {
            return null;
        }

        Book latestBook = books[0];
        for (int i = 1; i < numberOfBooks; i++) {
            if (books[i].getYear() > latestBook.getYear()) {
                latestBook = books[i];
            }
        }
        return latestBook;
    }

    public void sortBooksByYear() {
        for (int i = 0; i < numberOfBooks - 1; i++) {
            for (int j = 0; j < numberOfBooks - i - 1; j++) {
                if (books[j].getYear() > books[j + 1].getYear()) {
                    // Обмен местами книг, если они расположены в неправильном порядке
                    Book temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                }
            }
        }
    }

    public void displayAllBooks() {
        for (int i = 0; i < numberOfBooks; i++) {
            System.out.println(books[i]);
        }
    }
}
