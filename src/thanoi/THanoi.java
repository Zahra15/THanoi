/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thanoi;

import java.awt.Color;
import java.awt.Graphics;
import java.util.concurrent.TimeUnit;
import javax.swing.*;

/**
 *
 * @author zahra
 */
public class THanoi extends JComponent{

    /**
     * @param args the command line arguments
     */
    static Disk[] disks = new Disk[4];
    public static void main(String[] args) throws InterruptedException  {
       JFrame frame = new JFrame();
       JPanel p = new JPanel();
       p.setLayout(null);
       frame.setContentPane(p);
       frame.setSize(800, 400);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setResizable(false);
       frame.setLocationRelativeTo(null);
       p.setBackground(new Color(242, 242, 242));
      
       Color[] color = {Color.blue, Color.red, Color.yellow, Color.orange};
      
       
       int x = 60;
       int y = 220;
       int w = 100;
       int h = 20;
       
       for( int i =0; i< disks.length; i++){
           disks[i] = new Disk(x,y,w,h,color[i]);
           disks[i].setBounds(0, 0, 800,400);
           p.add(disks[i]);
           x = x-20;
           y = y+20;
           w = w+40;
           //x = x+20;
           //y = y-20;
           //w = w-40;         
       } 
     // Disk d1 = new Disk(60,280, 200, 20,Color.blue);
      //Disk d2 = new Disk(80,260, 160, 20,Color.red);
      //Disk d3 = new Disk(100,240, 120, 20,Color.yellow);
      //Disk d4 = new Disk(120,220, 80, 20,Color.orange);
     // Disk d5 = new Disk(155,290, 10, 10,Color.blue);
      //Disk d5 = new Disk(405,290, 10, 10,Color.blue);
     // Disk d5 = new Disk(635,290, 10, 10,Color.blue);
 
      //d1.setBounds(0, 0, 800, 400);
      //d2.setBounds(0, 0, 800, 400);
      //d3.setBounds(0, 0, 800, 400);
      //d4.setBounds(0, 0, 800, 400);
      //d5.setBounds(0, 0, 800, 400);
      
      //p.add(d1);
      //p.add(d2);
      //p.add(d3);
      //p.add(d4);
      //p.add(d5);
       
      Tower t = new Tower();
      t.setBounds(0, 0, 800, 400);  
      p.add(t);
      
      
      frame.setVisible(true);
    solve(disks.length-1,  155, 635, 405);
       

      //Thread.sleep(1000);
/*      
     d1.moveDisk(405-(d1.w/2)+10, 280);
     d2.moveDisk(405-(d2.w/2)+10, 260);
     d3.moveDisk(405-(d3.w/2)+10, 240);
     d4.moveDisk(405-(d4.w/2)+10, 220);
             d1.repaint();
             d2.repaint();
             d3.repaint();
             d4.repaint();*/

             
             
//             Thread.sleep(1000);

  //     d2.moveDisk(30, 50);
    //   d2.repaint();
       
       
       //frame.getContentPane().repaint();
        
       
    }
    
    //source 155, 
    //dist 635, 
    //mid 405
    static void solve(int disk, int source, int dest, int mid) throws InterruptedException{
 
        if(disk ==0 ){
           // return;
           disks[disk].moveDisk(dest-(disks[disk].w/2), disks[disk].y);
           Thread.sleep(2000);
           disks[disk].repaint();
           //return;
        }else{
      
         solve(disk-1,source,mid,dest);
        disks[disk].moveDisk(dest-(disks[disk].w/2), disks[disk].y);
        Thread.sleep(2000);
           disks[disk].repaint();
        solve(disk-1, mid, dest, source);
        }
            
    }

    
}
