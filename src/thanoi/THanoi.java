/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thanoi;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

       
       JMenuBar menuBar = new JMenuBar();
       JMenu fileMenu = new JMenu("File");
    
       JMenuItem newMenuItem = new JMenuItem("New");
       JMenuItem dNumberMenuItem = new JMenuItem("Disks Number");
       JMenuItem exitMenuItem = new JMenuItem("Exit");
    
       exitMenuItem.addActionListener(new ActionListener(){
          public void actionPerformed( ActionEvent event ) {
             System.exit( 0 );
              } });
       
       
        //adding items to menu
        fileMenu.add(newMenuItem);
        fileMenu.add(dNumberMenuItem);
        fileMenu.add(exitMenuItem);
     
        // adding Menu to MenuBar
        menuBar.add(fileMenu);
    
        // adding MenuBar to Frame
        frame.setJMenuBar(menuBar);
       
       p.setLayout(null);
       frame.setContentPane(p);
       frame.setSize(800, 400);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setResizable(false);
       frame.setLocationRelativeTo(null);
       p.setBackground(new Color(242, 242, 242));
      
       Color[] color = {Color.blue, Color.red, Color.yellow, Color.orange};
      
       
       int x = 110;
       int num=disks.length-1;
       int y = (int) (280-(num*20));
       int w = 100;
       int h = 20;
       int j=0;
       //int x = 60;
       //int y = 280;
       //int w = 200;
       //int h = 20;
       for( int i =0; i< disks.length; i++){
          if(j==4)
               j=0;
           disks[i] = new Disk(x,y,w,h,color[j]);
           disks[i].setBounds(0, 0, 800,400);
           p.add(disks[i]);
           x = x-20;
           y = y+20;
           w = w+40;

           j++;
           
                   
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
 
      
       
      Tower t = new Tower();
      t.setBounds(0, 0, 800, 400);  
      p.add(t);
      

      frame.setVisible(true);
      
    solve(disks.length-1,  160, 635, 405);
  

        
       
    }
    
    //source 155, 
    //dist 635, 
    //mid 405
    static void solve(int disk, int source, int dest, int mid) throws InterruptedException{
        int x;
        int y;
      
        if(disk ==0 ){
           // return;
            x =dest-(disks[disk].w/2);
           y=getY(dest);
           disks[disk].moveDisk(x, y);
           Thread.sleep(1000);
           disks[disk].repaint();
           //return;
        }else{
      
         solve(disk-1,source,mid,dest);
           x =dest-(disks[disk].w/2);
           y=getY(dest);
        disks[disk].moveDisk(x, y);
        Thread.sleep(1000);
           disks[disk].repaint();
        solve(disk-1, mid, dest, source);
        }
        
    }

static int getY(int x){
    int y =280;
    int diskPos;
        for( int i =0; i< disks.length; i++){
            diskPos =disks[i].x+(disks[i].w/2);
            if( diskPos == x){
                
            y=y-20;
            }
        }
    
    return y;   
    }
    

}
