import java.util.Scanner;
class Wheel extends Bicycle {

    protected static void wheelSize(){
        wheelDiameter = 0;
        System.out.print("What size is the wheel in diameter?\n");
        Scanner wheel = new Scanner(System.in);
        wheelDiameter = wheel.nextFloat();
    }
}
