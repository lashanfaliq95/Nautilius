package com.fawzan.de;

import java.awt.*;
import java.awt.geom.Arc2D;

public class Nautilus extends Shape {
    private int x, y, size;


    public Nautilus(int x, int y, int size) {
        this.x = x;
        this.y = y;
        this.size = size;
    }

    public Nautilus(Color color, int x, int y, int size) {
        super(color);
        this.x = x;
        this.y = y;
        this.size = size;

    }


    private int fib(int n) {//a function of fibonacci
        if (n <= 2) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    @Override
    public void draw(Graphics g) {//getting the squares in to the given x and y
        Square sqr1 = new Square(x + (15 * size), y + (8 * size), fib(1) * size, fib(1) * size);
        Square sqr2 = new Square(x + (13 * size), y + (8 * size), fib(2) * size, fib(2) * size);
        Square sqr3 = new Square(x + (13 * size), y + (10 * size), fib(3) * size, fib(3) * size);
        Square sqr4 = new Square(x + (16 * size), y + (8 * size), fib(4) * size, fib(4) * size);
        Square sqr5 = new Square(x + (13 * size), y, fib(5) * size, fib(5) * size);
        Square sqr6 = new Square(x, y, fib(6) * size, fib(6) * size);
        Graphics2D g2 = (Graphics2D) g;


      /*  sqr1.draw(g);  //if want the the squares as well
        sqr2.draw(g);
        sqr3.draw(g);
        sqr4.draw(g);
        sqr5.draw(g);
        sqr6.draw(g);*/
        g2.setColor(this.color);

        //getting the curves through a cartesian pattern
        g2.draw(new Arc2D.Double(x + (fib(6) + fib(2) / 2) * size, y + fib(5) * size, 2 * fib(1) * size, 2 * fib(1) * size, 0, 90, Arc2D.OPEN));
        g2.draw(new Arc2D.Double(x + (fib(6)) * size, y + fib(5) * size, 2 * fib(2) * size, 2 * fib(2) * size, 90, 90, Arc2D.OPEN));
        g2.draw(new Arc2D.Double(x + fib(6) * size, y + (fib(5) - fib(1)) * size, 2 * fib(3) * size, 2 * fib(3) * size, 180, 90, Arc2D.OPEN));
        g2.draw(new Arc2D.Double(x + (fib(5) + fib(3)) * size, y + fib(3) * size, 2 * fib(4) * size, 2 * fib(4) * size, 0, -90, Arc2D.OPEN));
        g2.draw(new Arc2D.Double(x + (fib(4) * size), y, 2 * fib(5) * size, 2 * fib(5) * size, 0, 90, Arc2D.OPEN));
        g2.draw(new Arc2D.Double(x, y, 2 * fib(6) * size, 2 * fib(6) * size, 90, 90, Arc2D.OPEN));
    }
}
