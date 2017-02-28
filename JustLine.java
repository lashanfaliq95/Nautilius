package com.fawzan.de;

/**
 * Created by user on 8/3/2016.
 */
import java.awt.*;
import javax.swing.*;
import java.awt.geom.Line2D;
public class JustLine extends JPanel {
    static int WIDTH = 400;
    static int HEIGHT = 600;
    public JustLine() { }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D f = (Graphics2D) g;
        f.draw(new Line2D.Double(0, 0, WIDTH, HEIGHT));
    }
    public static void main(String [] args) {
        JFrame frame = new JFrame("Test");
        frame.setContentPane(new JustLine());
        frame.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        frame.setSize(WIDTH, HEIGHT);
        frame.pack();
        frame.setVisible(true);
    }
}