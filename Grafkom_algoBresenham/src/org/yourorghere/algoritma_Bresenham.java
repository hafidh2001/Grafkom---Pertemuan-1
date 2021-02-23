package org.yourorghere;

import java.awt.Graphics;
import javax.swing.JPanel;

public class algoritma_Bresenham extends JPanel {
    private int x0, y0, x1, y1;
    
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
    
    public void sety0(int y0) {
        this.y0 = y0 * 100;
    }
    
    public void setx1(int x1) {
        this.x1 = x1 * 100;
    }
    
    public void sety1(int y1) {
        this.y1 = y1 * 100;
    }
    
    @Override
    public void paint(Graphics g) {
        int x, y, x_end;
        int dx = Math.abs(x0 - x1);
        int dy = Math.abs(y1 - y0);
        int p = 2*dy - dx;
        int duady = 2*dy;
        int duadydx = 2*(dy - dx);
        if (x0>x1) {
            x = x1;
            y = y1;
            x_end = x0;
        } else {
            x = x0;
            y = y0;
            x_end = x1;
        }
        
       
        g.drawRect(x, y, 4, 4);
        while(x < x_end) {
            x++;
            if(p < 0) {
                p = p + duady;
            } else {
                if (y0 > y1) {
                    y--; 
                } else { 
                y++;
                p = p + duadydx;
            }
                
            g.drawRect(x, y, 4, 4);
            }
        }
    }
}
