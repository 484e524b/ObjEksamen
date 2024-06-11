import java.util.Scanner;
class Gear extends Bicycle {


    protected static float gearing = 1;


    static Scanner scanner = new Scanner(System.in);

    protected static void changeGearInfo() {
        chain();
        gear();
    }

    protected static float changeGear() {
        paddleToRotation();
        System.out.print("Current gear is " + gearing + "\n");
        System.out.print("Choose gearing: \n1\t2\t3\t4\t5\tStop\n");

        gearing = scanner.nextFloat();

        String stopCycle = scanner.nextLine();
        if (stopCycle.equals("Stop")) {
            speedRPM = 0;
            return 1;
        } else {
            speedRPM = gearing * paddleRPM;
        }
        return speedRPM;
    }

    private static void paddleToRotation() {
        //changeGearInfo();
        paddleRPM = chainLength / numberTeeth;
    }

    private static void gear() {
        System.out.print("How many teeth is the gear?\n");
        numberTeeth = scanner.nextFloat();
    }

    private static void chain() {
        System.out.print("What is the length of the chain?\n");
        chainLength = scanner.nextFloat();
    }
}
