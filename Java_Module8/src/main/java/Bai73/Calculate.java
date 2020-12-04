/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai73;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author vmtni
 */
public class Calculate extends JFrame{
    public Calculate() {
        super("Chýõng tr?nh gi?i PT");
        addControls();
        addEvents();
    }
    //Create new A, B, Result textfield
    JTextField txtInputa = new JTextField(18);JTextField txtInputb = new JTextField(18);JTextField txtRs = new JTextField(18);
    
    //create button
    JButton btnSolve = new JButton("Solve");JButton btnClear = new JButton("Clear All");JButton btnExit = new JButton("Exit");
    
    //creat radio buton
    JRadioButton rdoPlus = new JRadioButton("Cong");JRadioButton rdoMinus = new JRadioButton("Tru");JRadioButton rdoTime = new JRadioButton("Nhan");JRadioButton rdoDivine = new JRadioButton("Chia");
    ButtonGroup btG = new ButtonGroup();
    
    //Create all label
    JLabel lblTitle = new JLabel("Cong tru nhan chia");JLabel lblA = new JLabel("Type A: ");JLabel lblB = new JLabel("Type B: ");
    Font ft  = new Font("Arial", Font.BOLD, 25);
            
    private void addControls() {
        Container con = getContentPane();
        con.setLayout(new BorderLayout());
        JPanel pnTop = new JPanel();
        JPanel pnLeft = new JPanel(new GridLayout(5,1));
        JPanel pnCenter = new JPanel();
        JPanel pnCenterSub = new JPanel(); 
        JPanel pnBot = new JPanel();
        
        //set Font and color for Title
        txtRs.setEditable(false);
        lblTitle.setFont(ft);
        lblTitle.setForeground(Color.BLUE);
        
        //TOP PANEL
        //add title to top panel
        pnTop.add(lblTitle);
        pnTop.setLayout(new FlowLayout(FlowLayout.CENTER));
        //TOP PANEL END
        
        
        //LEFT PANEL
        //add button to left panel
        pnLeft.add(btnSolve);pnLeft.add(btnClear);pnLeft.add(btnExit);
        //custom layout for left panel
        pnLeft.setBackground(Color.LIGHT_GRAY);//set background color for left panel
        pnLeft.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.red), "Chon Tac vu"));
        //LEFT PANEL END
        
        //CENTER PANEL START
        //add things to center panel
        pnCenter.add(lblA); pnCenter.add(txtInputa);pnCenter.add(lblB); pnCenter.add(txtInputb);
        //Custom layout for center panel
        pnCenter.setLayout(new BoxLayout(pnCenter, BoxLayout.Y_AXIS));
        pnCenter.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.red), "Nhap a va b"));
        
        //add all button to button group
        btG.add(rdoPlus);btG.add(rdoMinus);btG.add(rdoTime);btG.add(rdoDivine);
        
        //add button to pnCenterSub
        pnCenterSub.add(rdoPlus);pnCenterSub.add(rdoMinus);pnCenterSub.add(rdoTime);pnCenterSub.add(rdoDivine);
        //pnCenterSub.setSize(15, 15);
        pnCenterSub.setLayout(new GridLayout(2,2));
        pnCenterSub.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "Chon phep toan"));
        
        //add Sub panel and result text field to Center Panel
        pnCenter.add(pnCenterSub);pnCenter.add(txtRs);
        //CENTER PANEL END
        
        //CONTAINER
        //add all panel to container
        con.add(pnTop, BorderLayout.NORTH);
        con.add(pnCenter, BorderLayout.CENTER);
        con.add(pnLeft, BorderLayout.WEST);
        //END
        
    }

    private void addEvents() {
        btnSolve.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //try to convert inputted string to int
                try {
                    int a = Integer.parseInt(txtInputa.getText());
                    int b = Integer.parseInt(txtInputb.getText());
                    float result=0;

                    if(rdoPlus.isSelected()){
                        result = a+b;
                        txtRs.setText(String.valueOf(result));
                    }
                    if(rdoMinus.isSelected()){
                        result = a-b;
                        txtRs.setText(String.valueOf(result));
                    }
                    if(rdoTime.isSelected()){
                        result = a*b;
                        txtRs.setText(String.valueOf(result));
                    }
                    if(rdoDivine.isSelected()){
                        result =(float) a/b;
                        txtRs.setText(String.valueOf(result));
                    }
                }
                catch(Exception d) {
                  txtRs.setText("Please check your input! A and B should be number!");
                }

            }
        });
        
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtInputa.setText("");
                txtInputb.setText("");
                txtRs.setText("");
                btG.clearSelection();
            }
        });
    }//accEvents()
}//Calculate Class
