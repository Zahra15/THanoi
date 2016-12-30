/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thanoi;

import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author zahra
 */
public class THanoi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       JFrame frame = new JFrame();
       frame.setSize(800, 400);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.getContentPane().setBackground(new Color(242, 242, 242));
       frame.getContentPane().add(new Tower());
       Disks d = new Disks();
       frame.add(d);
       frame.setVisible(true);
       
       
    }
    
  
    
}
