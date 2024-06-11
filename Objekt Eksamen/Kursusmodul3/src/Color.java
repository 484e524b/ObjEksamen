import java.util.Scanner;
class Color extends Bicycle{


    protected static void colorPick() {

        System.out.print("What color do you want your bicycle?\nWhite\tRed\nGreen\tYellow\n");
        Scanner color = new Scanner(System.in);
        String colorPicked = color.nextLine();

        switch (colorPicked.toLowerCase()) {

            case "white":
                colorOut = "\u001B[0m"; //white
                break;
            case "red":
                colorOut = "\u001B[31m"; //red
                break;
            case "green":
                colorOut = "\u001B[32m"; //green
                break;
            case "yellow":
                colorOut = "\u001B[33m"; //yellow
                break;
            default:
                break;
        }
    }
}
