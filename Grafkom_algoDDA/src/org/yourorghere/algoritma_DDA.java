package org.yourorghere;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class algoritma_DDA extends JPanel {
    private int x0;
    private int y0;
    private int x1;
    private int y1;
    
   
    
    public int getx0() {
        return x0;
    }
    
    public int getx1() {
        return x1;
    }
    
    public int gety0() {
        return y0;
    }
    
    public int gety1() {
        return y1;
    }
    
    public void setx0(int x0) {
        this.x0 = x0 * 100;
    }
    
    public void setx1(int x1) {
        this.x1 = x1 * 100;
    }
    
    public void sety0(int y0) {
        this.y0 = y0 * 100;
    }
    
    public void sety1(int y1) {
        this.y1 = y1 * 100;
    }

    @Override
    public void paint(Graphics g) {
        int dx = x0 - x1;
        int dy = y0 - y1;
        int steps, k; 

        float x = x1;
        float y = y1;
        float x_inc, y_inc;
        

        super.paint(g);
        this.setBackground(Color.BLACK);
        g.setColor(Color.WHITE);

        if(Math.abs(dx) > Math.abs(dy)) steps = Math.abs(dx);
        else steps = Math.abs(dy);

        x_inc = dx /(float)steps;
        y_inc = dy /(float)steps;

        g.drawRect(Math.round(x), Math.round(y), 3, 3);
        for(k=0; k<steps; k++) {
            x += x_inc;
            y += y_inc;
            g.drawRect(Math.round(x), Math.round(y), 3, 3);
        }
    }
    
}
