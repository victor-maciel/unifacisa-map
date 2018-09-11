package br.unifacisa.builder.pizzaria;

public class PizzariaDirector {
		protected PizzariaBuilder pizzaria;
	
	public PizzariaDirector(PizzariaBuilder pizzaria) {
		this.pizzaria = pizzaria;
	}
	
	public void montarPizza() {
		pizzaria.builderCheese();
		pizzaria.builderClam();
		pizzaria.builderDough();
		pizzaria.builderPepperoni();
		pizzaria.builderSauce();
		pizzaria.builderVeggies();
	}
	
	public PizzariaProduct getPizza() {
		return pizzaria.getPizza();
	}
	

}
