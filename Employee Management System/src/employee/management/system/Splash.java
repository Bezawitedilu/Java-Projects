package employee.management.system;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame {
    Splash(){
        // Setting background color and layout
        getContentPane().setBackground(Color.WHITE);
        setLayout(new BorderLayout()); // Using BorderLayout for better layout management

        // Creating and customizing the heading label
        JLabel heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM", SwingConstants.CENTER); // Center aligning the text
        heading.setFont(new Font("Arial", Font.BOLD, 36));
        heading.setForeground(Color.BLUE);
        add(heading, BorderLayout.NORTH); // Placing the heading at the top

        // Loading and displaying an image
        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("images/Javaproj1.jpg"));
        Image scaledImage = icon.getImage().getScaledInstance(700, 400, Image.SCALE_DEFAULT);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        JLabel imageLabel = new JLabel(scaledIcon);
        imageLabel.setHorizontalAlignment(SwingConstants.CENTER); // Center aligning the image
        add(imageLabel, BorderLayout.CENTER); //CENTERING IMAGE

        // Creating and customizing a button
        JButton continueButton = new JButton("Continue");
        continueButton.setPreferredSize(new Dimension(200, 50));
        continueButton.setBackground(Color.BLACK);
        continueButton.setForeground(Color.WHITE);
        continueButton.setFocusPainted(false); // Removing focus border
        continueButton.setFont(new Font("Arial", Font.PLAIN, 20));
//        continueButton.addActionListener(e -> dispose()); // Closing the splash screen when the button is clicked
        add(continueButton, BorderLayout.SOUTH); // Placing the button at the bottom

        // Setting window size, location, and visibility
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exiting the application when the window is closed
        setVisible(true);
    }

    public static void main(String args[]){
        new Splash();
    }
}
