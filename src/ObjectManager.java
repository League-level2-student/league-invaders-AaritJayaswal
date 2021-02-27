import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {

	public Rocketship ship;
	
	public ObjectManager(Rocketship ship1) {
		
		ship=ship1;
	}
	
	
	public ArrayList<Projectile> projectiles = new ArrayList<Projectile>();

	public ArrayList<Alien> aliens = new ArrayList<Alien>();

	
	
	Random random = new Random();
	
void addProjectile(Projectile p) {
	
	projectiles.add(p);

}

void addAlien(Alien a) {
	
	aliens.add(new Alien(random.nextInt(LeagueInvaders.WIDTH),0,50,50));
	
}

void update(){
	
	for(Alien a: aliens) {
		
		update();
	}
	
}

int AlienY = alien.y1();

}