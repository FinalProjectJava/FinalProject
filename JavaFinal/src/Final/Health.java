package Final;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Scanner;
public class Health {

	//ADD TIMER
	
	public static void displayHealth() {
		// TODO Auto-generated method stub
		int health = 100;
		int damage;
		String answer = null;
		System.out.println("The elevator comes downwards until you reach the murky bottom.\nThe door locks behind you and gas fills the room!. Do you break through a window to escape, or look for supplies?\nBe quick!");

		// This timer will be used for a gas room
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < 50; i++) {
		    try {
		       // Miliseconds v
		        Thread.sleep(500);
		    } catch(InterruptedException ie) {}
		    health = health - 10;
		   
		   
		}
		 do {
				System.out.print(">> ");
				answer = input.next();
					if (answer.equalsIgnoreCase("break_window")) {
						System.out.println("You bust the window and attempt to crawl through. The glass cuts you and you bleed to death.\nGame Over");
						System.exit(0);
					}
					else if (answer.equalsIgnoreCase("window")) {
						System.out.println("You bust the window and attempt to crawl through. The glass cuts you and you bleed to death.\nGame Over");
						System.exit(0);
					}
					else if (answer.equalsIgnoreCase("supplies")) {
						System.out.println("Looking around the room you find a key to a door nearby, after opening the door you are led to the outside.\nYou Win!");
						System.exit(0);
					}
					else if (answer.equalsIgnoreCase("search_for_supplies")) {
						System.out.println("Looking around the room you find a key to a door nearby, after opening the door you are led to the outside.\nYou Win!");
						System.exit(0);
					}
					else if (answer.equalsIgnoreCase("look_for_supplies")) {
						System.out.println("Looking around the room you find a key to a door nearby, after opening the door you are led to the outside.\nYou Win!");
						System.exit(0);
					}
					else if (answer.equalsIgnoreCase("get_supplies")) {
						System.out.println("Looking around the room you find a key to a door nearby, after opening the door you are led to the outside.\nYou Win!");
						System.exit(0);
					}

	    } while (health > 0);
		 System.out.println("You died");
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