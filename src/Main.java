import javax.swing.*;
import packages.informationPage;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        // Create and configure the main frame
        JFrame frame = new JFrame("survey form");
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(true);

        // Create and configure the main panel
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBounds(0, 0, 600, 600);
        panel.setBackground(new Color(227, 208, 106));

        Font font = new Font("Arial", Font.BOLD, 20);

        // Create title label
        JLabel title = new JLabel("survey form");
        title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setForeground(Color.DARK_GRAY);
        title.setFont(font);

        // Create start button
        JButton startButton = new JButton("start");
        startButton.setHorizontalAlignment(SwingConstants.CENTER);
        startButton.setBackground(new Color(223, 185, 89));
        startButton.setForeground(Color.DARK_GRAY);
        startButton.setOpaque(true);
        startButton.setBorderPainted(false);
        startButton.setFocusPainted(false);

        // Add components to the panel
        panel.add(title, BorderLayout.NORTH);
        panel.add(startButton, BorderLayout.CENTER);

        // Add panel to the frame
        frame.add(panel);

        // Add action listener to the start button
        startButton.addActionListener(e -> {
            // Remove the current panel
            frame.remove(panel);
            frame.revalidate();
            frame.repaint();

            // Load and display the first page
            informationPage informationPage = new informationPage();
            informationPage.create(frame);

            // Refresh the frame
            frame.revalidate();
            frame.repaint();
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}
