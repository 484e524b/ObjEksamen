import java.util.Random;

public class BData {

    public static class bAttr {
        int nameID;
        int colorID;
        double speed;
        String color;

        public bAttr(int nameID) {
            this.nameID = nameID;

            Random rand = new Random();
            this.colorID = rand.nextInt(7);
            this.speed = rand.nextDouble() * (100);

            switch (this.colorID) {
                case 0:
                    this.color = "red";
                    break;
                case 1:
                    this.color = "blue";
                    break;
                case 2:
                    this.color = "green";
                    break;
                case 3:
                    this.color = "yellow";
                    break;
                case 4:
                    this.color = "orange";
                    break;
                case 5:
                    this.color = "purple";
                    break;
                case 6:
                    this.color = "brown";
                    break;
            }
        }
    }
}
