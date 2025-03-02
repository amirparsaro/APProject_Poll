package packages;

import java.awt.Font;

import javax.swing.*;
import java.awt.*;

public class thankYouPage {

    public void create(JFrame frame) {

        // Create and configure the panel
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBounds(0, 0, 600, 600);
        panel.setBackground(new Color(227, 208, 106));

        Font font = new Font("Arial", Font.BOLD, 20);

        // Create thank you label
        JLabel thankYouLabel = new JLabel("Thanks for your participation!");
        thankYouLabel.setBounds(10, 10, 200, 20);
        thankYouLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Add components to the panel
        panel.add(thankYouLabel, BorderLayout.CENTER);

        // Add panel to the frame
        frame.add(panel);


    }


}
