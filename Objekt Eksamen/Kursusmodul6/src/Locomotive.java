public class Locomotive extends Train implements ElectricTrain {

    public static boolean isElectric;
    public static double battery = 100;
    public static ElectricTrain Locomotive;
    public String trainCompany;

    public Locomotive(String trainName, String trainCompany, boolean trainElectric, int maxWagons, int power, boolean charging) {
        super(trainName, trainCompany, trainElectric, maxWagons, power, charging);
    }


    public static void charge() {
        if (isElectric) {
            System.out.println("Charging...");
            battery = 100;
            System.out.println("Charged!");
        }
    }

    public static void checkBattery() {
        if (isElectric) {
            System.out.println("Battery: " + battery);
        }
    }
}
