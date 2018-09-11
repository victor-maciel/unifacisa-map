package br.unifacisa.builder.pizzaria;

public class PizzariaCGBuilder extends PizzariaBuilder{
	
	@Override
	public void builderDough() {
		pizza.dough = ThinCrustDough();
		
	}
	
	@Override
	public void builderSauce() {
		pizza.sauce = MarinaraSauce();

	}

	@Override
	public void builderCheese() {
		pizza.cheese = ReggianoCheese();

	}

	@Override
	public void builderVeggies() {
		// TODO Auto-generated method stub

	}

	@Override
	public void builderPepperoni() {
		pizza.pepperoni = null;
	}

	@Override
	public void builderClam() {
		pizza.clam = FreshClams();

	}
	
	private String FreshClams() {
		return "Fresh Clams from Long Island Sound";
	}
	
	private String ReggianoCheese() {
		return "Reggiano Cheese";
	}
	
	private String MarinaraSauce() {
		return "Marinara Sauce";
	}
	
	private String SlicedPepperoni() {
		return "ThickCrustDough Crust Dough";
	}
	
	private String ThinCrustDough() {
		return "ThinCrustDough Crust Dough";
	}

}
