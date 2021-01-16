import java.awt.Dimension;
import javax.swing.*;

public class LeagueInvaders {
	
	public JFrame frame;
	public GamePanel panel;
	public static final int WIDTH = 500;
	public static final int HEIGHT = 800;
	
	

	
	 public LeagueInvaders(){
		frame = new JFrame();
		 panel = new GamePanel();
	
	 }
	 
	 
	 
	public static void main(String[]args){
		
		LeagueInvaders invaders = new LeagueInvaders();
		 invaders.setup();
		
		
	}
	
	void setup() {
frame.add(panel);
		frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 frame.getContentPane().setPreferredSize(new Dimension(WIDTH,HEIGHT));
	 frame.addKeyListener(panel);
	 frame.pack();
	}
}
