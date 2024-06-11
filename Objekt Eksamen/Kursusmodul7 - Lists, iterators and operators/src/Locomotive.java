
public class Locomotive extends Train implements ElectricTrain {

    public static int battery;
    public static boolean isElectric;
    public boolean trainElectric;
    private String trainName;
    private String trainCompany;
    private double weight;
    private double length;

    public Locomotive(String trainName, String trainCompany, boolean trainElectric, double weight, double length) {
        this.trainName = trainName;
        this.trainCompany = trainCompany;
        this.trainElectric = trainElectric;
        this.weight = weight;
        this.length = length;

    }

    public String getTrainName() { return trainName; }
    public String getTrainCompany() { return trainCompany; }
    public double getWeight() { return weight; }
    public double getLength() { return length; }

    public static void charge() {
        if (isElectric) {
            System.out.println("Charging...");
            battery = 100;
            System.out.println("Charged!");
        }
    }

    public static void checkBattery() {
        if (isElectric) {
            System.out.println("Battery:" + battery);
        }
    }
}
