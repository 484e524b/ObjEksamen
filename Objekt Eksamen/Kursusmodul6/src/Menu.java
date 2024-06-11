import java.util.Scanner;
public class Menu implements Vehicle {

    static Scanner sc = new Scanner(System.in);

    static int speed;

    public static void menu() {
        do {
            System.out.println("What is the type of vehicle you would like to use?");

            System.out.println("1. Train");
            System.out.println("2. Wagon");
            System.out.println("3. Passenger wagon");
            System.out.println("4. Drive");
            System.out.println("5. Exit");

            System.out.println("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Train.menuTrain();
                    break;
                case 2:
                    Wagon.menuWagon();
                    break;
                case 3:
                    PassengerWagon.menuPassengerWagon();
                    break;
                case 4:
                    driveTrain();
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    while (true);
    }
    public static void driveTrain() {

do {
    System.out.println("Would you like to speed up or slow down?");

    System.out.println("1. Speed up");
    System.out.println("2. Slow down");
    System.out.println("3. Stop");
    System.out.println("4. Exit");

    if (Locomotive.isElectric) {
        System.out.println("5. Charge");
        Locomotive.checkBattery();
    }
    System.out.println("Enter your choice: ");

    int choice = sc.nextInt();

    switch (choice) {
        case 1:
            accelerate();
            break;
        case 2:
            brake();
            break;
        case 3:
            stop();
            break;
        case 4:
            System.exit(0);
            break;
        case 5:
            Locomotive.charge();
            break;
        default:
            System.out.println("Invalid choice");
            break;
    }
}
while (true);
    }

    public void start() {
        System.out.println("Starting the vehicle");

    }

    public static void stop() {
        System.out.println("Stopping the vehicle");
        speed();
        speed = 0;
        System.out.println("Current speed: " + speed);
    }

    public static int speed(){

        if (Train.maxSpeed <= speed) {
            Train.maxSpeed = speed;
        }
        else {
            speed = Train.maxAcceleration + speed;
        }
        return speed;
    }
    public static void accelerate() {
        System.out.println("Accelerating the vehicle");
        speed();
        Locomotive.battery = Locomotive.battery - 10;
        System.out.println("Current speed: " + speed);
    }

    public static int slow(){
if (speed <= 0) {
    Train.maxDeceleration = 0;
}
else {
    speed = speed - Train.maxDeceleration;
}
return speed;
    }
    public static void brake() {
        System.out.println("Braking the vehicle");
        slow();
        Locomotive.battery = Locomotive.battery + 5;
        System.out.println("Current speed: " + speed);
    }
}
