package Final;
import java.util.Timer;
import java.util.TimerTask;
public class Health {

	//ADD TIMER
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int health = 100;
		int i = 0;

		
		while(i< 10) {
		    try {
		    	i++;
		        //sending the actual Thread of execution to sleep X milliseconds
		        Thread.sleep(500);
		    } catch(InterruptedException ie) {}
		    System.out.println("Hello world!");
		}
		
		
		System.out.println("Your health is ");
	}
	
	

}