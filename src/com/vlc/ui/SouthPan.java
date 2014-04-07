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
 * @author donatien
 */
public class SouthPan extends JPanel {
    private JTree tree;
    public SouthPan(){

        setVisible(true);
        setLayout(new BorderLayout());
        add(new StateBar(), BorderLayout.SOUTH);
        /*DefaultMutableTreeNode top = new DefaultMutableTreeNode("The Java Series");

        tree = new JTree(top);
        tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);*/

        String[] column={"Nom", "Auteur", "Duree"};
        Object[][] donnees = {{"Kathy", "Smith","4:10"}, {"John", "Doe","2:14"}};

        final JTable table = new JTable(donnees,column);
        table.setPreferredScrollableViewportSize(new Dimension(500, 70));
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        table.setFillsViewportHeight(true);
        add(new JScrollPane(table), BorderLayout.CENTER);


    }
/*
private class BookInfo {
    public String bookName;
    public URL bookURL;

    public BookInfo(String book, String filename) {
        bookName = book;
        bookURL = getClass().getResource(filename);
        if (bookURL == null) {
            System.err.println("Couldn't find file: "
                    + filename);
        }
    }

    public String toString() {
        return bookName;
    }
}
  private void createNodes(DefaultMutableTreeNode top) {
        DefaultMutableTreeNode category = null;
        DefaultMutableTreeNode book = null;

        category = new DefaultMutableTreeNode("Books for Java Programmers");
        top.add(category);

        //original Tutorial
        book = new DefaultMutableTreeNode(new BookInfo
                ("The Java Tutorial: A Short Course on the Basics",
                        "tutorial.html"));
        category.add(book);

        //Tutorial Continued
        book = new DefaultMutableTreeNode(new BookInfo
                ("The Java Tutorial Continued: The Rest of the JDK",
                        "tutorialcont.html"));
        category.add(book);

        //JFC Swing Tutorial
        book = new DefaultMutableTreeNode(new BookInfo
                ("The JFC Swing Tutorial: A Guide to Constructing GUIs",
                        "swingtutorial.html"));
        category.add(book);

        //Bloch
        book = new DefaultMutableTreeNode(new BookInfo
                ("Effective Java Programming Language Guide",
                        "bloch.html"));
        category.add(book);

        //Arnold/Gosling
        book = new DefaultMutableTreeNode(new BookInfo
                ("The Java Programming Language", "arnold.html"));
        category.add(book);

        //Chan
        book = new DefaultMutableTreeNode(new BookInfo
                ("The Java Developers Almanac",
                        "chan.html"));
        category.add(book);

        category = new DefaultMutableTreeNode("Books for Java Implementers");
        top.add(category);

        //VM
        book = new DefaultMutableTreeNode(new BookInfo
                ("The Java Virtual Machine Specification",
                        "vm.html"));
        category.add(book);

        //Language Spec
        book = new DefaultMutableTreeNode(new BookInfo
                ("The Java Language Specification",
                        "jls.html"));
        category.add(book);
    }
*/
}
