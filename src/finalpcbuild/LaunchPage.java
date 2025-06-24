/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalpcbuild;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author harold
 */
public class LaunchPage implements ActionListener {
    
    JFrame frame = new JFrame();
    JButton Start = new JButton("ENTER");
   
    
    LaunchPage(){
        
        Start.setBounds(100, 260, 200, 40);
        Start.setFocusable(false);
        Start.addActionListener(this);
        
       
        
        frame.add(Start);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == Start ){
            Login login = new Login();
            frame.setVisible(false);
            login.setVisible(true);
        }
    }
}
