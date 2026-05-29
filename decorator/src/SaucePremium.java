public class SaucePremium extends OptionPizza{

    public SaucePremium(PizzaCommande pizzaCommande) {
        super(pizzaCommande);
    }

    @Override
    public String getDescription()
    {
        return pizzaCommande.getDescription() +" Sauce Premium";
    }
}
