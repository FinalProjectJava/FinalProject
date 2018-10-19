package Final;
import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
public class Inventory {

	public static void inventory() {
		boolean key = false;
		boolean wireCutters = false;
		int something = 1;

	}
	public static void pot(boolean key) {
		// If the player finds the key in the pot
		key = true;

	}
	public static void toolbox(boolean key, boolean wireCutters, int something) {
		// This method is for the garage, and detirmines if you are able to get the wirecutters only with the key
		if (key = true) {
			System.out.println("You unlock the toolbox and recieve wirecutters");
			wireCutters = true;
		}
		else if (key = false) {
			System.out.println("You can't get it open, you need the key with the proper size");
		}

	}
	public static void outside(boolean wirecutters) {
		// If the player finds the key in the pot and unlocks the toolbox
		if (wirecutters = true) {
			System.out.println("You cut a hole in the fence and escape!\nYou Win!");
		}
		else if (wirecutters = false) {
			System.out.println("You can't get around the fence.");
		}

	}
	public static void exit(boolean key, boolean wireCutters) {
		// Asks the user if they want to play the game again
		Scanner input = new Scanner(System.in);
		String x = null;
		System.out.println("Would you like to quit? Y/N");
		x = input.next();
		
		if (x.equalsIgnoreCase("n")) {
			Main.main(null);
			key = false;
			wireCutters = false;
		}
		else if (x.equalsIgnoreCase("no")) {
			Main.main(null);
			key = false;
			wireCutters = false;
		}
		else if (x.equalsIgnoreCase("y")) {
			System.exit(0);
		}
		else if (x.equalsIgnoreCase("yes")) {
			System.exit(0);
		}
		
		}
		
}
