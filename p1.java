import javax.swing.*;
import java.awt.*;

public class p1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Layout Example");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // FlowLayout
        JPanel flowLayoutPanel = new JPanel(new FlowLayout());
        flowLayoutPanel.add(new JButton("Button 1"));
        flowLayoutPanel.add(new JButton("Button 2"));
        frame.add(flowLayoutPanel, BorderLayout.NORTH);

        // BorderLayout
        JPanel borderLayoutPanel = new JPanel(new BorderLayout());
        borderLayoutPanel.add(new JButton("North"), BorderLayout.NORTH);
        borderLayoutPanel.add(new JButton("South"), BorderLayout.SOUTH);
        borderLayoutPanel.add(new JButton("East"), BorderLayout.EAST);
        borderLayoutPanel.add(new JButton("West"), BorderLayout.WEST);
        borderLayoutPanel.add(new JButton("Center"), BorderLayout.CENTER);
        frame.add(borderLayoutPanel, BorderLayout.CENTER);

        // GridLayout
        JPanel gridLayoutPanel = new JPanel(new GridLayout(2, 2));
        gridLayoutPanel.add(new JButton("Button 1"));
        gridLayoutPanel.add(new JButton("Button 2"));
        gridLayoutPanel.add(new JButton("Button 3"));
        gridLayoutPanel.add(new JButton("Button 4"));
        frame.add(gridLayoutPanel, BorderLayout.SOUTH);

        // Set frame size and visibility
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
