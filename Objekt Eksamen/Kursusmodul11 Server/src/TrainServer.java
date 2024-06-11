import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import java.util.Scanner;

public class TrainServer {

    public synchronized void startServer(int port) {
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server started on port " + port);

            while (true) {
                Socket clientSocket = serverSocket.accept(); // Wait for a client connection

                // Handle client connection in a separate thread
                Thread clientThread = new Thread(() -> {
                    try {
                        ObjectInputStream ois = new ObjectInputStream(clientSocket.getInputStream());
                        List<Train> trainList = (List<Train>) ois.readObject(); // Deserialize the train list

                        System.out.println("Received train list from client:");
                        for (Train train : trainList) {
                            System.out.println("Train name: " + train.getName());
                        }

                        saveList(trainList);
                    } catch (IOException e) {
                        System.err.println("I/O error during client connection handling: " + e.getMessage());
                        e.printStackTrace();
                    } catch (ClassNotFoundException e) {
                        System.err.println("Class not found while deserializing train list: " + e.getMessage());
                        e.printStackTrace();
                    } finally {
                        try {
                            clientSocket.close();
                        } catch (IOException e) {
                            System.err.println("Error closing client socket: " + e.getMessage());
                            e.printStackTrace();
                        }
                    }
                });
                clientThread.start();
            }
        } catch (IOException e) {
            System.err.println("I/O error while starting server: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public synchronized void saveList(List<Train> trainList) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("trainList.dat"))) {
            Thread.sleep(1000); // Simulate a delay
            oos.writeObject(trainList);
            System.out.println("Train list saved successfully.");
        } catch (IOException e) {
            System.err.println("I/O error while saving train list: " + e.getMessage());
            e.printStackTrace();
        } catch (InterruptedException e) {
            System.err.println("Thread interrupted while saving train list: " + e.getMessage());
            e.printStackTrace();
            Thread.currentThread().interrupt(); // Restore interrupted status
        }
    }

    public synchronized void readList() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("trainList.dat"))) {
            List<Train> trainList = (List<Train>) ois.readObject();
            System.out.println("Train list read successfully:");
            for (Train train : trainList) {
                System.out.println("Train name: " + train.getName());
            }
        } catch (IOException e) {
            System.err.println("I/O error while reading train list: " + e.getMessage());
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.err.println("Class not found while deserializing train list: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void saveOrRead(List<Train> trainList) {
        System.out.println("Do you want to write or read the train list? (w/r)");
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();
        if (choice.equals("w")) {
            saveList(trainList);
        } else if (choice.equals("r")) {
            readList();
        } else {
            System.out.println("Invalid choice. Please enter 'w' for write or 'r' for read.");
        }
    }
    }