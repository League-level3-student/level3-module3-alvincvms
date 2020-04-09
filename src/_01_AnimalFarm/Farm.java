package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm {
	public static void main(String[] args) {
		ArrayList<Animal> farm = new ArrayList<Animal>();
		farm.add(new Chicken());
		farm.add(new Cow());
		farm.add(new Pig());
		farm.add(new Sheep());
		farm.add(new Chicken());
		farm.add(new Pig());
		for(Animal a : farm) {
			a.makeNoise();
			a.eat("Donald Trump");
			System.out.println("\n");
		}
	}
}
