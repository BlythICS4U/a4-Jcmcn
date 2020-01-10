package problem2;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class GraphicsJPanel extends JPanel {

    public void paintComponent(Graphics g) {
    super.paintComponent(g);
    
    /*
    The background of an 640x640 area in the frame is set to black and with the 
    use of two while loops the black squares are put with starting points 160
    pixels away from one another, a row at a time.
    */
    
    g.setColor(Color.red);
    g.fillRect(0, 0, 640, 640);
    
    g.setColor(Color.black);
    int x = 0;
    int y = 560;
    while (x != 560 && y != -80){
    g.fillRect(x, y, 80, 80);
    x += 160;
    if (x == 640){
        x = 0;
        y -= 160;
    }
    }
    x = 80;
    y = 0;
    while (x != 720 && y != 640){
        g.fillRect(x, y, 80, 80);
        x += 160;
        if (x == 720){
            x = 80;
            y += 160;
        }
    }
    
    
    
    
    }
    public GraphicsJPanel() {

    }


}

