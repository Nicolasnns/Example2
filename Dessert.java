package Example2;

public class Dessert {
	private String name = " ";
	private int id = 0;
	private double price = 0.0;
	
	
	public Dessert(int id, String name, double price){
		this.id = id;
		this.name = name;
		this.price = price;
	}


	public String getName() {
		return name;
	}


	public int getId() {
		return id;
	}


	public double getPrice() {
		return price;
	}
	
	
	

}
