import java.util.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<BData.bAttr> bList = bPros.pBList();

        // Print the details of the bicycles in the list
        for (BData.bAttr bicycle : bList) {
            System.out.println("Bicycle_" + bicycle.nameID + " Speed: " + String.format("%.2f", bicycle.speed) + " km/h" + " Color: " + bicycle.color);
        }

        Stack<BData.bAttr> bStack = bPros.pBStack(bList);
        while (!bStack.isEmpty()) {
            BData.bAttr bicycle = bStack.pop();
            System.out.println("Bicycle_" + bicycle.nameID + " New Speed: " + String.format("%.2f", bicycle.speed) + " km/h" + " Color: " + bicycle.color);
        }


        PriorityQueue<BData.bAttr> bPQueue = bPros.pBPQueue(bList);
        while (!bPQueue.isEmpty()) {
            BData.bAttr bicycle = bPQueue.poll();
            double increasedSpeed = bicycle.speed * 1.25;
            bicycle.speed = increasedSpeed;
            System.out.println("Bicycle_" + bicycle.nameID + " New Speed: " + String.format("%.2f", bicycle.speed) + " km/h" + " Color: " + bicycle.color);
        }

        bPros.removeLessThan10(bList);
        System.out.println("Removed less than 10");

        for (BData.bAttr bicycle : bList) {
            System.out.println("Bicycle_" + bicycle.nameID + " New Speed: " + String.format("%.2f", bicycle.speed) + " km/h" + " Color: " + bicycle.color);
        }

        HashMap<String, BData.bAttr> bicycleMap = new HashMap<>();
        for (BData.bAttr bicycle : bList) {
            bicycleMap.put(String.valueOf(bicycle.nameID), bicycle);
        }

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a bicycle number to search (or type 'exit' to exit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the program.");
                break;
            }

            BData.bAttr searchedBicycle = bicycleMap.get(input);
            if (searchedBicycle != null) {
                System.out.println("Bicycle_" + searchedBicycle.nameID +
                        " Speed: " + String.format("%.2f", searchedBicycle.speed) + " km/h" +
                        " Color: " + searchedBicycle.color);
            } else {
                System.out.println("Bicycle not found.");
            }
        }

        scanner.close();
    }
}
