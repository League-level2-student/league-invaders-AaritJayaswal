import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject { 
	
	public Rocketship(int x1, int y1, int width1, int height1) {
		super(x1, y1, width1, height1);
	
	}

	public void draw(Graphics g) {
		g.setColor(Color.BLUE);
        g.fillRect(x, y, width, height);
	
}

}

