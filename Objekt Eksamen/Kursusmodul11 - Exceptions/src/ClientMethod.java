import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClientMethod {

    public static List<Train> trainList = new ArrayList<>();

    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the train: ");
        String name = sc.next();
        trainList.add(new Train(name));
    }

    public void sendData(String serverAddress, int serverPort) {
        try (Socket socket = new Socket(serverAddress, serverPort);
             ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream())) {
            oos.writeObject(trainList);
            System.out.println("Data sent to server");
        } catch (IOException e) { // Handle IO exceptions
            System.out.println("IO Error: " + e.getMessage());
        }
    }
}
