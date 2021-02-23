package haped_DDA;

import java.awt.*;
import javax.swing.*;

public class Main {
        public static void main(String[] args) {
        
        // Deklarasi Variabel
        JFrame frame = new JFrame("Algoritma DDA - Hafidh_027");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        algoritma_DDA grs = new algoritma_DDA();
        
        // Input Data garis
        grs.setx0(-5);
        grs.sety0(5);
        grs.setx1(1);
        grs.sety1(2);
        
        grs.setBackground(Color.red);
        
        frame.add(grs);
        frame.setSize(1000,1000);
        frame.setVisible(true);
    }
}