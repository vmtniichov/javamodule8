/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai75;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dialog;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.plaf.basic.BasicOptionPaneUI;

/**
 *
 * @author vmtni
 */
public class MultipleSelectionLists extends JFrame{
    String[] colour = {"Black", "Blue", "Cyan", "Dark Gray", "Gray", "Red", "Pink"};
    JButton btnCopy = new JButton("Copy>>");
    DefaultListModel model = new DefaultListModel();
    JList<String> colorList = new JList<>(colour);
    JList<String> copyList = new JList<>();
    //JLabel lbl = new JLabel("Check");
    
    public MultipleSelectionLists(){
        super("Multiple Selection Lists");
        addControls();
        addEvents();
    }

    private void addControls() {
        Container con = getContentPane();
        con.setLayout(new GridLayout(1,3));
        JPanel pnCenter= new JPanel();
        
        JScrollPane scrollPane = new JScrollPane(colorList);
        JScrollPane scrollPaneCopy = new JScrollPane(copyList);
        
        pnCenter.add(btnCopy);
        con.add(scrollPane);
        con.add(pnCenter);
        con.add(scrollPaneCopy);
    }

    private void addEvents() {
        btnCopy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] copyColour = new String[colour.length];
                int[] indices = colorList.getSelectedIndices();
                for (int i = 0; i < indices.length; i++){
                    copyColour[i] = colour[indices[i]];
                }
                copyList.setListData(copyColour);
                //lbl.setText(String.valueOf());
                
            }
        });
    }
    
    
}
