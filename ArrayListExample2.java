import java.util.ArrayList;

public class ArrayListExample2 {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Adding elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // Removing elements from the ArrayList
        numbers.remove(2); // Removes the element at index 2 (30)

        // Accessing elements from the ArrayList after removal
        System.out.println("Remaining elements in the ArrayList:");
        for (Integer num : numbers) {
            System.out.println(num);
        }
    }
}
