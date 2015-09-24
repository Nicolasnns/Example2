package Example2;

public class Cousines {
	Polish polishCousines = new Polish();
	Mexican mexicanCousines = new Mexican();
	Italian italianCousines = new Italian();
	
	//-----------Categories Name |Polish|Mexican|Italian
	public void PolishCousines(){
		
		polishCousines.getPolishCousine();
	}

	public void MexicanCousines(){
		
		mexicanCousines.getMexicanCousine();
	}
	
	public void ItalianCousines(){
		
		italianCousines.getItalianCousine();
	}
	
	
	
	//---------Categories Drink Name  |Polish|Mexican|Italian
	
    public void PolishCousinesDrink(){
		
		polishCousines.getPolishDrinkName();
	}

	public void MexicanCousinesDrink(){
		
		mexicanCousines.getMexicanDrinkName();
	}
	
	public void ItalianCousinesDrink(){
		
		italianCousines.getItalianDrinkName();
	}
	
	//---------Categories Main Course Name  |Polish|Mexican|Italian
	
	    public void PolishCousinesMainCourse(){
			
			polishCousines.getPolishMainCourseName();
		}

		public void MexicanCousinesMainCourse(){
			
			mexicanCousines.getMexicanMainCourseName();
		}
		
		public void ItalianCousinesMainCourse(){
			
			italianCousines.getItalianMainCourseName();
		}
	
		//---------Categories Dessert Name  |Polish|Mexican|Italian
		
        public void PolishCousinesDessert(){
			
			polishCousines.getPolishMainCourseName();
		}

		public void MexicanCousinesDessert(){
			
			mexicanCousines.getMexicanMainCourseName();
		}
		
		public void ItalianCousinesDessert(){
			
			italianCousines.getItalianMainCourseName();
		}

}
