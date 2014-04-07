package com.vlc.ui;

import javax.swing.*;

/**
 * Created by donatien on 06/04/14.
 */
public class TreeTabPan extends JScrollPane {
    public TreeTabPan(){
        add(new TabPan());
    }
}

class TabPan extends JTable{
    public TabPan(){
        String[] column={"Nom", "Auteur", "Duree"};
        Object[][] donnees = {{"Kathy", "Smith","4:10"}, {"John", "Doe","2:14"}};
        new JTable(donnees,column);
        setAutoResizeMode(AUTO_RESIZE_ALL_COLUMNS);
        setFillsViewportHeight(true);
    }
}