import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenterBoxFunction {

    public static void mainDraw(Graphics graphics){
        // create a square drawing function that takes 2 parameter:
        // the square size and the graphics
        // and draws a square of that size to the center of the canvas.
        // draw 3 squares with that function.
        // avoid code duplication.

        int size = 50;
        for (int i = 0; i < 3; i++) {
            drawSquare(size * (i+1), graphics);

        }



    }
    public static void drawSquare (int size, Graphics graphics){
        int center = 160;
        graphics.drawLine((center - (size/2)), (center - (size/2)), (center + (size/2)),(center - (size/2)));
        graphics.drawLine((center + (size/2)), (center - (size/2)),(center + (size/2)), (center + (size/2)) );
        graphics.drawLine((center + (size/2)), (center + (size/2)), (center - (size/2)), (center + (size/2)) );
        graphics.drawLine((center - (size/2)), (center + (size/2)), (center - (size/2)), (center - (size/2)) );

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