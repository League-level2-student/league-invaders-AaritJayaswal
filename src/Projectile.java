import java.awt.Graphics;
import java.awt.Color;

public class Projectile extends GameObject {

	public Projectile(int x1, int y1, int width1, int height1) {
		super(x1, y1, width1, height1);
		// TODO Auto-generated constructor stub
	}

	public int speed = 10;
	public boolean isActive = true;

	void update() {
		y -= speed;
		super.update();

	}

	void draw(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(x, y, width, height);
	}
}
