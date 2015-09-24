package Example2;

public class Menu {
	Cousines cousinesPolish = new Cousines();
	Cousines cousinesMexican = new Cousines();
	Cousines cousinesItalian = new Cousines();
	
	
	public void getAll(){
		cousinesPolish.PolishCousines();
		cousinesMexican.MexicanCousines();
		cousinesItalian.ItalianCousines();
		
	}
	
	public void getDrink(){
		cousinesPolish.PolishCousinesDrink();
		cousinesMexican.MexicanCousinesDrink();
		cousinesItalian.ItalianCousinesDrink();
		
	}
	

	
	

}
