import java.util.Scanner;

class Racing extends Bicycle {
    public void menu() {
        ChooseBicycle.overmenu();
    }

    public void ride() {
        while (true) {
            Gear.changeGear();
            Speed.speedCal();
        }
    }
}