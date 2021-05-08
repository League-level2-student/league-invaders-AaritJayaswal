import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

import java.awt.Color;

public class Projectile extends GameObject {

	
	public static BufferedImage image;
	public static boolean needImage = true;
	public static boolean gotImage = false;
	
	
	void loadImage(String imageFile) {
	    if (needImage) {
	        try {
	            image = ImageIO.read(this.getClass().getResourceAsStream(imageFile));
		    gotImage = true;
	        } 
	        catch (Exception e) {
	            
	        }
	        needImage = false;
	    }
	
	}
	
	
	public Projectile(int x1, int y1, int width1, int height1) {
		super(x1, y1, width1, height1);
		// TODO Auto-generated constructor stub
		if (needImage) {
		    loadImage ("bullet.png");
		}
	
	}

	public int speed = 10;
	public boolean isActive = true;

	void update() {
		y -= speed;
		super.update();

	}

	void draw(Graphics g) {
		if (gotImage) {
			g.drawImage(image, x, y, width, height, null);
		} else {
			g.setColor(Color.red);
			g.fillRect(x, y, width, height);
		}
		
		
		
	
	
	
	}
}
