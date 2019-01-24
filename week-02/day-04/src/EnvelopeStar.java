import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
    public static void mainDraw(Graphics graphics) {


        int lineStart = 160;
        int lineEnd = 0;
        int space = 15;

        drawLines(lineStart, lineEnd, space, graphics);



    }public static void drawLines (int lineStart, int lineEnd, int space, Graphics graphics){
        graphics.setColor((new Color(0,200,0)));
        for (int i = 0; i < 11; i++) {
            graphics.drawLine(lineStart - (i*space), lineStart , lineStart, lineEnd + (i*space));
            graphics.drawLine(lineStart + (i*space), lineStart , lineStart, lineEnd + (i*space));
            graphics.drawLine(lineStart - (i*space), lineStart , lineStart, lineEnd + 320 - (i*space));
            graphics.drawLine(lineStart + (i*space), lineStart , lineStart, lineEnd + 320 - (i*space));
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