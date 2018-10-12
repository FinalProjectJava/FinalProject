package Final;

import java.util.Scanner;

public class Dialogue {

	public static void main(String[] args) {
		int choice[]=new int[5];
		int room = 0;
		int annoying = 0;
		String answer;
		
		// This array detirmines which room you are in
		
		// Hallway
		choice[0] = 1;
		// Dining Room
		choice[1] = 2;
		// Porch
		choice[2] = 3;
		// Yard
		choice[3] = 4;
		// Kitchen
		choice[4] = 5;  
 
		Scanner input = new Scanner(System.in);
		System.out.println("You awaken in a room with only a bed. The only way out seems to be the rusted door.");
		while(room == 0) {
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
		
	}
	
	public static void hallway(int choice[], int room, String answer) {
		Scanner input = new Scanner(System.in);
		System.out.println("You're able to get the door open and are faced with a hallway leading left and right. Where do you go?");
		while(room == 1) {
			System.out.print(">> ");
			answer = input.next();
			
			}
		}
	public static void skeleton(int choice[], int room, String answer) {
		Scanner input = new Scanner(System.in);
		System.out.println("Something lunges at you, do you fight or run?");
		while(room == 10) {
			System.out.print(">> ");
			answer = input.next();
			if (answer.equalsIgnoreCase("fight")) {
				System.out.println("You punch the mysterious figure only to realize it is a skeleton.\nYou break your hand on impact, and the skeleton finishes you off.\nGame Over");
		}
	}
}
}
