import java.util.*;
import java.util.List;

public class bPros extends BData {

    public static List<bAttr> pBList() {
        List<bAttr> bList = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            bAttr bicycle = new bAttr(i + 1);  // Start nameID from 1
            bList.add(bicycle);
        }

        return bList;
    }

    public static Stack<bAttr> pBStack(List<bAttr> bList) {
        Stack<bAttr> bStack = new Stack<>();

        for (bAttr bicycle : bList) {
            // Decrease speed by 25%
            double decreasedSpeed = (bicycle.speed * 0.75);
            // Set the decreased speed
            bicycle.speed = decreasedSpeed;

            // Push the bicycle onto the stack
            bStack.push(bicycle);
        }

        return bStack;
    }

    public static PriorityQueue<bAttr> pBPQueue(List<bAttr> bList) {

        // Create a priority queue and set the comparator
        Comparator<bAttr> comparator = Comparator.comparingInt(b -> b.nameID);
        PriorityQueue<bAttr> bPQueue = new PriorityQueue<>(comparator);

        // Add all elements to the priority queue
        bPQueue.addAll(bList);

        return bPQueue;
    }

    public static void removeLessThan10(List<bAttr> bList) {
        bList.removeIf(bicycle -> bicycle.speed < 10);
    }
}
