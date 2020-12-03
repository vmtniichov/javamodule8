/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai72;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author vmtni
 */
public class GiaiPhuongTrinh extends JFrame{
    JTextField txtNuma = new JTextField(14);
    JTextField txtNumb= new JTextField(14);
    JTextField txtNumc = new JTextField(14);
    JTextField txtResult = new JTextField(14);
    
    JButton btnSolve = new JButton("Solve");
    JButton btnClear = new JButton("Clear All");
    JButton btnExit = new JButton("Exit");
    
    JLabel lblA = new JLabel("a: ");
    JLabel lblB = new JLabel("b: ");
    JLabel lblC = new JLabel("c: ");
    JLabel lblRs = new JLabel("Result: ");
    JLabel lblTitle = new JLabel("Giai Phuong Trinh");
    Font ft = new Font("Arial", Font.BOLD, 25);
    

    public GiaiPhuongTrinh() {
        super("Chýõng tr?nh gi?i PT");
        addControls();
        addEvents();
    }
    
    private void addControls() {
        Container  con = getContentPane();
        JPanel pnTop = new JPanel();
        JPanel pnMiddle = new JPanel();
        JPanel pnBot = new JPanel();
        
        pnTop.add(lblTitle);
        
        pnMiddle.add(lblA);
        pnMiddle.add(txtNuma);
        pnMiddle.add(lblB);
        pnMiddle.add(txtNumb);
        pnMiddle.add(lblC);
        pnMiddle.add(txtNumc);
        pnMiddle.add(lblRs);
        pnMiddle.add(txtResult);
        
        pnBot.add(btnSolve);
        pnBot.add(btnClear);
        pnBot.add(btnExit);
        
        //set layout for panel
        lblTitle.setFont(ft);
        pnTop.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        pnMiddle.setLayout(new BoxLayout(pnMiddle, BoxLayout.PAGE_AXIS));
        pnMiddle.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.red), "Input a,b,c"));
        
        pnBot.setLayout(new FlowLayout(FlowLayout.CENTER));
        pnBot.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.MAGENTA), "Choose"));
        
        //add panel to Container
        con.add(pnTop, BorderLayout.NORTH);
        con.add(pnMiddle, BorderLayout.CENTER);
        con.add(pnBot, BorderLayout.SOUTH);
    }

    private void addEvents() {
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtNuma.setText("");
                txtNumb.setText("");
                txtNumc.setText("");
                txtResult.setText("");
            }
        });
        btnSolve.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a, b, c;
                a = Double.parseDouble(txtNuma.getText());
                b = Double.parseDouble(txtNumb.getText());
                c = Double.parseDouble(txtNumc.getText());
                if (a == 0) {
                    if (b == 0) {
                        if (c == 0) {
                            txtResult.setText("Phýõng tr?nh có vô s? nghi?m");
                        } else {
                            txtResult.setText("Phýõng tr?nh vô nghi?m");
                        }
                    } else {
                        txtResult.setText("Phýõng tr?nh có nghi?m: " + (-c / b));
                    }
                }else{
                    double delta = b*b - 4 * a * c;
                    if(delta <0){
                        txtResult.setText("Phýõng tr?nh vô nghi?m");
                    }
                    else if(delta == 0){
                        txtResult.setText("Phýõng tr?nh có nghi?m kép: " + (-b/(2*a)));
                    }
                    else if(delta > 0){
                        txtResult.setText("x1: " + (float)((-b + Math.sqrt(delta)) / (2*a))+
                                            "  x2: "+(float) ((-b - Math.sqrt(delta)) / (2*a)));
                    }
                }
            }
        });
    }
    
}