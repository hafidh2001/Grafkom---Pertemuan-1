package org.yourorghere;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("Algoritma Lingkaran - Hafidh 027");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);

        gambar gbr = new gambar();
        gbr.setxc(100);
        gbr.setyc(100);
        gbr.setr(100);
        frame.add(gbr);
    }

}
