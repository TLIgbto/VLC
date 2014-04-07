/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vlc.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author toure
 */
public class ProgressPan extends JPanel {
    private Display display;
    private ControlPanDown controlPan;
    private NorthPan nt;
    public ProgressPan(NorthPan nt) {
        this.nt=nt;
        display= new Display();
        controlPan = new ControlPanDown(nt);
        setLayout(new BorderLayout());
        add(display);
        add(controlPan, BorderLayout.SOUTH);
    }
    public ControlPanDown getControlPan() {
        return controlPan;
    }

    public void setControlPan(ControlPanDown controlPan) {
        this.controlPan = controlPan;
    }
    public Insets getInsets() {
        return (new Insets(5, 10, 5, 10));
    }
}

class ControlPanDown extends JPanel implements ActionListener {

    private static final int WIDTH = 20;
    private static final int HEIGHT = 15;
    private JToggleButton playlist;
    private NorthPan nt;

    public ControlPanDown(NorthPan nt) {
        this.nt=nt;
        setLayout(new BorderLayout());
        JPanel volPan = new JPanel();
        JPanel settings = new JPanel();
        JButton mute = new JButton();
        mute.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        ImageIcon icon = new ImageIcon("icons/mute.png");
        mute.setBorder(null);
        mute.setIcon(icon);
        JSlider volSlider = new JSlider();
        JButton high = new JButton();
        high.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        high.setBorder(null);
        icon = new ImageIcon("icons/high.png");
        high.setIcon(icon);
        JButton equalizer = new JButton();
        icon = new ImageIcon("icons/equalizer.png");
        equalizer.setIcon(icon);
        playlist = new JToggleButton();
        icon = new ImageIcon("icons/menu.png");
        playlist.setIcon(icon);
        playlist.setSelected(false);
        playlist.addActionListener(this);
        volPan.add(mute);
        volPan.add(volSlider);
        volPan.add(high);
        settings.add(equalizer);
        settings.add(playlist);
        add(volPan, BorderLayout.WEST);
        add(settings, BorderLayout.EAST);
    }

    public void setPlaylist(boolean b){
        playlist.setSelected(b);
    }

    /**
     * Invoked when an action occurs.
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {

      if(playlist.isSelected()){
          this.nt.getPrincipalPan().setSouthPan(false);
          //setSize(new Dimension(getWidth(),120));
      }else {
          this.nt.getPrincipalPan().setSouthPan(true);
          //setSize(new Dimension(getWidth(),301));
      }
    }
}

class Display extends JPanel {

    public Display() {
        setBorder(new SoftBevelBorder(BevelBorder.RAISED, new Color(114, 104, 104),
                new Color(71, 66, 66), new Color(91, 53, 53), new Color(102, 88, 88)));
        setLayout(new BorderLayout());
        setBackground(new Color(182, 204, 182));
        JLabel title = new JLabel("Lecteur multimédia VLC");
        JLabel time = new JLabel("01:10");
        add(title, BorderLayout.WEST);
        add(new JLabel());
        add(time, BorderLayout.EAST);
        JProgressBar progress = new JProgressBar();
        progress.setSize(10, 5);
        add(progress, BorderLayout.SOUTH);
    }

    public Insets getInsets() {
        return (new Insets(10, 15, 10, 15));
    }
}
