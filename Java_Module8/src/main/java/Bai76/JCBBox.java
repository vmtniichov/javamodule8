/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai76;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author vmtni
 */
public class JCBBox extends JFrame{
    JLabel lblImg= new JLabel();
    JComboBox<Object> cbBox = new JComboBox<>();
     

    public JCBBox(){
        super("JComboBox");
        addControls();
        addEvents();
    }

    private void addEvents() {
        Container con = getContentPane();
        con.setLayout(new FlowLayout(FlowLayout.CENTER));
        Object[] items =
        {
            new ImageIcon("img1.jpg"),
            new ImageIcon("img2.png"),
            new ImageIcon("img3.jpg")
        };
        cbBox = new JComboBox( items );
        con.add(cbBox);
        con.add(lblImg);
    }

    private void addControls() {

    }
     
}
