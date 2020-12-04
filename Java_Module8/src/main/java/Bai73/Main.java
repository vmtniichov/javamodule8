/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai73;

import java.awt.Dimension;
import java.awt.Frame;

/**
 *
 * @author vmtni
 */
public class Main {
    public static void main(String[] args) {
        Calculate ui = new Calculate();
        ui.setSize(400, 300);
        ui.setMinimumSize(new Dimension(400, 300));
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);
    }
}
