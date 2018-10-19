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
		while(4  >  3) {
			
				System.out.print(">> ");
				answer = input.next();
					if (answer.equalsIgnoreCase("break_window")) {
						damage = (15 + (int)(Math.random() * 70 ));
						health = health - damage;
						if (health > 0) {
						System.out.println("You bust the window and attempt to crawl through. The glass cuts you, but you are able to escape with your injuries.\nYou Win!");
						System.exit(0);
						}
						else if (health <= 0) {
							System.out.println("You bust the window and attempt to crawl through. The glass cuts you and you bleed to death.\nGame Over");
						}
					}
					else if (answer.equalsIgnoreCase("window")) {
						damage = (15 + (int)(Math.random() * 70 ));
						if (health > 0) {
							System.out.println("You bust the window and attempt to crawl through. The glass cuts you, but you are able to escape with your injuries.\nYou Win!");
							System.exit(0);
							}
							else if (health <= 0) {
								System.out.println("You bust the window and attempt to crawl through. The glass cuts you and you bleed to death.\nGame Over");
							}
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
						System.out.println("Would you like to play again? Y/N ");
						if (answer.equalsIgnoreCase("Y")) {
							Main.main(null);
						}
						else if (answer.equalsIgnoreCase("Yes")) {
							Main.main(null);
						}
						
						}
						System.exit(0);
					}
		}
	
	public static void fight(int health, int damage) {
		damage = (15 + (int)(Math.random() * 70 ));
		health = health - damage;
		if (health >= 70) {
			System.out.println("You punch the skeleton, but the skeleton punches back. You take minor damage and escape to an elevator. (You gain " + health + " health)\nDo you go up, or down?");	
		}
		else if (health >= 50 && health <= 69) {
			System.out.println("You punch the skeleton, but the skeleton punches back. You take a good amount of damage and escape to an elevator. (You gain " + health + " health)\nDo you go up, or down?");	
		}
		else if (health < 50) {
			System.out.println("You punch the skeleton, but the skeleton punches back. You take major damage and escape to an elevator. (You gain " + health + " health)\nDo you go up, or down?");	
		}
	}
}