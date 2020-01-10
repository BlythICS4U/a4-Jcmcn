/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem4;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Joca
 */
class BallPanel extends JPanel implements ActionListener {

    /*
    Setting a timer that will update the balls
    */
    
    int delay = 10;
    Timer timer;
    int[] x = {800, 700, 600, 500, 400, 300, 200, 100, 0, 700};
    int[] y = {0, 100, 200, 300, 400, 500, 600, 700, 800, 700};
    int radius = 15;
    int[] dx = {4, -3, 5, 1, 2, 4, -3, 5, 1, 2};
    int[] dy = {-2, 3, -1, -5, -4, -2, 3, -1, -5, -4};

    public BallPanel() {

        timer = new Timer(delay, this);
        timer.start();
    }

    @Override

    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    @Override

    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        
        /*
        Using a for loop with a count of 10 create a ball everysingle time the 
        timer triggers, updating the balls.
        Each ball has a different velocity and starting point that are put in a
        array.
        */

        for (int i = 0; i != 10; i++) {

            g.setColor(Color.blue);
            if (x[i] < radius) {
                dx[i] = Math.abs(dx[i]);
            }
            if (x[i] > getWidth() - radius) {
                dx[i] = -Math.abs(dx[i]);
            }
            if (y[i] < radius) {
                dy[i] = Math.abs(dy[i]);
            }
            if (y[i] > getHeight() - radius) {
                dy[i] = -Math.abs(dy[i]);
            }
            x[i] += dx[i];
            y[i] += dy[i];
            g.fillOval(x[i] - radius, y[i] - radius, radius * 2, radius * 2);

        }

    }

}