import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    private OvalButton[] holes = new OvalButton[9];
    private final Point[] positions = {
            new Point(50, 60),
            new Point(120, 200),
            new Point(300, 180),
            new Point(450, 250),
            new Point(100, 320),
            new Point(350, 60),
            new Point(200, 400),
            new Point(420, 120),
            new Point(260, 300)
    };

    public GamePanel() {
        this.setLayout(null);
        this.setBackground(Color.BLACK);
        initHoles();
    }

    private void initHoles() {
        for (int i = 0; i < 9; i++) {
            OvalButton hole = new OvalButton();
            hole.setBackground(Color.DARK_GRAY);
            hole.setFocusable(false);
            hole.setBounds(positions[i].x, positions[i].y, 90, 60); // 🔸 Position button manually
            hole.setVisible(true); // Set to false later when game logic is added

            final int index = i; // needed for lambda or anonymous class
            hole.addActionListener(e -> {
                System.out.println("Hole " + index + " clicked!");
            });

            holes[i] = hole;
            this.add(hole); // 🔸 Add to panel after setting position
        }
    }
}
