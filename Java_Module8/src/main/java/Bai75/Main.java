/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai75;

import java.awt.Dimension;

/**
 *
 * @author vmtni
 */
public class Main {
    public static void main(String[] args) {
        MultipleSelectionLists ui = new MultipleSelectionLists();
        ui.setSize(350, 150);
        ui.setMinimumSize(new Dimension(300,150));
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);
    }
}
