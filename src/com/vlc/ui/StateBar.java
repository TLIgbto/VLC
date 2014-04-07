package com.vlc.ui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by donatien on 06/04/14.
 */
public class StateBar extends JPanel {
    public StateBar(){
        setLayout(new BorderLayout());
        left leftpane = new left();
        JPanel middle = new JPanel();
        JLabel center = new JLabel();
        center.setText("15 elements");
        middle.add(center);
        right rightpane = new right();
        add(leftpane, BorderLayout.WEST);
        add(middle, BorderLayout.CENTER);
        add(rightpane, BorderLayout.EAST);
    }
}


class left extends JPanel{

    private static final int WIDTH = 40;
    private static final int HEIGHT = 20;

    public left() {
        JToggleButton plus = new JToggleButton();
        plus.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        ImageIcon icon = new ImageIcon("icons/plus.png");
        plus.setIcon(icon);
        JToggleButton shuffle = new JToggleButton();
        shuffle.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        icon = new ImageIcon("icons/shuffle.png");
        shuffle.setIcon(icon);
        JToggleButton loop = new JToggleButton();
        loop.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        icon = new ImageIcon("icons/loop.png");
        loop.setIcon(icon);
        add(plus);
        add(shuffle);
        add(loop);
        setPreferredSize(new Dimension(170, 30));
    }

}

class right extends JPanel{
    private static final int WIDTH = 10;
    private static final int HEIGHT = 20;
    public right(){
        JTextField searchField = new JTextField();
        searchField.setPreferredSize(new Dimension(WIDTH+60,HEIGHT));
        JButton searchButton = new JButton();
        searchButton.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        ImageIcon icon = new ImageIcon("icons/plus.png");
        searchButton.setIcon(icon);
        add(searchButton);
        add(searchField);
        setPreferredSize(new Dimension(95,30));
    }
}