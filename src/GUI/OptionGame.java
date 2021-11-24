/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Lenovo
 */
public class OptionGame extends JPanel{
    private GUI gui;
    private JLabel bg;
    private JButton buttonBack;
    private WrapperPanel wp;
    public OptionGame(WrapperPanel wp){
        setBackground(Color.YELLOW);
        setLayout(null);
        this.wp=wp;
        gui=wp.getGUI();
        initButton();
        initBg();
        
        
    }
    private void initBg(){
        bg=new JLabel();
        ImageIcon icon=new ImageIcon(getClass().getResource("/Images/background_option.png"));
        bg.setBounds(gui.getWidth()/2-icon.getIconWidth()/2 -5,-50,gui.getWidth(), gui.getHeight());
        bg.setIcon(icon);
        add(bg);
    }
    private void initButton(){
        buttonBack=new JButton();
        buttonBack.setBounds(gui.getWidth()/2-100,gui.getHeight()-100,200,45);
        buttonBack.setText("OK");
        add(buttonBack);
        buttonBack.addMouseListener(mouseEvent);
        
    }
    MouseAdapter mouseEvent  = new MouseAdapter(){
        @Override
        public void mousePressed(MouseEvent e){
          if(e.getSource().equals(buttonBack)){
              wp.displayMenuGame();
          }
        }
    };
}
