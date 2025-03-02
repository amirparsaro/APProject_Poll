package packages;

import javax.swing.*;
import java.awt.*;

public class informationPage {

    public void create(JFrame frame) {
        // Create the main panel
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 600, 600);
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.setBackground(new Color(227, 208, 106));
        panel.add(Box.createRigidArea(new Dimension(280, 0)));

        // Name Label and Text Field
        JLabel nameLabel = new JLabel("نام: ");
        nameLabel.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        JTextField nameField = new JTextField(15);
        nameField.setBounds(210, 10, 200, 20);

        // Age Label and Text Field
        JLabel ageLabel = new JLabel("سن: ");
        ageLabel.setBounds(180, 50, 100, 20);
        JTextField ageField = new JTextField(15);
        ageField.setBounds(210, 50, 200, 20);

        // Email Label and Text Field
        JLabel emailLabel = new JLabel("ایمیل: ");
        emailLabel.setBounds(180, 90, 100, 20);
        JTextField emailField = new JTextField(15);
        emailField.setBounds(210, 90, 200, 20);

        // Software Familiarity Level
        JLabel levelLabel = new JLabel("سطح آشنایی با نرم افزارهای مشابه: ");
        levelLabel.setBounds(220, 130, 250, 20);

        JRadioButton level1 = new JRadioButton("مبتدی: ");
        level1.setBackground(new Color(227, 208, 106));
        level1.setBounds(100, 160, 100, 20);
        JRadioButton level2 = new JRadioButton("متوسط: ");
        level2.setBackground(new Color(227, 208, 106));
        level2.setBounds(200, 160, 100, 20);
        JRadioButton level3 = new JRadioButton("پیشرفته: ");
        level3.setBackground(new Color(227, 208, 106));
        level3.setBounds(300, 160, 100, 20);
        JRadioButton level4 = new JRadioButton("بدون آشنایی: ");
        level4.setBackground(new Color(227, 208, 106));
        level4.setBounds(400, 160, 150, 20);

        // Group the radio buttons
        ButtonGroup group = new ButtonGroup();
        group.add(level1);
        group.add(level2);
        group.add(level3);
        group.add(level4);

        // Next Page Button
        JButton nextButton = new JButton("صفحه بعد");
        nextButton.setBounds(250, 250, 100, 20);
        nextButton.setBackground(new Color(223, 185, 89));
        nextButton.setOpaque(true);
        nextButton.setBorderPainted(false);
        nextButton.setFocusPainted(false);
        nextButton.addActionListener(e -> {
            // Remove current panel and move to Page2
            frame.remove(panel);
            frame.revalidate();
            frame.repaint();

            questionsPage questionsPage = new questionsPage();
            questionsPage.create(frame);

            frame.revalidate();
            frame.repaint();
        });

        // Add components to the panel
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(ageLabel);
        panel.add(ageField);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(levelLabel);
        panel.add(level1);
        panel.add(level2);
        panel.add(level3);
        panel.add(level4);
        panel.add(nextButton);

        // Add panel to the frame
        frame.add(panel);
    }
}