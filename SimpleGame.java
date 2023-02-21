import javax.swing.*;
import java.awt.event.*;

public class SimpleGame extends JFrame implements KeyListener {
    private JPanel panel;
    private JLabel square;
    private int x, y;

    public SimpleGame() {
        panel = new JPanel();
        square = new JLabel();
        square.setOpaque(true);
        square.setBackground(java.awt.Color.BLUE);
        square.setBounds(0, 0, 50, 50);
        panel.setLayout(null);
        panel.add(square);
        add(panel);
        addKeyListener(this);
        setFocusable(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_LEFT) {
            x -= 10;
            square.setBounds(x, y, 50, 50);
        } else if (code == KeyEvent.VK_RIGHT) {
            x += 10;
            square.setBounds(x, y, 50, 50);
        } else if (code == KeyEvent.VK_UP) {
            y -= 10;
            square.setBounds(x, y, 50, 50);
        } else if (code == KeyEvent.VK_DOWN) {
            y += 10;
            square.setBounds(x, y, 50, 50);
        }
    }

    public void keyReleased(KeyEvent e) {}

    public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        new SimpleGame();
    }
}