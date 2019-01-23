import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.

        int lineX = 0;
        int lineY = 0;
        for (int i = 0; i < 17; i++) {
            drawOneLine(lineX + i*20, lineY , graphics);
            drawOneLine(lineX, lineY + i *20, graphics);
            drawOneLine(lineX + i*20, lineY + 320, graphics);
            drawOneLine(lineX + 320, lineY + i *20, graphics);
        }

    }public static void drawOneLine (int lineX, int lineY, Graphics graphics){
        int center = 160;
        graphics.drawLine(lineX, lineY, center, center);


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