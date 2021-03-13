import java.awt.Color;
import java.awt.Graphics;
public class Alien extends GameObject{

	public Alien(int x1, int y1, int width1, int height1) {
		super(x1, y1, width1, height1);
		// TODO Auto-generated constructor stub
	}
	public int speed = 1;
	public boolean isActive = true;
	
	
	void update() {
		y+=speed;
	}
	
	void draw(Graphics g) {
		
		 g.setColor(Color.YELLOW);
	        g.fillRect(x, y, width, height);
		
	}

}
