public class ReverseArray {
    public static void main(String[] args) {
        String[] array = {"A", "B", "C", "D", "E"};

        System.out.println("Исходный массив:");
        for (String element : array) {
            System.out.print(element + " ");
        }

        reverseArray(array);

        System.out.println("\nМассив после обращения:");
        for (String element : array) {
            System.out.print(element + " ");
        }
    }

    public static void reverseArray(String[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            // Меняем местами элементы, указанные start и end
            String temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            // Перемещаем указатели к центру массива
            start++;
            end--;
        }
    }
}
