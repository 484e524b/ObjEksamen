import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;

public class EventTrain extends JFrame implements ActionListener {
    private final JButton startBtn;

    public EventTrain() {
        startBtn = new JButton("Random Event");
        startBtn.addActionListener(this);
        add(startBtn);
        setSize(500, 500);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startBtn) {
            Random rand = new Random();
            int randomNumber = rand.nextInt(8);
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
                    System.out.println("Error");
            }
            ClientMethod client = new ClientMethod();
            client.sendData("localhost", 12345);
        }
    }
}