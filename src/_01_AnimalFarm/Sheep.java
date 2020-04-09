package _01_AnimalFarm;

public class Sheep extends Animal{

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("meh");
	}

	@Override
	public void eat(String food) {
		// TODO Auto-generated method stub
		System.out.println("The sheep ate " + food + "!");
	}

}
