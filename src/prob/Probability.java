package prob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Probability {

	private Random rand = new Random();
	private List <Integer> bag = new ArrayList <Integer>();
	
	public void addBag(int success, int fail) {
		// add success rate
		for(int i = 0; i < success; i++) {
			bag.add(0);
		}
		// add fail rate
		for(int i = 0; i < fail; i++) {
			bag.add(1);
		}
	}
	
	public void clearBag() {
		// clears bag
		bag.clear();
	}

	@Override
	public String toString() {
		// Shuffles to mix
		Collections.shuffle(bag);
		
		// Use random to make it more random 
		// Results based on what was picked
		switch(bag.get(rand.nextInt(bag.size()))) {
		case 0:
			return "Success";
		case 1:
			return "Fail";	
		default:
			return "Something went wrong!";
		}		
	}
}
