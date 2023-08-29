import  javax.swing.*
;
import java.awt.*;

public class Main {
    public static void main(String[] args) {





        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Test Application");
            frame.setPreferredSize(new Dimension(500,350));
            frame.setContentPane(new form().panel1);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);

            String iconPath = "C:\\\\Users\\\\Acer\\\\Desktop\\\\download2.png"; // Replace with the actual path of your icon file
            ImageIcon icon = new ImageIcon(iconPath);
            frame.setIconImage(icon.getImage());



        });



    }
}