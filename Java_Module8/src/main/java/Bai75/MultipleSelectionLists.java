/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai75;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

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
        
        pnCenter.add(btnCopy);
        con.add(scrollPane);
        con.add(pnCenter, BorderLayout.CENTER);
        con.add(copyList);
    }

    private void addEvents() {
        btnCopy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder sb = new StringBuilder();
                //Get the item from JList and add it to sb
                int idx = colorList.getSelectedIndex();
                sb.append(colour[idx]);
                //Haven't done yet
            }
        });
    }
    
    
}
