/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.vlc.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author toure
 */
public class NorthPan extends JPanel {
    public NorthPan() {
        setBackground(Color.YELLOW);
        setLayout(new BorderLayout());
        add(new ControlPan(), BorderLayout.WEST);
        JPanel pan = new JPanel(new BorderLayout());
        pan.add(new ProgressPan(), BorderLayout.NORTH);
        add(pan, BorderLayout.CENTER);
    }
}
