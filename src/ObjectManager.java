import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager implements ActionListener {

	public Rocketship ship;

	public ObjectManager(Rocketship ship1) {

		ship = ship1;
	}

	public ArrayList<Projectile> projectiles = new ArrayList<Projectile>();

	public ArrayList<Alien> aliens = new ArrayList<Alien>();

	Random random = new Random();

	void addProjectile(Projectile p) {

		projectiles.add(p);

	}

	void addAlien() {

		aliens.add(new Alien(random.nextInt(LeagueInvaders.WIDTH), 0, 50, 50));

	}

	void update() {

		for (Alien a : aliens) {

			a.update();
			int alienY = a.y;

			if (LeagueInvaders.HEIGHT < alienY) {

				a.isActive = false;

			}

		}

		for (Projectile p : projectiles) {

			p.update();
			int projectileY = p.y;
			if (LeagueInvaders.HEIGHT < projectileY) {

				p.isActive = false;

			}
		}

	}

	void draw(Graphics g) {

		ship.draw(g);

		for (Alien a : aliens) {

			a.draw(g);
		}

		for (Projectile p : projectiles) {
			
			p.draw(g);
			
		}
		
		
	}

	void purgeObjects() {

		for (Alien a : aliens) {

			if (a.isActive == false) {

				aliens.remove(a);

			}

		}

		for (Projectile p : projectiles) {

			if (p.isActive == false) {

				projectiles.remove(p);

			}

		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		addAlien();

	}

}