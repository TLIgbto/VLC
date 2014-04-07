package com.vlc.ui;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * Created by donatien on 06/04/14.
 */
public class FileChooserEditor extends JFileChooser {

    private JPanel tab;
    private JFileChooser chooser;
    private FileNameExtensionFilter filter;
    private String path;

    public FileChooserEditor(JPanel tab) {
        this.tab = tab;
        chooser = new JFileChooser();
        filter = new FileNameExtensionFilter("mp3", "mpeg", "avi");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(tab);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
           path=chooser.getSelectedFile().getAbsolutePath();
        }
    }

    public String getPath() {
        return path;
    }
}
