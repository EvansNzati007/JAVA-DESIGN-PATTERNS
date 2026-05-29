public class FromageSupp extends OptionPizza {
    public FromageSupp(PizzaCommande pizzaCommande) {
        super(pizzaCommande);
    }

    @Override
    public String getDescription()
    {
        return pizzaCommande.getDescription() +" Fromage Supplementaire";
    }
}
