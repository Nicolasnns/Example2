package Example2;

public class Italian {

	Drink drinkItalian0 = new Drink(1, "DrinkItalian0", 20.1);
	Drink drinkItalian1 = new Drink(2, "DrinkItalian1", 20.2);
	Drink drinkItalian2 = new Drink(3, "DrinkItalian2", 20.3);

	MainCourse mainCourseItalian0 = new MainCourse(4, "mainCourseItalian0", 10.1);
	MainCourse mainCourseItalian1 = new MainCourse(5, "mainCourseItalian1", 10.2);
	MainCourse mainCourseItalian2 = new MainCourse(6, "mainCourseItalian2", 10.3);

	Dessert dessertItalian0 = new Dessert(7, "dessertItalian0", 5.1);
	Dessert dessertItalian1 = new Dessert(8, "dessertItalian1", 5.2);
	Dessert dessertItalian2 = new Dessert(9, "dessertItalian2", 5.3);

	public void getItalianCousine() {

		System.out.println("Meal Italian: \n \n" + drinkItalian0.getName() + "\n"
				+ drinkItalian1.getName() + "\n" + drinkItalian2.getName()
				+ "\n \n" + mainCourseItalian0.getName() + "\n"
				+ mainCourseItalian1.getName() + "\n"
				+ mainCourseItalian2.getName() + "\n \n"
				+ dessertItalian0.getName() + "\n" + dessertItalian1.getName()
				+ "\n" + dessertItalian2.getName()+ "\n");
	}
	
	public void getItalianDrinkName(){
		System.out.println("Drink Italian: \n \n" + drinkItalian0.getName() + "\n"
				+ drinkItalian1.getName() + "\n" + drinkItalian2.getName()+ "\n");
		
	}
	
    public void getItalianMainCourseName(){
    	System.out.println("Main Course Italian: \n \n" + mainCourseItalian0.getName() + "\n"
				+ mainCourseItalian1.getName() + "\n"
				+ mainCourseItalian2.getName()+ "\n");
		
	}

    public void getItalianDessertName(){
    	System.out.println("Dessert Italian: \n \n" + dessertItalian0.getName() + "\n" + dessertItalian1.getName()
				+ "\n" + dessertItalian2.getName()+ "\n");
 
    }

}
