/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vlc.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

/**
 *
 * @author toure
 */
class Fenetre extends JFrame {

        PrincipalPan pp;
    public Fenetre(String titre) {
        pp = new PrincipalPan();
        setContentPane(pp);
        setTitle(titre);
        setDefaultCloseOperation(3);
        setSize(570, 120);
        setLocationRelativeTo(null);
        setVisible(true);
        //pack();
        addComponentListener(new ComponentAdapter() {

            @Override
            public void componentResized(ComponentEvent e) {
                int H = 120;
                int W = 570;
                if (getHeight() > 250) {
                    H = getHeight();
                    pp.setSouthPan(true);
                    
                    //pp.add(new SouthPan(), BorderLayout.CENTER);
                } else {
                    H = 120;
                    pp.setSouthPan(false);
                }
                if(getWidth() < 570) {
                    W = 570;
                } else {
                    W = getWidth();
                }
                setSize(new Dimension(W, H));
                super.componentResized(e);
            }

        });
    }

}
