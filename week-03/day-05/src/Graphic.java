import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Graphic {
    public static void mainDraw(Graphics graphics) {

        int startLine1= WIDTH/3;
        int startLine2 = (WIDTH/3)*2;
        int zero = 0;
        int h = HEIGHT;
        int n = 8;

       drawLines(startLine1,startLine2, zero, h, graphics, n);

    }public static void drawLines (int startLine1, int startLine2, int zero, int h, Graphics graphic, int n){
        if (n == 1){
            graphic.drawLine(startLine1, zero, startLine1,  h);
        }
        else {

            graphic.drawLine(startLine1, zero, startLine1,  h);
            drawLines( startLine1, zero, startLine1, h, graphic, n-1);
            drawLines( zero, startLine2, h, startLine1, graphic, n-1);
            drawLines( zero, startLine1, h, startLine1, graphic, n-1);
            drawLines( zero, startLine2, h, startLine2, graphic, n-1);

        }

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