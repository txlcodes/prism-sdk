import prism.components.PrismButton;
import prism.core.PrismWindow;

public class Main {
    public static void main(String[] args) {
        System.out.println("🎨 Starting Prism SDK with REAL GUI!");
        
        // Initialize window FIRST (400x300 pixels)
        PrismWindow.initialize(400, 300);
        
        // Create and render REAL button
        PrismButton button = PrismButton.create("Click Me!")
                                      .withPosition(50, 50)
                                      .withSize(120, 45);
        
        button.render();
        button.onClick(() -> {
            System.out.println("✅ Button actually works!");
        });
        
        System.out.println("✨ Look! A REAL window with a REAL button!");
    }
}