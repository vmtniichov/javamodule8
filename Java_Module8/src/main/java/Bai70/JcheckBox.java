/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai70;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author vmtni
 */
public class JcheckBox extends JFrame{
    JCheckBox chkBold;
    JCheckBox chkItalic;
    JTextField txtInput= new JTextField("Make your choise");

    public JcheckBox(){
        super("JCheckBox");
        addControls();
        addEvents();
    }

    private void addControls() {
        Container  con = getContentPane();
        JPanel pnTop = new JPanel();
        JPanel pnBot = new JPanel();
        chkBold = new JCheckBox("Bold");
        chkItalic = new JCheckBox("Italic");
        
        //Set layout for container
        con.setLayout(new BorderLayout());
        //set layout for Panel
        pnTop.setLayout(new FlowLayout(FlowLayout.CENTER));
        pnBot.setLayout(new FlowLayout(FlowLayout.CENTER));
        //add stuff to panel
        pnTop.add(txtInput);
        pnBot.add(chkBold);
        pnBot.add(chkItalic);
        
        
        
        //add panel to container
        con.add(pnTop, BorderLayout.CENTER);        
        con.add(pnBot, BorderLayout.SOUTH);
    }

    private void addEvents() {
        chkBold.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(chkBold.isSelected()){
                   if(chkItalic.isSelected()){
                        Font ft = new Font("Arial", Font.BOLD | Font.ITALIC, 14);
                        txtInput.setFont(ft);
                   }else{
                        Font ft = new Font("Arial", Font.BOLD, 14);
                        txtInput.setFont(ft);
                    }
                }else{
                    if(chkItalic.isSelected()){
                        Font ft = new Font("Arial", Font.ITALIC, 14);
                        txtInput.setFont(ft);
                    }
                    else{
                        Font ft = new Font("Arial", Font.PLAIN, 14);
                        txtInput.setFont(ft);
                    }
                }

                
          }
            
        });
        chkItalic.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(chkBold.isSelected()){
                   if(chkItalic.isSelected()){
                        Font ft = new Font("Arial", Font.BOLD | Font.ITALIC, 14);
                        txtInput.setFont(ft);
                   }else{
                        Font ft = new Font("Arial", Font.BOLD, 14);
                        txtInput.setFont(ft);
                    }
                }else{
                    if(chkItalic.isSelected()){
                        Font ft = new Font("Arial", Font.ITALIC, 14);
                        txtInput.setFont(ft);
                    }
                    else{
                        Font ft = new Font("Arial", Font.PLAIN, 14);
                        txtInput.setFont(ft);
                    }
                }

                
          }
        });
    
    }        
}
