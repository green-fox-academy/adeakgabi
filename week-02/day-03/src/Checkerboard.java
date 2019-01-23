import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.

        int x = 0;
        int y = 0;
        int size = 20;
        //draw line

        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 16; j++) {
                drawSquare(x +(j*size*2), y , size , graphics);
            }
            y = y + size;
            if (i%2 == 0){
                x = size;
            } else {
                x = 0;
            }

        }


    }public static void  drawSquare (int x, int y, int size, Graphics graphics){
        graphics.setColor(new Color(100, 0, 100));
        graphics.fill3DRect(x, y, size, size, true);

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