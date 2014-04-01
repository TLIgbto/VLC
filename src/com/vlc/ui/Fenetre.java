/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vlc.ui;

import java.awt.Dimension;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JFrame;

/**
 *
 * @author toure
 */
class Fenetre extends JFrame {

    public Fenetre(String titre) {
        setContentPane(new PrincipalPan());
        setTitle(titre);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);
        setSize(570, 100);
        setVisible(true);
        addComponentListener(new ComponentAdapter() {

            @Override
            public void componentResized(ComponentEvent e) {
                setSize(new Dimension(getWidth(), 120));
                super.componentResized(e);
            }

        });
    }
}
