// Data types - Long 
package datatypelong;

// Compute distance light travels using long variables.
public class Light {

	public static void main(String[] args) {
		int lightspeed;
		long days,seconds,distance;
		lightspeed = 186000; // approximate speed of light in miles per second
		days = 1000; //number of days
		/*One day has 24 hours, one hour has 60 minutes and one minute has 60 seconds.so, 
		 *  1 day = 24 hours/day � 60 minutes/hour � 60 seconds/minute = 86400 seconds/day
		 */
		seconds = days * 24 * 60 * 60; // convert to seconds
		System.out.println("seconds= "+ seconds);
		distance = lightspeed * seconds; // calculate distance 
		System.out.println("distance= "+ distance);
		System.out.println("In "+ days +" days light will travel about "+ distance +" miles.");	

	}

}
	