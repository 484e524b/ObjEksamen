import java.util.ArrayList;
import java.util.List;

class TrainManager {
    private List<String> trains;
    private boolean running;

    public TrainManager() {
        trains = new ArrayList<>();
        running = true;
    }

    public synchronized void addTrain(String trainName) {
        trains.add(trainName);
        System.out.println("Train '" + trainName + "' added successfully.");
    }

    public synchronized void searchTrains(String trainName) {
        if (trains.contains(trainName)) {
            System.out.println("Train '" + trainName + "' found.");
        } else {
            System.out.println("Train '" + trainName + "' not found.");
        }
    }
    public synchronized void updateTrain(String trainName) {
        if (trains.contains(trainName)) {
        trains.remove(trainName);
        trains.add(trainName);
        System.out.println("Train '" + trainName + "' updated successfully.");
        } else {
            System.out.println("Train '" + trainName + "' not found.");
        }
    }

    public synchronized void listTrains() {
        System.out.println("List of trains:");
        for (String train : trains) {
            System.out.println(train);
        }
    }

    public synchronized void removeTrain(String trainName) {
        if (trains.contains(trainName)) {
            trains.remove(trainName);
            System.out.println("Train '" + trainName + "' removed successfully.");
        } else {
            System.out.println("Train '" + trainName + "' not found.");
        }
    }

    public synchronized void quitProgram() {
        running = false;
    }

    public synchronized boolean isRunning() {
        return running;
    }
}