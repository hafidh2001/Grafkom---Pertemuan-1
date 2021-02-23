package org.yourorghere;

import java.awt.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("algoritma garis bresenham");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        algoritma_Bresenham grs = new algoritma_Bresenham();
        
        grs.setx0(200);
        grs.sety0(100);
        grs.setx1(250);
        grs.sety1(100);
        grs.setBackground(Color.BLUE);
        
        frame.add(grs);
        frame.setSize(600,400);
        frame.setVisible(true);
        
    }       
        
}
