import java.util.Random;

public class Main {
    public static void main(String[] args) {
        TrainManager trainManager = new TrainManager();

        int numberOfOperators = new Random().nextInt(1000000000) + 1000000000;

        for (int i = 0; i < numberOfOperators; i++) {
            TrainInputHandler operator = new TrainInputHandler(trainManager, "Operator " + (i + 1));
            Thread operatorThread = new Thread(operator);
            operatorThread.start();
        }

    System.out.println("list of trains: ");
    trainManager.listTrains();


        while (trainManager.isRunning()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}