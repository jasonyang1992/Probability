package prob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Probability {

	private Random rand = new Random();
	private List <Object> bag = new ArrayList <Object>();
	
	private int denominator;
	
	// Constructor fraction of a possibility ex [3/5] = 60%
	public Probability(int numerator, int denominator) {
		super();
		this.denominator = denominator;
		
		for (int i = 0; i < numerator ; i++) {
			bag.add(true);
		}
		
		for (int i = 0; i < (denominator - numerator); i++) {
			bag.add(false);
		}
	}

	public Probability() {
		super();
	}
	
	public String pickProb() {
		
		// Shuffles to mix
		Collections.shuffle(bag);
		
		// Use random to create more random  
		if((boolean) bag.get(rand.nextInt(denominator)) == true) {
			return "success";
		}
		else {
			return "failure";
		}

	}
}
