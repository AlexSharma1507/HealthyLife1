package Alex;

import javax.swing.*;
import java.awt.*;

public class BMIPage extends JFrame {

    public BMIPage() {

        setTitle("BMI Calculator");
        setSize(450, 450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel card = new JPanel();
        card.setBackground(Color.WHITE);
        card.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        card.setLayout(new GridLayout(6, 1, 10, 10));

        JLabel title = new JLabel("BMI Calculator", SwingConstants.CENTER);
        title.setFont(new Font("SansSerif", Font.BOLD, 24));

        JTextField height = new JTextField();
        height.setBorder(BorderFactory.createTitledBorder("Height (cm)"));

        JTextField weight = new JTextField();
        weight.setBorder(BorderFactory.createTitledBorder("Weight (kg)"));

        JLabel result = new JLabel(" ", SwingConstants.CENTER);
        result.setFont(new Font("SansSerif", Font.PLAIN, 16));

        JButton calc = new JButton("Calculate BMI");
        calc.addActionListener(e -> {
            try {
                double h = Double.parseDouble(height.getText()) / 100.0;
                double w = Double.parseDouble(weight.getText());
                double bmi = w / (h * h);

                result.setText(String.format("Your BMI: %.2f", bmi));

            } catch (Exception ex) {
                result.setText("Enter valid numbers!");
            }
        });

        card.add(title);
        card.add(height);
        card.add(weight);
        card.add(calc);
        card.add(result);

        add(card, BorderLayout.CENTER);
    }
}
