package com.fawzan.de;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

/**
 * Created by Fawzan
 * on 7/26/16
 * <fawzanm@gmail.com>
 */
public class Circle extends Shape {
    private int x,y,radius;



        public Circle(int x, int y, int radius) {
            this.x = x;
            this.y = y;
            this.radius = radius;
        }

        public Circle(Color color, int x, int y, int radius) {
            super(color);
            this.x = x;
            this.y = y;
            this.radius= radius;
        }


        @Override
        public void draw(Graphics g) {

            Graphics2D g2 = (Graphics2D) g;

            Ellipse2D q = new Ellipse2D.Double();

            g2.setColor(this.color);
            g2.draw(new Ellipse2D.Double(x, y,2*radius,2*radius));


        }
}
