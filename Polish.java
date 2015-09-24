package Example2;

public class Polish {

	Drink drinkPolish0 = new Drink(1, "DrinkPolish0", 20.1);
	Drink drinkPolish1 = new Drink(2, "DrinkPolish1", 20.2);
	Drink drinkPolish2 = new Drink(3, "DrinkPolish2", 20.3);
	
	

	MainCourse mainCoursePolish0 = new MainCourse(4, "mainCoursePolish0", 10.1);
	MainCourse mainCoursePolish1 = new MainCourse(5, "mainCoursePolish1", 10.2);
	MainCourse mainCoursePolish2 = new MainCourse(6, "mainCoursePolish2", 10.3);

	Dessert dessertPolish0 = new Dessert(7, "dessertPolish0", 5.1);
	Dessert dessertPolish1 = new Dessert(8, "dessertPolish1", 5.2);
	Dessert dessertPolish2 = new Dessert(9, "dessertPolish2", 5.3);

	public void getPolishCousine() {

		System.out.println("Meal Polish: \n \n" + drinkPolish0.getName() + "\n"
				+ drinkPolish1.getName() + "\n" + drinkPolish2.getName() + "\n \n" + mainCoursePolish0.getName()
				+ "\n" + mainCoursePolish1.getName() + "\n" + mainCoursePolish2.getName() + "\n \n"
				+ dessertPolish0.getName() + "\n" + dessertPolish1.getName() + "\n"
				+ dessertPolish2.getName()+ "\n");
	}
	
	public void getPolishDrinkName(){
		System.out.println("Drink Polish: \n \n" + drinkPolish0.getName() + "\n"
				+ drinkPolish1.getName() + "\n" + drinkPolish2.getName()+ "\n");
		
	}
	
    public void getPolishMainCourseName(){
    	System.out.println("Main Course Polish: \n \n" +mainCoursePolish0.getName() + "\n"
				+ mainCoursePolish1.getName() + "\n"
				+ mainCoursePolish2.getName()+ "\n");
		
	}

    public void getPolishDessertName(){
    	System.out.println("Dessert Polish: \n \n" +dessertPolish0.getName() + "\n" + dessertPolish1.getName()
				+ "\n" + dessertPolish2.getName()+ "\n");
 
    }

    

}
