import java.util.Random;
import java.util.Scanner;
import java.lang.String;

class TrainInputHandler extends Thread {
    private TrainManager trainManager;
    private String operatorName;
    private Random random = new Random();

    public TrainInputHandler(TrainManager trainManager, String operatorName) {
        this.trainManager = trainManager;
        this.operatorName = operatorName;
    }

    @Override
    public void run() {
        while (trainManager.isRunning()) {
            int randomAction = random.nextInt(4);
            String trainName = "Train " + random.nextInt(10000);
            switch (randomAction) {
                case 0:
                    trainManager.addTrain(trainName);
                    break;
                case 1:
                    trainManager.removeTrain(trainName);
                    break;
                case 2:
                    trainManager.updateTrain(trainName);
                    break;
                case 3:
                    trainManager.searchTrains(trainName);
                    break;
            }
        }
    }
}