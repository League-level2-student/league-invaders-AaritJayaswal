import java.awt.Rectangle;

public class GameObject {
	int x;
	int y;
	int width;
	int height;
	public Rectangle collisionBox = new Rectangle();
	public GameObject(int x1, int y1, int width1, int height1) {
		this.x = x1;
		this.y = y1;
		this.width = width1;
		this.height = height1;
	}

	

	void update() {

		collisionBox.setBounds(x, y, width, height);

	}

}
