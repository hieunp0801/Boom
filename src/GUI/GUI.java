/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.CardLayout;
import javax.swing.JFrame;

/**
 *
 * @author Lenovo
 */
public class GUI extends JFrame {
    public static final int WIDTH = 905;
	public static final int HEIGHT = 688;
	public GUI() {
		setSize(WIDTH, HEIGHT);
                setLayout(new CardLayout());
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setTitle("Boom");
		setLocationRelativeTo(null);
                WrapperPanel panel=new WrapperPanel(this);
                this.add(panel);
		setResizable(false);
	}
}
