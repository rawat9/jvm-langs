import com.formdev.flatlaf.themes.FlatMacLightLaf;

import javax.swing.*;

public class Application {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatMacLightLaf());
        } catch (Exception e) {
            System.out.println("Failed to set FlatMacDarkLaf theme");
        }
        SwingUtilities.invokeLater(PersonForm::createFrame);
    }
}