package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class DrawPanel extends JPanel {
    ArrayList<Line> lines;

    @Override
    public void paint(Graphics g) {
        BufferedImage bi = new BufferedImage(getWidth(), getHeight(),
                BufferedImage.TYPE_INT_RGB);
        PixelDrawer pd = new BufferedImagePixelDrawer(bi);
        LineDrawer ld = new DDALineDrawer(pd);

        for (Line l : lines) {

        }

        g.drawImage(bi, 0, 0, null);
    }
}
