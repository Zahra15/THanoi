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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author zahra
 */
public class THanoi extends JComponent{

    /**
     * @param args the command line arguments
     */
 
    static Disk[] disks = new Disk[6];
    public static void main(String[] args) throws InterruptedException  {
       JFrame frame = new JFrame();
       JPanel p = new JPanel();

            THanoi nn =new THanoi();
       JMenuBar menuBar = new JMenuBar();
       JMenu fileMenu = new JMenu("File");
    
       JMenuItem newMenuItem = new JMenuItem("New");
       JMenuItem dNumberMenuItem = new JMenuItem("Disks Number");
       JMenuItem exitMenuItem = new JMenuItem("Exit");
       
       newMenuItem.addActionListener(new ActionListener(){
          public void actionPerformed( ActionEvent event ) {
              //newGame();
              } });
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
      
       Color[] color = {Color.green, Color.yellow, Color.orange, Color.red ,Color.magenta , Color.blue};
      
       
       int x = 110; // x-cardinate of first disk (smallest)
       int num=disks.length-1;
       int y = (int) (280-(num*20));// 20 is height , 280 is the start of black 
       int w = 100; // width of smallest disk
       int h = 20; // height fixed for all
       int j=0; // var for colorts 
       
       // loop for creating disks from object Disk
       for( int i =0; i< disks.length; i++){
          if(j==6)
               j=0;
           disks[i] = new Disk(x,y,w,h,color[j]);
           disks[i].setBounds(0, 0, 800,400); // bounds mehtod to show objects in null layout (x,y,w,h) 
           p.add(disks[i]);
           // increament for next disk
           x = x-20; 
            y = y+20; 
           w = w+40;  
          
           j++;    
       }
         
     Tower t = new Tower();  // obj of class tower 
      t.setBounds(0, 0, 800, 400); // each obj has bounds to be visible 
      p.add(t);
      

      frame.setVisible(true);
      
    solve(disks.length-1,  160, 635, 405);
    // Solve(i of disk array, source, dest, mid)
  

        
       
    }
    
  
    
    //Interrupt Exception for sleep
    static void solve(int disk, int source, int dest, int mid) throws InterruptedException{
        int x; // to determine new x-cordinate for movement
        int y; //to determine new y-cordinate for movement
      
        // the smallest 
        if(disk ==0 ){
           // return;
           x =dest-(disks[disk].w/2);
           y=getY(dest);
           disks[disk].moveDisk(x, y);
           Thread.sleep(1000);
           disks[disk].repaint();
           //return;
        }else{
         
         // Step 1 to solve move tower rather than the bigger to MID
         solve(disk-1,source,mid,dest); 
        // step 2 move from source to destination
         x =dest-(disks[disk].w/2);
           y=getY(dest);
        disks[disk].moveDisk(x, y);
        Thread.sleep(1000);
           disks[disk].repaint();
        // Step 3 Move tower to destination
        solve(disk-1, mid, dest, source);
        }
        
    }

static int getY(int desti){
    int y =280;
    int diskPos;
        for( int i =0; i< disks.length; i++){
            diskPos =disks[i].x+(disks[i].w/2); // to get disks positions 
            
            // if the disk in desstination we will chnage y 
            
            if( diskPos == desti){
            y=y-20;
            }
        }
    
    return y;   }}