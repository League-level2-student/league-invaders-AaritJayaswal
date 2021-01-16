import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;
public class GamePanel extends JPanel implements ActionListener, KeyListener{
	
	public Timer frameDraw;
	
	public Font titleFont;
	
	public Font textFont;
	
	final int MENU = 0;
    final int GAME = 1;
    final int END = 2;
	
    int currentState = MENU;

    public GamePanel() {
    	frameDraw = new Timer(1000/60,this);
        frameDraw.start();
        
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
    	g.drawString("Press SPACE for instructions", 120, 300);
    }
    
    void drawGameState(Graphics g) {
    	g.setColor(Color.BLACK);
    	g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
    }
    
    void drawEndState(Graphics g)  {
    	g.setColor(Color.RED);
    	g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
    	
    	g.setFont(titleFont);
    	g.setColor(Color.BLACK);
    	g.drawString("GAME OVER", 100, 50);
    
    	g.setFont(textFont);
    	g.setColor(Color.BLACK);
    	g.drawString("You killed number enemies", 130, 140);
    	g.drawString("Press ENTER to restart", 140, 300);
    	
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


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		if(currentState == MENU){
		    updateMenuState();
		}else if(currentState == GAME){
		    updateGameState();
		}else if(currentState == END){
		    updateEndState();
		}
	
		repaint();
	}


	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode()==KeyEvent.VK_ENTER) {
		    if (currentState == END) {
		        currentState = MENU;
		    } else {
		        currentState++;
		    }
		}
		if (e.getKeyCode()==KeyEvent.VK_UP) {
		    System.out.println("UP");
		}
		if (e.getKeyCode()==KeyEvent.VK_DOWN) {
		    System.out.println("DOWN");
		}
		if (e.getKeyCode()==KeyEvent.VK_RIGHT) {
		    System.out.println("RIGHT");
		   
		}
		 if (e.getKeyCode()==KeyEvent.VK_LEFT) {
		        System.out.println("LEFT");
		    }    
	}


	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
