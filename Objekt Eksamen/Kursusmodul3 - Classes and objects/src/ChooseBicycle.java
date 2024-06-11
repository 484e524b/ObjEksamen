import java.util.Scanner;
class ChooseBicycle extends Bicycle {
    static boolean exitOvermenu = false;

    protected static boolean overmenu() {
        Scanner Choose = new Scanner(System.in);
        String optionChoose;
        do {
            System.out.print("Choose aspects to change:\nGear\tWheels\nPaintjob\tSeat\nExit\n");
            optionChoose = Choose.nextLine();

            switch (optionChoose.toLowerCase()) {
                case "gear":
                    Gear.changeGearInfo();
                    break;

                case "wheels":
                    Wheel.wheelSize();
                    break;

                case "paintjob":
                    Color.colorPick();
                    break;

                case "exit":
                    return exitOvermenu = true;
                default:
                    break;
            }
        } while (!optionChoose.equalsIgnoreCase("Exit"));
        return false;
    }
}