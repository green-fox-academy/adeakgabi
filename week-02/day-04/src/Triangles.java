import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    public static void mainDraw(Graphics graphics) {


        int lineStartOnX = 40;
        int bottom = 300;
        int triangleSide = 12;
        int triangleHigh = 10;

        drawLines(lineStartOnX, bottom, triangleSide, triangleHigh, graphics);



    }public static void drawLines (int lineStartOnX, int bottom, int triangleSide, int triangleHigh, Graphics graphics){
        graphics.setColor((new Color(100,200,100)));
        int middleOfX = 160;
        int topOfTheTriangle = 300- (20 * triangleHigh);
        for (int i = 0; i < 20; i++) {
            graphics.drawLine(lineStartOnX + (i*triangleSide), bottom , middleOfX + (i*(triangleSide/2)), topOfTheTriangle + (i*triangleHigh));
            graphics.drawLine(WIDTH-lineStartOnX - (i*triangleSide), bottom , middleOfX - (i*(triangleSide/2)), topOfTheTriangle + (i*triangleHigh));
            graphics.drawLine(lineStartOnX + (i*(triangleSide/2)), bottom - (i*triangleHigh), WIDTH-lineStartOnX - (i*(triangleSide/2)), bottom - (i*triangleHigh) );
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