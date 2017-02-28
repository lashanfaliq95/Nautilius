package com.fawzan.de;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Fawzan
 * on 7/26/16
 * <fawzanm@gmail.com>
 */
public class Main extends JPanel {

    private static int WIDTH = 1100;
    private static int HEIGHT =700;

    private static ArrayList<Shape> listOfShapes;

    public static void main(String[] args) {
        // write your code here


        JFrame frame = new JFrame("Some Shapes");

        frame.setContentPane(new Main());
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        frame.setSize(WIDTH, HEIGHT);
        frame.pack();
        frame.setVisible(true);
        frame.setLayout(null);

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Line line = new Line(Color.red, 0, 0, 400, 600);
        Square square = new Square(Color.green, 10, 10, 300, 300);
        Square n1=new Square(Color.black,20,20,100,100);
        Triangle s=new Triangle(Color.red,100,100,200,200,300,300);
        Circle z=new Circle(400,400,50);
        Nautilus n=new Nautilus(Color.red,10,10,50);
        //line.draw(g);
        //square.draw(g);

        //s.draw(g);

        n.draw(g);
    }
}
