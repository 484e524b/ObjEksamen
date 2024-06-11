import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ClientMethod client = new ClientMethod();
        EventTrain eventTrain = new EventTrain();

        boolean sendData = false; // Set a condition to control when to send data

        do {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press '1' to send the data to the server: ");
        String userInput = scanner.nextLine();

        if (userInput.equals("1")) {
            sendData = true;
        }

        if (sendData) {
            client.sendData("localhost", 12345); // Adjust the server address and port as needed
            sendData = false;
        } else {
            System.out.println("Data not sent");
        }

        } while (true);
    }
}
