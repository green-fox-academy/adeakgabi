import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.

        int lineX = 320;
        int lineY = 320;
        int lineXend = 0;
        int lineYend = 0;
        for (int i = 0; i < 16; i++) {
            graphics.setColor(new Color(100, 0, 100));
            drawLines(lineX - (i*20), lineYend , lineX, lineY -(i*20), graphics);
            graphics.setColor((new Color(0,200,0)));
            drawLines(lineXend + (i*20), lineY , lineXend, lineYend + (i*20), graphics);
        }

    }public static void drawLines (int lineX, int lineY, int lineXend, int lineYend, Graphics graphics){

        graphics.drawLine(lineX, lineY, lineXend, lineYend);


    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}