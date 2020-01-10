package problem2;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Problem2 {

    private static void createAndShowGUI() {

        JFrame f = new JFrame("Chess");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(640, 640);
        f.add(new GraphicsJPanel());
        f.setVisible(true);
        
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }
}




