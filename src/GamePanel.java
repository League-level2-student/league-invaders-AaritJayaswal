import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.*;
public class GamePanel extends JPanel {
	public Font titleFont;
	
	public Font textFont;
	
	final int MENU = 0;
    final int GAME = 1;
    final int END = 2;
	
    int currentState = MENU;

    public GamePanel() {
    	
    	titleFont = new Font("Arial", Font.PLAIN, 48);
    	
    	textFont = new Font("Arial", Font.PLAIN, 20);
    }
    
    
    void updateMenuState() { 
    	
    	
    }
   
    void updateGameState() {  
    	
    	
    }
    
    void updateEndState()  {  
    	
    	
    }
    
    void drawMenuState(Graphics g) {
    	g.setColor(Color.BLUE);
    	g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
    	
    	g.setFont(titleFont);
    	g.setColor(Color.YELLOW);
    	g.drawString("LEAGUE INVADERS", 20, 50);
    
    	g.setFont(textFont);
    	g.setColor(Color.YELLOW);
    	g.drawString("Press ENTER to start", 160, 140);
    	g.drawString("Press SPACE for instructions", 120s, 300);
    }
    
    void drawGameState(Graphics g) {
    	
    	
    }
    
    void drawEndState(Graphics g)  {
    	
    	
    }
    
    @Override
	public void paintComponent(Graphics g){

		
    	if(currentState == MENU){
    	    drawMenuState(g);
    	}
    	else if(currentState == GAME){
    	    drawGameState(g);
    	}
    	else if(currentState == END){
    	    drawEndState(g);
    	}
		
	}
	
}
