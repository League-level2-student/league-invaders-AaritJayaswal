import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class Rocketship extends GameObject {

	public int speed = 10;
	public boolean isActive = true;

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

	if(needImage)

	{
	    loadImage ("rocket.png");
	}

	public Rocketship(int x1, int y1, int width1, int height1) {
		super(x1, y1, width1, height1);

	}

	public void draw(Graphics g) {

		if (gotImage) {
			g.drawImage(image, x, y, width, height, null);
		} else {
			g.setColor(Color.BLUE);
			g.fillRect(x, y, width, height);
		}
	}

	public void right() {

		x += speed;

	}

	public void left() {
		x -= speed;
	}

	public void up() {
		y -= speed;
	}

	public void down() {
		y += speed;
	}

	public Projectile getProjectile() {
		return new Projectile(x + width / 2, y, 10, 10);
	}

}
