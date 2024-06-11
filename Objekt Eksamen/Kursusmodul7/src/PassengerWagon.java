import java.util.Scanner;

public class PassengerWagon extends Goods {
    static int seats;
    static boolean isBicycleWagon;

    public static void menuPassengerWagon() {
        System.out.println("is the wagon a bicycle wagon? true or false?");
        Scanner sc = new Scanner(System.in);
        isBicycleWagon = sc.nextBoolean();
        System.out.println("How many seats does the wagon have?");
        seats = sc.nextInt();

    }
}
