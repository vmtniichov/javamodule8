/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai71;

/**
 *
 * @author vmtni
 */
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author vmtni
 */
public class RadioButton extends JFrame{
    JRadioButton rdoPlain = new JRadioButton("Plain");
    JRadioButton rdoItalic = new JRadioButton("Italic");
    JRadioButton rdoBold = new JRadioButton("Bold");
    JRadioButton rdoBoldAndItalic = new JRadioButton("Bold/Italic");
    JTextField txtInput = new JTextField("Choose Radio Button Below");
    

    public RadioButton(){
        super("RadioButton Test");
        addControls();
        addEvents();
    }

    private void addControls() {
        Container  con = getContentPane();
        JPanel pnTop = new JPanel();
        JPanel pnBot = new JPanel();
        ButtonGroup btnG = new ButtonGroup();
        txtInput.setEditable(false);
        
        //set layout for panel
        pnTop.setLayout(new FlowLayout(FlowLayout.CENTER));
        pnBot.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        //add Text Field to panel top
        pnTop.add(txtInput);
        
        //add button to button group 
        btnG.add(rdoBold);
        btnG.add(rdoItalic);
        btnG.add(rdoPlain);
        btnG.add(rdoBoldAndItalic);
        
        //add radio button to panel bottom
        pnBot.add(rdoPlain);
        pnBot.add(rdoItalic);
        pnBot.add(rdoBold);
        pnBot.add(rdoBoldAndItalic);
        
        //add panel top and bottom to container
        con.add(pnTop, BorderLayout.NORTH);
        con.add(pnBot, BorderLayout.CENTER);
        
        
        
    }

    private void addEvents() {
        //Set font Bold
        rdoBold.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(rdoBold.isSelected()){
                    Font ft = new Font("Arial", Font.BOLD, 14);
                    txtInput.setFont(ft);
                }
            }
        });
        //Set font Italic
        rdoItalic.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(rdoItalic.isSelected()){
                    Font ft = new Font("Arial", Font.ITALIC, 14);
                    txtInput.setFont(ft);
                }
            }
        });
        //Set font Plain
        rdoPlain.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(rdoPlain.isSelected()){
                    
                    Font ft = new Font("Arial", Font.PLAIN, 14);
                    txtInput.setFont(ft);
                }
            }
        });
        ////Set font Bold and Italic
        rdoBoldAndItalic.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(rdoBoldAndItalic.isSelected()){
                    //set font for text field
                    Font ft = new Font("Arial", Font.BOLD | Font.ITALIC, 14);
                    txtInput.setFont(ft);
                }
            }
        });
    }
    
}

