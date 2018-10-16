package Final;
import java.util.Timer;
import java.util.TimerTask;
public class Health {

	//ADD TIMER
	
	public static void displayHealth() {
		// TODO Auto-generated method stub
		int health = 100;
		int i = 0;

		// This timer will be used for a gas room
		while(i< 50) {
		    try {
		    	i++;
		       // Miliseconds v
		        Thread.sleep(500);
		    } catch(InterruptedException ie) {}
		    health = health - 2;
		    System.out.println("Your health is " + health);
		}
		
		
		
	}
	
	

}