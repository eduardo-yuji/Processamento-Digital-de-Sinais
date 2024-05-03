public abstract class PizzaDecorator implements Pizza{
    Pizza pizzaDecorada;

    public PizzaDecorator(Pizza pizza) {
        pizzaDecorada = pizza;
    }
    
    
}
