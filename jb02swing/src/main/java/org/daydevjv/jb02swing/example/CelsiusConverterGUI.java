package org.daydevjv.jb02swing.example;

import javax.swing.*;
import java.awt.*;

public class CelsiusConverterGUI extends JFrame {
    private JPanel mainPanel;
    private JTextField celsiusTextField;
    private JLabel celsiusLabel;
    private JButton convertButton;
    private JLabel fahrenheitLabel;

    public CelsiusConverterGUI(String title) throws HeadlessException {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        convertButton.addActionListener(e -> {
            String celsiusText = celsiusTextField.getText();
            int celsius = Integer.parseInt(celsiusText);
            double fahrenheit = celsius * 1.8 + 32;
            celsiusLabel.setText(String.format("%d Celsius", celsius));
            fahrenheitLabel.setText(String.format("%.1f Fahrenheit", fahrenheit));
        });
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame frame = new CelsiusConverterGUI("Celsius Converter");
            frame.setVisible(true);
        });
    }
}
