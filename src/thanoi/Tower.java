/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thanoi;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JComponent;
//import javax.swing.JPanel;

/**
 *
 * @author zahra
 */
public class Tower extends JComponent{
   public Tower(){
       
   }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
       g.setColor(Color.black);
        g.fillRect (10, 300, 760, 20);  
        
    
         g.setColor(Color.black);
         g.fillRect (150, 50, 20, 250);  
    
         g.setColor(Color.black);
         g.fillRect (400, 50, 20, 250); 
    
        g.setColor(Color.black);
        g.fillRect (630, 50, 20, 250); 
}
}