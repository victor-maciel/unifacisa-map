package br.unifacisa.builder.pizzaria;

public abstract class PizzariaBuilder {
	
	protected PizzariaProduct pizza = new PizzariaProduct();
	
	public abstract void builderDough();
	public abstract void builderSauce();
	public abstract void builderCheese();
	public abstract void builderVeggies();
	public abstract void builderPepperoni();
	public abstract void builderClam();
	
	public PizzariaProduct getPizza() {
		return pizza;
	}

}
