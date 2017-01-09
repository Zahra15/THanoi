/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thanoi;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;

/**
 *
 * @author zahra
 */
public class Disk extends JComponent{

    public int x;
    public int y;
    public int w;
    public int h;
    //private String color;
    public Color color;
    public Disk(int x, int y, int w, int h, Color color){
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.color = color;        
    }
    
    public void moveDisk(int x, int y)
    {
        this.x =x;
        this.y =y;
    }
    
     @Override
        public void paintComponent(Graphics d) {
           
            super.paintComponent(d);
            d.setColor(color);
            d.fillRect(x, y, w, h);
        }
}
