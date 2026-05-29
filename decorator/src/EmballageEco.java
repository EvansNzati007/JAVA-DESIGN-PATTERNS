public class EmballageEco extends  OptionPizza{
    public EmballageEco(PizzaCommande pizzaCommande) {
        super(pizzaCommande);
    }

    @Override
    public String getDescription()
    {
        return pizzaCommande.getDescription() +" Emballage Ecologique";
    }
}
