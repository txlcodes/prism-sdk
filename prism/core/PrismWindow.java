package prism.core;

import javax.swing.*;
import java.awt.*;

public class PrismWindow {
    private static JFrame frame;
    private static JPanel panel;
    
    public static void initialize(int width, int height) {
        frame = new JFrame("Prism SDK");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width, height);
        frame.setLocationRelativeTo(null); // Center window
        
        // Use absolute positioning for simplicity
        panel = new JPanel();
        panel.setLayout(null); // Absolute positioning
        frame.add(panel);
        
        frame.setVisible(true);
        System.out.println("🪟 Prism Window Created!");
    }
    
    public static void addComponent(Component component) {
        panel.add(component);
        panel.revalidate();
        panel.repaint();
    }
}