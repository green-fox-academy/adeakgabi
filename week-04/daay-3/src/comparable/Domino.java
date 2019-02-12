package comparable;

import java.awt.*;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.util.Arrays;

public class Domino implements Comparable, Printable {
    private final int left;
    private final int right;

    public Domino(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public int getLeftSide() {
        return left;
    }

    public int getRightSide() {
        return right;
    }

    @Override
    public String toString() {
        return "[" + left + ", " + right + "]";
    }

    @Override
    public int compareTo(Object o) {
        Domino otherDomino = (Domino) o;
        if(this.left > otherDomino.left){
            return 1;
        } else if (this.left < otherDomino.left){
            return -1;
        }
        return 0;
    }

    public void printAllFields(Object o){
        System.out.println(o);
    }

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        return 0;
    }
}