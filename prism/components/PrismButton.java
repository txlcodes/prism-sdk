package prism.components;

import javax.swing.*;
import java.awt.*;
import prism.core.PrismWindow;

public class PrismButton {
    private String text;
    private int x, y;
    private int width = 100;
    private int height = 40;
    private JButton swingButton; // REAL Swing button
    
    public PrismButton(String text, int x, int y) {
        this.text = text;
        this.x = x;
        this.y = y;
        
        // Create actual Swing button
        this.swingButton = new JButton(text);
        swingButton.setBounds(x, y, width, height);
        swingButton.setBackground(new Color(0, 122, 255)); // iOS blue
        swingButton.setForeground(Color.WHITE);
        swingButton.setFocusPainted(false);
        swingButton.setBorder(BorderFactory.createEmptyBorder(10, 15, 10, 15));
        
        System.out.println("🔼 REAL PrismButton created: '" + text + "'");
    }
    
    // Fluent API methods
    public PrismButton withSize(int width, int height) {
        this.width = width;
        this.height = height;
        swingButton.setSize(width, height);
        return this;
    }
    
    public PrismButton withPosition(int x, int y) {
        this.x = x;
        this.y = y;
        swingButton.setLocation(x, y);
        return this;
    }
    
    // Render method - NOW ACTUALLY VISIBLE!
    public void render() {
        PrismWindow.addComponent(swingButton);
        System.out.println("🎨 REAL Button rendered in window: " + text);
    }
    
    // Click handler - NOW ACTUALLY WORKS!
    public void onClick(Runnable action) {
        swingButton.addActionListener(e -> {
            System.out.println("🖱️ REAL Button clicked: " + text);
            action.run();
        });
    }
    
    // Static factory method
    public static PrismButton create(String text) {
        return new PrismButton(text, 0, 0);
    }
}