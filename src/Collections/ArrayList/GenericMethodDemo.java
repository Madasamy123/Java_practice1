package Collections.ArrayList;

public class GenericMethodDemo {
    // Generic Method
    public static <T> void printArray(T[] array) {
        for (T item : array) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie"};
        Integer[] numbers = {1, 2, 3};

        printArray(names);   // Works with String[]
        printArray(numbers); // Works with Integer[]
    }
}


