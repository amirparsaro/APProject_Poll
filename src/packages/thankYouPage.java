package packages;

import java.awt.Font;

import javax.swing.*;

public class thankYouPage {

    public void create(JFrame frame) {

        // Create and configure the panel
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, 600, 600);

        Font font = new Font("Arial", Font.BOLD, 20);

        // Create thank you label
        JLabel thankYouLabel = new JLabel("Thanks for your participation!");
        thankYouLabel.setBounds(10, 10, 200, 20);

        // Add components to the panel
        panel.add(thankYouLabel);

        // Add panel to the frame
        frame.add(panel);


    }


}
