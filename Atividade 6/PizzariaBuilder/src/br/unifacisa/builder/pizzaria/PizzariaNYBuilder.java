package br.unifacisa.builder.pizzaria;

public class PizzariaNYBuilder extends PizzariaBuilder {

	@Override
	public void builderDough() {
		pizza.dough = ThickCrustDough();
		
	}
	
	@Override
	public void builderSauce() {
		pizza.sauce = PlumTomatoSauce();

	}

	@Override
	public void builderCheese() {
		pizza.cheese = MozzarellaCheese();

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
		pizza.clam = FrozenClams();

	}
	
	private String FrozenClams() {
		return "Frozen Clams from Long Island Sound";
	}
	
	private String MozzarellaCheese() {
		return "Mozzarella Cheese";
	}
	
	private String PlumTomatoSauce() {
		return "Plum Tomato Sauce";
	}
	
	private String SlicedPepperoni() {
		return "ThickCrustDough Crust Dough";
	}
	
	private String ThickCrustDough() {
		return "ThickCrustDough Crust Dough";
	}

}
