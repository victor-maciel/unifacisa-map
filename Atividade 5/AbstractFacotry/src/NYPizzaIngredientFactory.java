package software_design.abstractFactory;


class PizzaStoreAF {

  public interface PizzaIngredientFactory {

  	public Dough createDough();
  	public Sauce createSauce();
  	public Cheese createCheese();
  	public Veggies[] createVeggies();
  	public Pepperoni createPepperoni();
  	public Clams createClam();

  }

  // Concrete Factory
  public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    	public Dough createDough() {
    		return new ThickCrustDough();
    	}

    	public Sauce createSauce() {
    		return new PlumTomatoSauce();
    	}

    	public Cheese createCheese() {
    		return new MozzarellaCheese();
    	}

    	public Veggies[] createVeggies() {
    		Veggies veggies[] = { new BlackOlives(),
    		                      new Spinach(),
    		                      new Eggplant() };
    		return veggies;
    	}

    	public Pepperoni createPepperoni() {
    		return new SlicedPepperoni();
    	}

    	public Clams createClam() {
    		return new FrozenClams();
    	}
  }
  // Parts of Pizza
  public interface BlackOlives {
	  public String toString();
  };
  
  public interface Spinach {
	  public String toString();
  };
  
  public interface Eggplant {
	  public String toString();
  };
  
  public interface Clams {
	   public String toString();
  }

  public interface Cheese {
	   public String toString();
  }

  public interface Sauce {
	    public String toString();
  }

  public interface Dough {
  	public String toString();
  }

  public interface Pepperoni {
  	public String toString();
  }

  public class FrozenClams implements Clams {

  	public String toString() {
  		return "Frozen Clams from Long Island Sound";
  	}
  }

  public class MozzarellaCheese implements Cheese {

  	public String toString() {
  		return "Mozzarella Cheese";
  	}
  }

  
  public class PlumTomatoSauce implements Sauce {
	  public String toString() {
	    return "Plum Tomato Sauce";
	  }

  public class ThickCrustDough implements Dough {
  	public String toString() {
  		return "ThickCrustDough Crust Dough";
  	}
  }

  public class SlicedPepperoni implements Pepperoni {
    public String toString() {
      return "Sliced Pepperoni";
    }
  }
   public class Azeitona implements Veggies {
    public String toString() {
      return "Azeitona";
    }
  }
   public class Popoye implements Veggies {
    public String toString() {
      return "Super Popeye";
    }
  }
   public class Egg implements Veggies {
    public String toString() {
      return "Ovos";
    }
  }
}