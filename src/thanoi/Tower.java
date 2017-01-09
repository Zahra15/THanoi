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
        
        
       /* Graphics2D g2 = (Graphics2D) g;
        
        Rectangle2D.Double disk1  = new Rectangle2D.Double(60,280, 200, 20);
        g2.setColor(Color.blue);
        g2.fill(disk1);
        
        Rectangle2D.Double disk2  = new Rectangle2D.Double(80,260, 160, 20);
        g2.setColor(Color.red);
        g2.fill(disk2);
        
        Rectangle2D.Double disk3  = new Rectangle2D.Double(100,240, 120, 20);
        g2.setColor(Color.yellow);
        g2.fill(disk3);
        
         Rectangle2D.Double disk4  = new Rectangle2D.Double(120,220, 80, 20);
        g2.setColor(Color.orange);
        g2.fill(disk4);
        //disk4.setRect(370,280, 80, 20);
        disk4.setFrame(370,280, 80, 20);
        g2.setColor(Color.black);
        g2.fillRect(150, 220, 20, 20);
        g2.setColor(new Color(242, 242, 242));
        g2.fillRect(120, 220, 30, 20);
        g2.fillRect(170, 220, 30, 20);
        //g2.drawRect(150, 50, 20, 250);
         g2.setColor(Color.orange);
        g2.fill(disk4);*/
    }
    
     public void getY(int x, int y){
       JComponent co = (JComponent) getComponentAt(x,y);
       Color coC = co.getBackground();
    }
}
