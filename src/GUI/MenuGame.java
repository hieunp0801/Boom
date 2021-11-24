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
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Lenovo
 */
public class MenuGame extends JPanel{
    private GUI gui;
    private WrapperPanel wrapperPanel;
    private JLabel backgroundLabel,highScoreButton,playGameButton,exitGameButton,optionGameButton;
    private ImageIcon ImageBackground;
    
    public MenuGame(WrapperPanel wp){
        gui=wp.getGUI();
        wrapperPanel=wp;
        setBackground(Color.BLACK);
        setLayout(null);
        initButton();
        initBg();
        
    }
    private void initBg(){
        backgroundLabel=new JLabel();
        backgroundLabel.setBounds(0,0,gui.getWidth(),gui.getHeight());
        ImageBackground =new ImageIcon(this.getClass().getResource("/Images/background_Menu2.png"));
        backgroundLabel.setIcon(ImageBackground);
        add(backgroundLabel);
    }
    private void initBg_(){
        JLabel backgroundLabel2=new JLabel();
        backgroundLabel2.setBounds(0,0,gui.getWidth()/2,gui.getHeight()/2);
        ImageBackground=new ImageIcon(this.getClass().getResource("/Images/background_Info.png"));
        backgroundLabel2.setIcon(ImageBackground);
        add(backgroundLabel2);
    }
    
    private JLabel initLabel(int x,int y,String url){
        JLabel temp=new JLabel();
        ImageIcon icon=new ImageIcon(getClass().getResource(url));
        temp.setBounds(x , y, icon.getIconWidth(), icon.getIconHeight());
        temp.setIcon(icon);
        return temp;    
    }
    private void initButton(){
        int margin_bottom=10;
//        Play game
        playGameButton=initLabel(gui.getWidth()/2-100,200,"/Images/Play.png");
        add(playGameButton);
        playGameButton.addMouseListener(mouseEvent);
//        Option
        optionGameButton=initLabel(gui.getWidth()/2-100,playGameButton.getY()+playGameButton.getHeight()+margin_bottom,"/Images/Option.png");
        add(optionGameButton);
        optionGameButton.addMouseListener(mouseEvent);
//        High score
        highScoreButton=initLabel(gui.getWidth()/2-100,optionGameButton.getY()+optionGameButton.getHeight()+margin_bottom,"/Images/HightScore.png");
        add(highScoreButton);
        highScoreButton.addMouseListener(mouseEvent);
//        Exit
        exitGameButton=initLabel(gui.getWidth()/2-100,highScoreButton.getY()+highScoreButton.getHeight()+margin_bottom,"/Images/Exit.png");
        add(exitGameButton);
        exitGameButton.addMouseListener(mouseEvent);
        
    }
    private MouseAdapter mouseEvent = new MouseAdapter() {
        @Override
        public void mousePressed(MouseEvent e) {
            if(e.getSource().equals(highScoreButton)){
                wrapperPanel.displayHighScore();
            }
            if(e.getSource().equals(playGameButton)){
                wrapperPanel.displayPlayGame();
            }
            if(e.getSource().equals(optionGameButton)){
                wrapperPanel.displayOptionGame();
            }
            if(e.getSource().equals(exitGameButton)){
                wrapperPanel.closeGame();
            }
        }
    };
   
}
