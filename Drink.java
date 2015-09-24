package Example2;

public class Drink {
	private String name = "";
	private int id = 0;
	private double price = 0.0;

	Lemon lemon = new Lemon();
	IceCubes iceCubes = new IceCubes();

	public String drinkWithLemon() {

		return lemon.put();
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public IceCubes getIceCubes() {
		return iceCubes;
	}

	public String drinkWithIceCubes() {

		return iceCubes.put();
	}

	public String drinkWithIceCubesPlusLemon() {
		String drinkWithIceCubesPlusLemon = lemon.put() + " , "
				+ iceCubes.put();
		return drinkWithIceCubesPlusLemon;
	}

	public Drink(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;

	}

}
