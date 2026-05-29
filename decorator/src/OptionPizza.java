abstract class OptionPizza  implements  PizzaCommande{
    protected PizzaCommande pizzaCommande;
    public OptionPizza(PizzaCommande pizzaCommande) {
        this.pizzaCommande = pizzaCommande;
    }

    @Override
    public String getDescription(){
        return pizzaCommande.getDescription();
    }
}
