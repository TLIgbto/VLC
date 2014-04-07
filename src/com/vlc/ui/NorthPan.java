/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.vlc.ui;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author toure
 */
public class NorthPan extends JPanel {
    private ControlPan cp;
    private ProgressPan pp;
    public NorthPan() {
        cp= new ControlPan();
        pp = new ProgressPan();
        setLayout(new BorderLayout());
        add(cp, BorderLayout.WEST);
        JPanel pan = new JPanel(new BorderLayout());
        pan.add(pp, BorderLayout.NORTH);
        add(pan, BorderLayout.CENTER);
    }
    public ProgressPan getPp() {
        return pp;
    }

    public void setPp(ProgressPan pp) {
        this.pp = pp;
    }
}
