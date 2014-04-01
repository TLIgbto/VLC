/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.vlc.ui;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JToggleButton;


/**
 *
 * @author toure
 */
public class ControlPan extends JPanel {
    
    private JButton rewind;
    private JToggleButton pp;
    private JButton forward;
    private JButton prev;
    private JButton stop;
    private JButton next;
    private static final int WIDTH = 45;
    private static final int HEIGTH = 25;
    
    public ControlPan() {
        rewind = new JButton();
        ImageIcon icon = new ImageIcon("icons/backward.png");
        rewind.setIcon(icon);
        rewind.setPreferredSize(new Dimension(WIDTH, HEIGTH));
        pp = new JToggleButton();
        icon = new ImageIcon("icons/play.png");
        pp.setIcon(icon);
        pp.setPreferredSize(new Dimension(WIDTH, HEIGTH + 10));
        forward = new JButton();
        icon = new ImageIcon("icons/forward.png");
        forward.setIcon(icon);
        forward.setPreferredSize(new Dimension(WIDTH, HEIGTH));
        prev = new JButton();
        icon = new ImageIcon("icons/first.png");
        prev.setIcon(icon);
        prev.setPreferredSize(new Dimension(WIDTH, HEIGTH));
        stop = new JButton();
        stop.setPreferredSize(new Dimension(WIDTH, HEIGTH));
        icon = new ImageIcon("icons/stop.png");
        stop.setIcon(icon);
        next = new JButton();
        stop.setPreferredSize(new Dimension(WIDTH, HEIGTH));
        icon = new ImageIcon("icons/last.png");
        next.setIcon(icon);
        next.setPreferredSize(new Dimension(WIDTH, HEIGTH));
        //setLayout(new GridLayout(2, 3, 5, 5));
        add(rewind);
        add(pp);
        add(forward);
        add(prev);
        add(stop);
        add(next);
        setPreferredSize(new Dimension(170, 800));        
    }
    public Insets getInsets() {
        return (new Insets(5, 0, 5, 0));
    }  
}
