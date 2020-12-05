/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai74;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author vmtni
 */
public class DaysOfWeek extends JFrame{
    JLabel lblday = new JLabel();
    String[] dow = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
    JList<String> week = new JList(dow);
    
    public DaysOfWeek(){
        super("Days of Week!");
        addControls();
        addEvents();
    }

    private void addControls() {
        
        //Create Container and Panel
        Container con = getContentPane();
        con.setLayout(new BorderLayout());
        
        JPanel pn = new JPanel();
        JPanel pnBot = new JPanel();
        
        //Set text of label is index 0 of week
        week.setSelectedIndex(0);
        lblday.setText(week.getSelectedValue());
        
        //add label to panel on top
        pn.add(lblday);
        pn.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        //add week jlist to bottom panel
        pnBot.add(week);
        
        
        
        
        con.add(pn, BorderLayout.NORTH);
        con.add(pnBot, BorderLayout.CENTER);
    }

    private void addEvents() {
        week.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                //Create new stringbuilder to add item into it
                StringBuilder sb = new StringBuilder(1);
                //Get the item from JList and add it to sb
                int idx = week.getSelectedIndex();
                sb.append(dow[idx]);
                //Display it to label
                lblday.setText(sb.toString());
            }
        });
        
        
    }
    
    
}
