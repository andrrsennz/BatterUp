import javax.swing.*;
import java.awt.*;

public class OvalButton extends JButton {
    public OvalButton() {
        setContentAreaFilled(false); // Don't fill default rectangle
        setBorderPainted(false); // Remove border
        setFocusPainted(false); // No focus ring
        setOpaque(false); // Transparent background
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();

        // Enable anti-aliasing for smooth oval
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Fill oval
        g2.setColor(Color.DARK_GRAY); // Hole color
        g2.fillOval(0, 0, getWidth(), getHeight());

        // Optional: draw an outline
        g2.setColor(Color.BLACK);
        g2.drawOval(0, 0, getWidth() - 1, getHeight() - 1);

        g2.dispose();
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(60, 60); // Make it round
    }

}
