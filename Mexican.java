package Example2;

public class Mexican {
	Drink drinkMexican0 = new Drink(1, "DrinkMexican0", 20.1);
	Drink drinkMexican1 = new Drink(2, "DrinkMexican1", 20.2);
	Drink drinkMexican2 = new Drink(3, "DrinkMexican2", 20.3);
	
	MainCourse mainCourseMexican0 = new MainCourse(4, "mainCourseMexican0", 10.1);
	MainCourse mainCourseMexican1 = new MainCourse(5, "mainCourseMexican1", 10.2);
	MainCourse mainCourseMexican2 = new MainCourse(6, "mainCourseMexican2", 10.3);
	
	Dessert dessertMexican0 = new Dessert(7, "dessertMexican0", 5.1);
	Dessert dessertMexican1 = new Dessert(8, "dessertMexican1", 5.2);
	Dessert dessertMexican2 = new Dessert(9, "dessertMexican2", 5.3);

	
public void getMexicanCousine(){
		
	
		
		System.out.println("Meal Mexican: \n" + drinkMexican0.getName() + "\n"
				+ drinkMexican1.getName() + "\n" + drinkMexican2.getName() + "\n \n" + mainCourseMexican0.getName()
				+ "\n" + mainCourseMexican1.getName() + "\n" + mainCourseMexican2.getName() + "\n \n"
				+ dessertMexican0.getName() + "\n" + dessertMexican1.getName() + "\n"
				+ dessertMexican2.getName()+ "\n");}

public void getMexicanDrinkName(){
	System.out.println("Drink Mexican: \n \n" + drinkMexican0.getName() + "\n"
			+ drinkMexican1.getName() + "\n" + drinkMexican2.getName()+ "\n");
	
}

public void getMexicanMainCourseName(){
	System.out.println("Main Course Mexican: \n \n" +mainCourseMexican0.getName() + "\n"
			+ mainCourseMexican1.getName() + "\n"
			+ mainCourseMexican2.getName()+ "\n");
	
}

public void getMexicanDessertName(){
	System.out.println("Dessert Mexican: \n \n" + dessertMexican0.getName() + "\n" + dessertMexican1.getName()
			+ "\n" + dessertMexican2.getName()+ "\n");

}

}
