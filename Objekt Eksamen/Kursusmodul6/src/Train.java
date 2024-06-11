import java.util.Scanner;

public class Train {
    static int weight = 0;
    static double width = 0;
    static double height = 0;
    static double length = 0;
    static int maxSpeed = 0;
    static int maxAcceleration = 0;
    static int maxDeceleration = 0;
    static int maxWagons;
    static int power;


    public Train(String trainName, String trainCompany, boolean trainElectric, int maxWagons, int power, boolean charging) {
    }



    public static void menuTrain() {
        Locomotive loco = new Locomotive("Locomotive", "null", true, 10, 100, true);
        System.out.println("What is your train name?");
        Scanner sc = new Scanner(System.in);
        String trainName = sc.nextLine();

        System.out.println("Select your train company:");
        System.out.println("1. DSB");
        System.out.println("2. SBB");
        System.out.println("3. DB");
        int companyChoice = sc.nextInt();

        switch (companyChoice) {
            case 1:
                loco.trainCompany = "DSB";
                maxWagons = 20;
                power = 100;
                weight = 20000;
                width = 5;
                height = 5;
                length = 5;
                maxSpeed = 100;
                maxAcceleration = 10;
                maxDeceleration = 10;
                break;
            case 2:
                loco.trainCompany = "SBB";
                maxWagons = 30;
                power = 150;
                weight = 30000;
                width = 5;
                height = 5;
                length = 5;
                maxSpeed = 150;
                maxAcceleration = 15;
                maxDeceleration = 15;
                break;
            case 3:
                loco.trainCompany = "DB";
                Train.maxWagons = 40;
                Train.power = 200;
                weight = 40000;
                width = 5;
                height = 5;
                length = 5;
                maxSpeed = 200;
                maxAcceleration = 20;
                maxDeceleration = 20;
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        System.out.println("Is your train electric? True or False?");
        Locomotive.isElectric = sc.nextBoolean();
        }
    }
