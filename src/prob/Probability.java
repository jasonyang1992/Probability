package prob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Probability {

	private Random rand = new Random();
	private List <Object> bag = new ArrayList <Object>();
	
	public void addBag(int success, int fail) {
		// add success rate
		for(int i = 0; i < success; i++) {
			bag.add(true);
		}
		// add fail rate
		for(int i = 0; i < fail; i++) {
			bag.add(false);
		}
	}
	
	public void clearBag() {
		// clears bag
		bag.clear();
	}
	
	public String pickProb() {
		
		// Shuffles to mix
		Collections.shuffle(bag);
		
		// Use random to create more random  
		if((boolean) bag.get(rand.nextInt(bag.size())) == true) {
			return "success";
		}
		else {
			return "failure";
		}

	}
}
