import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;

public class Main extends JFrame {

    public Main() {
        this.setTitle("Batter Up!");
        this.setSize(600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(new GamePanel());
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}

class GamePanel extends JPanel {
    public GamePanel() {
        this.setBackground(Color.BLACK);  // game background color
    }
}
