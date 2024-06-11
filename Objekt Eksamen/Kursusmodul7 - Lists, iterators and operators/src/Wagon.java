import java.util.Scanner;

public class Wagon extends Goods {

public Wagon(String typeOfGoods, double width, double height, double length, double weight) {

}

    public static void menuWagon() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many wagons do you want?");
        int numberOfWagons = sc.nextInt();
        System.out.println("What goods are in the wagon?");
        System.out.println("1. Luxury");
        System.out.println("2. Armoured");
        System.out.println("3. Dangerous");
        System.out.println("4. Ordinary");
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();
        String typeOfGoods;
        double width = 5, height = 5, length = 10, weight;

        switch (choice) {
            case 1: //luxury
                weight = 10000;
                typeOfGoods = "luxury";
                break;
            case 2: //armoured
                weight = 50000;
                typeOfGoods = "armoured";
                break;
            case 3: //dangerous
                weight = 20000;
                typeOfGoods = "dangerous";
                break;
            case 4: //ordinary
                weight = 30000;
                typeOfGoods = "ordinary";
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        Wagon wagon = new Wagon(typeOfGoods, width, height, length, weight);
    }
}
