package com.company;

import java.awt.*;

public class DDALineDrawer implements LineDrawer {
    private PixelDrawer pd;

    public DDALineDrawer(PixelDrawer pd) {
        this.pd = pd;
    }

    @Override
    public void drawLine(ScreenPoint p1, ScreenPoint p2) {
        double x1 = p1.getX();
        double x2 = p2.getX();
        double y1 = p1.getY();
        double y2 = p2.getY();
        double dx = x2 - x1;
        double dy = y2 - y1;

        if (Math.abs(dx) > Math.abs(dy)){
            if(x1 > x2){
                int tmp = (int) x1; x1 = x2; x2 = tmp;
                tmp = (int) y1; y1 = y2; y2 = tmp;
            }

            double k = dy / dx;

            for (int j = (int) x1; j <= x2; j++) {
                double i = k * (j-x1) + y1;
                pd.setPixel(j, (int)i, Color.RED);
            }



        } else{
            if(y1 > y2){
                int tmp = (int) x1; x1 = x2; x2 = tmp;
                tmp = (int) y1; y1 = y2; y2 = tmp;
            }

            double k = dx / dy;

            for (int i = (int) y1; i <= y2; i++) {
                double j = k * (i-y1) + x1;
                pd.setPixel((int)j, i, Color.GREEN);
            }

        }

    }
}
