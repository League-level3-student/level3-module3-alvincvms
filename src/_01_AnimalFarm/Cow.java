package _01_AnimalFarm;

public class Cow extends Animal{

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("moo");
	}

	@Override
	public void eat(String food) {
		// TODO Auto-generated method stub
		System.out.println("The cow ate " + food + "!");
	}

}
