import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TaskA{
    public static void main(String[] args) {
        // Create an ArrayList with the values (1, 2, 3, 4, 5, 6, 7)
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        // Shuffle the ArrayList
        Collections.shuffle(list);

        // Convert the shuffled ArrayList back to an array (if needed)
        Integer[] TaskA = new Integer[list.size()];
        list.toArray(TaskA);

        // Print the shuffled array
        System.out.println("Shuffled Array: " + list);
    }
}
