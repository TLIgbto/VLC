/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vlc.ui;

import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author toure
 */
public class PrincipalPan extends JPanel {

    public PrincipalPan() {
        setLayout(new BorderLayout());
        add(new NorthPan());
    }
}
