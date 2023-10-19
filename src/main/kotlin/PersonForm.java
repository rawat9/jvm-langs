import lab02.Person;
import lab02.PersonHandler;

import javax.swing.*;

public class PersonForm {
    public static void createFrame() {
        JFrame frame = new JFrame("PersonForm");
        JPanel panel = new JPanel();
        DefaultListModel<String> model = new DefaultListModel<>();
        JList<String> list = new JList<>(model);

        PersonHandler personHandler = new PersonHandler();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(470, 500);
        frame.add(panel);

        panel.setLayout(null);

        // Name
        JLabel nameLabel = new JLabel("Name");
        nameLabel.setBounds(50, 20, 40, 25);
        panel.add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(50, 45, 160, 30);
        panel.add(nameField);

        // Age
        JLabel ageLabel = new JLabel("Age");
        ageLabel.setBounds(50, 95, 40, 25);
        panel.add(ageLabel);

        JTextField ageField = new JTextField();
        ageField.setBounds(50, 120, 160, 30);
        panel.add(ageField);

        // Height
        JLabel heightLabel = new JLabel("Height (in cm)");
        heightLabel.setBounds(50, 170, 140, 25);
        panel.add(heightLabel);

        JTextField heightField = new JTextField();
        heightField.setBounds(50, 195, 80, 30);
        panel.add(heightField);

        JButton heightInInchesButton = new JButton("In Inch");
        heightInInchesButton.setBounds(130, 195, 80, 30);
        panel.add(heightInInchesButton);

        heightInInchesButton.addActionListener(e -> {
            double height = Double.parseDouble(heightField.getText());
            double heightInInches = personHandler.getHeightInInches(height);
            heightField.setText(String.format("%.2f", heightInInches));
        });

        // Weight
        JLabel weightLabel = new JLabel("Weight (in kg)");
        weightLabel.setBounds(50, 245, 140, 25);
        panel.add(weightLabel);

        JTextField weightField = new JTextField();
        weightField.setBounds(50, 270, 160, 30);
        panel.add(weightField);

        // Email
        JLabel emailLabel = new JLabel("Email address");
        emailLabel.setBounds(50, 320, 140, 25);
        panel.add(emailLabel);

        JTextField emailField = new JTextField();
        emailField.setBounds(50, 345, 160, 30);
        panel.add(emailField);

        // Persons List
        JLabel personsListLabel = new JLabel("Persons List");
        personsListLabel.setBounds(250, 20, 140, 25);
        panel.add(personsListLabel);

        list.setBounds(250, 50, 200, 300);
        panel.add(list);

        JButton button = new JButton("Create");
        button.setBounds(50, 400, 160, 40);
        panel.add(button);

        button.addActionListener(e -> {
            String name = nameField.getText();
            int age = Integer.parseInt(ageField.getText());
            int height = Integer.parseInt(heightField.getText());
            int weight = Integer.parseInt(weightField.getText());
            String email = emailField.getText();

            Person person = personHandler.createPerson(name, age, height, weight, email);
            model.add(0, person.getName());
            personHandler.addToList(person);
            System.out.println(person);
        });

        // Display the window.
        frame.setVisible(true);
    }
}
