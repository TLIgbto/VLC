/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.vlc.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author toure
 */
public class ControlPan extends JPanel implements ActionListener {
    
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
        pp.addActionListener(this);
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

    /**
     * Invoked when an action occurs.
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if(pp.isSelected()){
            ImageIcon icon = new ImageIcon("icons/pause.png");
            pp.setIcon(icon);
        }else{
            ImageIcon icon = new ImageIcon("icons/play.png");
            pp.setIcon(icon);
        }
    }
}
