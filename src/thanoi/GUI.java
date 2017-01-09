/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thanoi;


import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import java.awt.event.*;
import javax.swing.JOptionPane;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

/**
 *5
 * @author Me
 */

 /* class MenuItemListener implements ActionListener {
      public void actionPerformed(ActionEvent e) {            
         if(e.getSource().equals(newMenuItem)){
            JOptionPane.showMessageDialog(null, "Selected Item: " + e.getActionCommand());
        }
      }    
   }
*/
public class GUI extends JFrame{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

 JFrame f = new JFrame();
    JPanel p = new JPanel();
   
    //MenuActionListener menuItemListener = new MenuActionListener();
    JMenuBar menuBar = new JMenuBar();
    JMenu fileMenu = new JMenu("File");
    
    JMenuItem newMenuItem = new JMenuItem("New");
    JMenuItem exitMenuItem = new JMenuItem("Exit");
    
    //adding items to menu
  newMenuItem.addActionListener(new ActionListener(){
          public void actionPerformed( ActionEvent event ) {
           
      
     System.exit(0);
              } });
 exitMenuItem.addActionListener(new ActionListener(){
    public void actionPerformed( ActionEvent event ) {
        System.exit( 0 );
    } });
 
      fileMenu.add(newMenuItem);
    fileMenu.add(exitMenuItem);
    // adding Menu to MenuBar
    menuBar.add(fileMenu);

    
    // adding MenuBar to Frame
    f.setJMenuBar(menuBar);
    f.setSize(800, 400);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);   
    }

   

    
   
    
   
    
}
