package Final;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Dialogue {

	public static void dialogue() {
		Inventory.inventory();
		int room = 0;
		String answer = null;

		
		Scanner input = new Scanner(System.in);
		// Room messages, only appear once
		System.out.println("Please use underscores in place of spaces");
		System.out.println("You awaken in a dark room illuminated only by a barred window. The only thing in the room is a bed. The only way out seems to be the rusted door.");
		while(room == 0) {
 master
			start(room, answer);
=======

			start(choice, room, answer);
 master
		}
		}
		
	
	// This is the very start of the game
	public static void start(int room, String answer) {
		Scanner input = new Scanner(System.in);
		System.out.print(">> ");
		answer = input.next();
		// Important the user uses underscores, not spaces
		if (answer.equalsIgnoreCase("check_bed")) {
			System.out.println("You peer under the bed and find a secret hatch");
		}
		
		else if (answer.equalsIgnoreCase("look_at_bed")) {
			System.out.println("You peer under the bed and find a secret hatch");
		}
		else if (answer.equalsIgnoreCase("lay_down")) {
			System.out.println("Giving up all hope, you come to the conclusion that escape is both impossible and useless.\nYou take a rest, giving up all hope.");
		}
		
		else if (answer.equalsIgnoreCase("look_under_bed")) {
			System.out.println("You peer under the bed and find a secret hatch");
		}
		
		else if (answer.equalsIgnoreCase("look_out_window")) {
			System.out.println("You gaze out the window but your sight is blinded by darkness");
		}
		
		else if (answer.equalsIgnoreCase("window")) {
			System.out.println("You gaze out the window but your sight is blinded by darkness");

			System.out.print(">> ");
			answer = input.next();
			
			if (answer.equalsIgnoreCase("check_bed")) {
				System.out.println("You peek under the bed and find a secret hatch");
			}
			
			else if (answer.equalsIgnoreCase("look_at_bed")) {
				System.out.println("You peek under the bed and find a secret hatch");
			}
			
			else if (answer.equalsIgnoreCase("look_under_bed")) {
				System.out.println("You peek under the bed and find a secret hatch");
			}
			
			else if (answer.equalsIgnoreCase("look_out_window")) {
				System.out.println("You gaze out the window but your sight is blinded by darkness");
			}
			
			else if (answer.equalsIgnoreCase("window")) {
				System.out.println("You gaze out the window but your sight is blinded by darkness");
			}
			
			else if (answer.equalsIgnoreCase("pull_door")) {
				room = room + 1;
				hallway(choice, room, answer);
			}
			
			else if (answer.equalsIgnoreCase("open_door")) {
				System.out.println("You push it, but it doesn't buldge");
			}
			
			else if (answer.equalsIgnoreCase("open_hatch")) {
				System.out.println("You open the hatch and head into the dark basement.");
				room = room + 10;
				skeleton(choice, room, answer);
			}
			
			else {
				System.out.println("I don't understand");
			}

		}
		
		else if (answer.equalsIgnoreCase("pull_door")) {
			room = room + 1;
			hallway(room, answer);
		}
		
		else if (answer.equalsIgnoreCase("open_door")) {
			System.out.println("You push it, but it doesn't buldge");
		}
		
		else if (answer.equalsIgnoreCase("open_hatch")) {
			System.out.println("You open the hatch and head into the dark basement.");
			room = room + 10;
			skeleton(room, answer);
		}
		
		else {
			System.out.println("I don't understand");
		}
	}
	
	
	public static void hallway(int room, String answer) {
		Scanner input = new Scanner(System.in);
		System.out.println("You're able to get the door open and are faced with a hallway leading left and right. Where do you go?");
		while(room == 1) {
			System.out.print(">> ");
			answer = input.next();
			if (answer.equalsIgnoreCase("right")) {
				System.out.println("You turn right and enter a dining room. The only thing left in the room seems to be a pot.\nThe only exit is into the porch.");
			}
			else if (answer.equalsIgnoreCase("pot")) {
					System.out.println("Looking in the pot, you find and take a mysterious key.");
					Inventory.pot(false);
				}
			else if (answer.equalsIgnoreCase("look_at_pot")) {
					System.out.println("Looking in the pot, you find and take a mysterious key.");
					Inventory.pot(true);
				}
			else if (answer.equalsIgnoreCase("look_in_pot")) {
					System.out.println("Looking in the pot, you find and take a mysterious key.");
					Inventory.pot(true);
				}
			else if (answer.equalsIgnoreCase("open_pot")) {
					System.out.println("Looking in the pot, you find and take a mysterious key.");
					Inventory.pot(true);
				}
			else if (answer.equalsIgnoreCase("leave")) {
					System.out.println("You enter the porch.");
					porch(room, answer);
					room++;
				}
			else if (answer.equalsIgnoreCase("leave_dining_room")) {
					System.out.println("You enter the porch.");
					porch(room, answer);
					room++;
				}
			else if (answer.equalsIgnoreCase("enter_porch")) {
					System.out.println("You enter the porch.");
					porch(room, answer);
					room++;
				}
			else if (answer.equalsIgnoreCase("exit")) {
					System.out.println("You enter the porch.");
					porch(room, answer);
					room++;
				}
		
			else if (answer.equalsIgnoreCase("Left"))
					{
				System.out.println("You enter the kitchen. On the table, you see a cake and a glass of milk.\nWhich do you consume?");
				}
			else if (answer.equalsIgnoreCase("cake")) {
				System.out.println("You take a bite of the cake but it seems a bit crunchy. You realize you were chomping on a key.\nWith this, you unlock the door and escape!\nYou Win!");
				Inventory.exit();
			}
			else if (answer.equalsIgnoreCase("milk")) {
					System.out.println("You take a sip, but realize that it wasn't milk. You just drank antifreeze!\nGame Over!");
					Inventory.exit();
				}
			}
				}
					
	public static void skeleton(int room, String answer) {
		Scanner input = new Scanner(System.in);
		System.out.println("Something lunges at you, do you fight or run?");
		while(room == 10) {
			System.out.print(">> ");
			answer = input.next();
			if (answer.equalsIgnoreCase("fight")) {
				Health.fight(room, room);
		}
			else if (answer.equalsIgnoreCase("dance")) {
				System.out.println("The figure reveals itself as a skeleton as well as a fan of pop funk.\nHaving admiration for your 'sick moves', he shows you the way out.\nYou Win!");
				Inventory.exit();
				}
			
			else if (answer.equalsIgnoreCase("run")) {
				System.out.println("You book it away from the figure and find yourself at an elevator. Do you go up, or down?");
			}	else if (answer.equalsIgnoreCase("up")) {
					System.out.println("The elevator goes up and suddenly the cable snaps. You fall for what feels like minutes until you hit the bottom.\nGame Over");
					Inventory.exit();
		}
				else if (answer.equalsIgnoreCase("down")) {
					basement(room, answer);
					
				}
		}
			
	
	}
	
	public static void basement(int room, String answer) {
		Scanner input = new Scanner(System.in);
		Health.displayHealth();
		
}
	public static void porch(int room, String answer) {
		Scanner input = new Scanner(System.in);
		room = room + 10;
		System.out.println("When you reach the porch you notice a fence and a garage. Do you climb the fence, or search the garage?");
		while(room == 11) {
			System.out.print(">> ");
			answer = input.next();
				if (answer.equalsIgnoreCase("fence")) {
					System.out.println("Climbing over the fence, you realize you are not as athletic as you thought you were.\nYou fall to the ground, landing head first.\nGame Over");
					Inventory.exit();
				}
				else if (answer.equalsIgnoreCase("climb_fence")) {
					System.out.println("Climbing over the fence, you realize you are not as athletic as you thought you were.\nYou fall to the ground, landing head first.\nGame Over");
					Inventory.exit();
				}
				else if (answer.equalsIgnoreCase("climb_the_fence")) {
					System.out.println("Climbing over the fence, you realize you are not as athletic as you thought you were.\nYou fall to the ground, landing head first.\nGame Over");
					Inventory.exit();
				}
				else if (answer.equalsIgnoreCase("enter_garage")) {
					System.out.println("You enter the garage, with the only object being a toolbox. There is another exit leading to the yard.");
					garage(room, answer);
				}
				else if (answer.equalsIgnoreCase("go_into_garage")) {
					System.out.println("You enter the garage, with the only object being a toolbox. There is another exit leading to the yard.");
					garage(room, answer);
				}
				else if (answer.equalsIgnoreCase("garage")) {
					System.out.println("You enter the garage, with the only object being a toolbox. There is another exit leading to the yard.");
					garage(room, answer);
				}
				else if (answer.equalsIgnoreCase("go_to_garage")) {
					System.out.println("You enter the garage, with the only object being a toolbox. There is another exit leading to the yard.");
					garage(room, answer);
				}
				else if (answer.equalsIgnoreCase("search_garage")) {
					System.out.println("You enter the garage, with the only object being a toolbox. There is another exit leading to the yard.");
					garage(room, answer);
				}
				else if (answer.equalsIgnoreCase("search_garage")) {
					System.out.println("You enter the garage, with the only object being a toolbox. There is another exit leading to the yard.");
					garage(room, answer);
				}
		}
}
		public static void garage(int room, String answer) {
			Scanner input = new Scanner(System.in);
			room = room + 10;
			System.out.println("Do you search around or leave?");
			while(room == 21) {
				System.out.print(">> ");
				answer = input.next();
					if (answer.equalsIgnoreCase("search")) {
						System.out.println("You find a locked toolbox");
					}
					if (answer.equalsIgnoreCase("search_around")) {
						System.out.println("You find a locked toolbox");
					}
					if (answer.equalsIgnoreCase("leave")) {
						System.out.println("You exit the garage");
						yard(room, answer);
					}
					if (answer.equalsIgnoreCase("exit")) {
						System.out.println("You exit the garage");
						yard(room, answer);
					}
					if (answer.equalsIgnoreCase("leave_garage")) {
						System.out.println("You exit the garage");
						yard(room, answer);
					}
					if (answer.equalsIgnoreCase("unlock")) {
						Inventory.toolbox(false, false, room);
					}
					if (answer.equalsIgnoreCase("unlock_toolbox")) {
						Inventory.toolbox(false, false, room);
					}
					if (answer.equalsIgnoreCase("open_toolbox")) {
						System.out.println("The lock prevents you from opening it");
					}
					if (answer.equalsIgnoreCase("use_key")) {
						Inventory.toolbox(false, false, room);
					}
			}
	}
	public static void yard(int room, String answer) {
		Scanner input = new Scanner(System.in);
		room = 11;
		System.out.println("You enter the yard and come to another fence. It also contains a doghouse.");
		while(room == 11) {
			System.out.print(">> ");
			answer = input.next();
				if (answer.equalsIgnoreCase("fence")) {
					Inventory.outside(false);
					Inventory.exit();
				}
				if (answer.equalsIgnoreCase("cut_fence")) {
					Inventory.outside(false);
					Inventory.exit();
				}
				if (answer.equalsIgnoreCase("use_cutters")) {
					Inventory.outside(false);
					Inventory.exit();
				}
				if (answer.equalsIgnoreCase("fence")) {
					Inventory.outside(false);
					Inventory.exit();
				}
				if (answer.equalsIgnoreCase("doghouse")) {
					System.out.println("You get closer to get a look at the small shelter when suddenly the dog mauls you!\nGame Over");
					Inventory.exit();
				}
				if (answer.equalsIgnoreCase("dog_house")) {
					System.out.println("You get closer to get a look at the small shelter when suddenly the dog mauls you!\nGame Over");
					Inventory.exit();
				}
				if (answer.equalsIgnoreCase("enter_doghouse")) {
					System.out.println("You get closer to get a look at the small shelter when suddenly the dog mauls you!\nGame Over");
					Inventory.exit();
				}
				if (answer.equalsIgnoreCase("look_at_doghouse")) {
					System.out.println("You get closer to get a look at the small shelter when suddenly the dog mauls you!\nGame Over");
					Inventory.exit();
				}
				if (answer.equalsIgnoreCase("go_to_doghouse")) {
					System.out.println("You get closer to get a look at the small shelter when suddenly the dog mauls you!\nGame Over");
					Inventory.exit();
				}
		}
}
}