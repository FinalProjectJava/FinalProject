package Final;
import java.util.Timer;
import java.util.TimerTask;
public class Health {

	//ADD TIMER
	
	public static void displayHealth() {
		// TODO Auto-generated method stub
		int health = 100;
		int damage;
		System.out.println("You triggered the gas trap! Think fast!");

		// This timer will be used for a gas room
		for(int i = 0; i < 50; i++) {
		    try {
		       // Miliseconds v
		        Thread.sleep(500);
		    } catch(InterruptedException ie) {}
		    health = health - 2;
		    if (health == 0) {
		    	System.out.println("You died from the gas!");
		    	System.exit(0);
		    }
		}
	}
	public static void fight(int health, int damage) {
		damage = (15 + (int)(Math.random() * 70 ));
		health = health - damage;
		if (health >= 70) {
			System.out.println("You punch the skeleton, but the skeleton punches back. You take minor damage and escape to an elevator. (" + health + "/100)\nDo you go up, or down?");	
		}
		else if (health >= 50 && health <= 69) {
			System.out.println("You punch the skeleton, but the skeleton punches back. You take a good amount of damage and escape to an elevator. (" + health + "/100)\nDo you go up, or down?");	
		}
		else if (health < 50) {
			System.out.println("You punch the skeleton, but the skeleton punches back. You take major damage and escape to an elevator. (" + health + "/100)\nDo you go up, or down?");
		}
	}
}