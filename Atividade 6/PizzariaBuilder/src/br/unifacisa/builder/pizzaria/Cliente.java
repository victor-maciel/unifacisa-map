package br.unifacisa.builder.pizzaria;

public class Cliente {
	
	public static void main(String[] args) {
		PizzariaDirector pizzaria = new PizzariaDirector(
	            new PizzariaNYBuilder());
		
		pizzaria.montarPizza();
	    PizzariaProduct pizza = pizzaria.getPizza();
	    System.out.println("Pizza: " + pizza.cheese + "/" + pizza.dough);
	 
	    System.out.println();
	 
	    pizzaria = new PizzariaDirector(new PizzariaCGBuilder());
	    pizzaria.montarPizza();
	    pizza = pizzaria.getPizza();
	    System.out.println("Pizza: " + pizza.cheese + "/" + pizza.dough + "/" + pizza.clam + "/" + pizza.pepperoni);
}

}
