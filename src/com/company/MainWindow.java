package com.company;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    DrawPanel dp;

    MainWindow() throws HeadlessException {
        dp = new DrawPanel();
        this.add(dp);
    }
}
