package _01_AnimalFarm;

public class Chicken extends Animal{

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("bok");
	}

	@Override
	public void eat(String food) {
		// TODO Auto-generated method stub
		System.out.println("The chicken ate " + food + "!");
	}

}
