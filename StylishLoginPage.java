import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StylishLoginPage {

    // Hardcoded username and password for simplicity
    private static final String USERNAME = "user";
    private static final String PASSWORD = "password";

    public static void main(String[] args) {
        // Create frame for the login window
        JFrame frame = new JFrame("Login Page");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Set the background color of the frame
        frame.getContentPane().setBackground(new Color(42, 42, 42));

        // Create a panel to hold the login form
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        panel.setBackground(new Color(58, 58, 58));
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(10, 10, 10, 10); // Space between components
        constraints.gridx = 0;
        constraints.gridy = 0;

        // Create and style labels
        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setForeground(Color.YELLOW);
        usernameLabel.setFont(new Font("Arial", Font.BOLD, 14));

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setForeground(Color.YELLOW);
        passwordLabel.setFont(new Font("Arial", Font.BOLD, 14));

        // Create and style text fields
        JTextField usernameField = new JTextField(20);
        usernameField.setFont(new Font("Arial", Font.PLAIN, 14));
        usernameField.setBackground(new Color(238, 238, 238));
        usernameField.setBorder(BorderFactory.createLineBorder(new Color(100, 100, 100)));

        JPasswordField passwordField = new JPasswordField(20);
        passwordField.setFont(new Font("Arial", Font.PLAIN, 14));
        passwordField.setBackground(new Color(238, 238, 238));
        passwordField.setBorder(BorderFactory.createLineBorder(new Color(100, 100, 100)));

        // Create and style login button
        JButton loginButton = new JButton("Login");
        loginButton.setFont(new Font("Arial", Font.BOLD, 14));
        loginButton.setBackground(new Color(0, 153, 255));
        loginButton.setForeground(Color.WHITE);
        loginButton.setFocusPainted(false);
        loginButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        // Add action listener for login button
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the entered username and password
                String enteredUsername = usernameField.getText();
                char[] enteredPassword = passwordField.getPassword();

                // Check if entered username and password match the hardcoded credentials
                if (USERNAME.equals(enteredUsername) && PASSWORD.equals(new String(enteredPassword))) {
                    // Successful login
                    JOptionPane.showMessageDialog(frame, "Login Successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    // Failed login
                    JOptionPane.showMessageDialog(frame, "Invalid Username or Password!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Adding components to the panel with proper constraints
        panel.add(usernameLabel, constraints);
        constraints.gridx = 1;
        panel.add(usernameField, constraints);
        constraints.gridx = 0;
        constraints.gridy = 1;
        panel.add(passwordLabel, constraints);
        constraints.gridx = 1;
        panel.add(passwordField, constraints);
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        panel.add(loginButton, constraints);

        // Add the panel to the frame
        frame.add(panel, BorderLayout.CENTER);

        // Set the frame size, position, and make it visible
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);  // Center the window on screen
        frame.setVisible(true);
    }
}
