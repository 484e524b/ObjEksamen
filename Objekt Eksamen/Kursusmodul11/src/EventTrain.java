import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class EventTrain extends JFrame implements ActionListener {
    private JButton startBtn;

    public EventTrain() {
        try {
        startBtn = new JButton("Random Event");
        //startBtn = null; // Simulating NullPointerException
        startBtn.addActionListener(this);
        add(startBtn);
        setSize(500, 500);
        setVisible(true);
    }
        catch (NullPointerException e) {
            System.out.println("Button is a null value: " + e);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
try {

            if (e.getSource() == startBtn) {
                Random rand = new Random();
                int randomNumber = rand.nextInt(10); // Simulating IndexOutOfBoundsException
                switch (randomNumber) {
                    case 1:
                        ClientMethod.trainList.add(new Train("Train " + 1));
                        break;
                    case 2:
                        ClientMethod.trainList.add(new Train("Train " + 2));
                        break;
                    case 3:
                        ClientMethod.trainList.add(new Train("Train " + 3));
                        break;
                    case 4:
                        ClientMethod.trainList.add(new Train("Train " + 4));
                        break;
                    case 5:
                        ClientMethod.trainList.add(new Train("Train " + 5));
                        break;
                    case 6:
                        ClientMethod.trainList.add(new Train("Train " + 6));
                        break;
                    case 7:
                        ClientMethod.trainList.add(new Train("Train " + 7));
                        break;
                    case 8:
                        ClientMethod.trainList.add(new Train("Train " + 8));
                        break;
                    default:
                        break;
                }
                Train train = ClientMethod.trainList.get(randomNumber); // Accessing List
                System.out.println(train.getName());
                ClientMethod client = new ClientMethod();
                client.sendData("localhost", 12345);
            }
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Change random number bound: " + ex);
        }
    }
}