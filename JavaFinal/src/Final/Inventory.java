package Final;
import javax.swing.*;
import java.awt.*;
public class Inventory {

	public static void inventory() {
		boolean key = false;
		boolean wireCutters = false;
		int something = 0;
		something = something + 1;

	}
	public static void pot(boolean key) {
		// If the player finds the key in the pot
		key = true;

	}
	public static void toolbox(boolean key, boolean wireCutters, int something) {
		// This method is for the garage, and detirmines if you are able to get the wirecutters only with the key
		if (something == 1) {
			System.out.println("You unlock the toolbox and recieve wirecutters");
			wireCutters = true;
		}
		else if (key == false) {
			System.out.println("You can't get it open, you need the key with the proper size");
		}

	}

}
