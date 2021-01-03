import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class LeagueInvaders {
	
	
	public static final int WIDTH = 500;
	public static final int HEIGHT = 800;
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	
	 public LeagueInvaders(){
		
		 LeagueInvaders invaders = new LeagueInvaders();
		 invaders.setup();

	
	 }
	 
	 
	 
	public static void main(String[]args){
		
		
		
	}
	
	void setup() {
		
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.add(panel);
	 frame.getContentPane().setPreferredSize(new Dimension(WIDTH,HEIGHT));
	frame.pack();
	}
}
