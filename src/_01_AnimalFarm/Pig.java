package _01_AnimalFarm;

public class Pig extends Animal{

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("oink");
	}

	@Override
	public void eat(String food) {
		// TODO Auto-generated method stub
		System.out.println("The pig ate " + food + "!");
	}

}
