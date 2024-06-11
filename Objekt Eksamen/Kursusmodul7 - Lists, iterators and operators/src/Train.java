import java.util.*;


public class Train {
    static int weight = 0;
    static double length = 0;
    static int maxSpeed = 0;
    static int maxAcceleration = 0;
    static int maxDeceleration = 0;
    static int maxWagons;
    static int power;

    static boolean isElectric;



    public static List<Locomotive> locomotives = new ArrayList<>();


    public static void showList() {
        Scanner sc = new Scanner(System.in);

        System.out.println("""
                What do you want to search for?
                1: Name
                2: Company
                3: Weight
                4: Length
                5: Is Electric
                """);

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("What is the name of the train you are looking for?");
                String name = sc.next();
                for (Locomotive locomotive : locomotives) {
                    if (locomotive.getTrainName().equals(name)) {
                        System.out.println("Found train: " + locomotive.getTrainName());
                    }
                }
                break;
            case 2:
                System.out.println("What is the company of the train you are looking for?");
                String company = sc.next();
                for (Locomotive locomotive : locomotives) {
                    if (locomotive.getTrainCompany().equals(company)) {
                        System.out.println("Found train: " + locomotive.getTrainName());
                    }
                }
                break;
            case 3:
                System.out.println("Highest or Lowest weight by order?");
                String weightOrder = sc.next();
                if (weightOrder.equalsIgnoreCase("Highest")) {
                    System.out.println("Sorted by highest to lowest weight.");
                    Collections.sort(locomotives, Comparator.comparingDouble(Locomotive::getWeight).reversed());
                    for (Locomotive locomotive : locomotives) {
                        System.out.println(locomotive.getTrainName() + ": " + locomotive.getWeight());
                    }
                }
                else if (weightOrder.equalsIgnoreCase("Lowest")) {
                    System.out.println("Sorted by lowest to highest weight.");
                    Collections.sort(locomotives, Comparator.comparingDouble(Locomotive::getWeight));
                    for (Locomotive locomotive : locomotives) {
                        System.out.println(locomotive.getTrainName() + ": " + locomotive.getWeight());
                    }
                }
                break;
            case 4:
                System.out.println("Highest or Lowest length by order?");
                String lengthOrder = sc.next();
                if (lengthOrder.equalsIgnoreCase("Highest")) {
                    System.out.println("Sorted by highest to lowest length.");
                    Collections.sort(locomotives, Comparator.comparingDouble(Locomotive::getLength).reversed());
                    for (Locomotive locomotive : locomotives) {
                        System.out.println(locomotive.getTrainName() + ": " + locomotive.getLength());
                    }
                }
                else if (lengthOrder.equalsIgnoreCase("Lowest")) {
                    System.out.println("Sorted by lowest to highest length.");
                    Collections.sort(locomotives, Comparator.comparingDouble(Locomotive::getLength));
                    for (Locomotive locomotive : locomotives) {
                        System.out.println(locomotive.getTrainName() + ": " + locomotive.getLength());
                    }
                }
                break;
            case 5:
                System.out.println("Electric, true or false?");
                boolean isElectric = sc.nextBoolean();
                for (Locomotive locomotive : locomotives) {
                    if (locomotive.trainElectric == isElectric) {
                        System.out.println("Found train: " + locomotive.getTrainName() + locomotive.trainElectric);
                    }
                }
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }



    public static List<Locomotive> menuTrain() {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your train name?");
        String trainName = sc.nextLine();
        String trainCompany;

        System.out.println("Select your train company:");
        System.out.println("1. DSB");
        System.out.println("2. SBB");
        System.out.println("3. DB");
        int companyChoice = sc.nextInt();

        boolean trainElectric;

        switch (companyChoice) {
            case 1:
                trainCompany = "DSB";
                maxWagons = 20;
                power = 100;
                weight = 20000;
                length = 3;
                trainElectric = true;
                break;
            case 2:
                trainCompany = "SBB";
                maxWagons = 30;
                power = 150;
                weight = 30000;
                length = 4;
                trainElectric = false;
                break;
            case 3:
                trainCompany = "DB";
                maxWagons = 40;
                power = 200;
                weight = 40000;
                length = 5;
                trainElectric = false;
                break;
            default:
                System.out.println("Invalid choice");
                return null;
        }

        locomotives.add(new Locomotive(trainName, trainCompany, trainElectric, weight, length));

        return locomotives;
    }
}
