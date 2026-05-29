public class LivraisonExpress extends  OptionPizza{
    public LivraisonExpress(PizzaCommande pizzaCommande) {
        super(pizzaCommande);
    }

    @Override
    public String getDescription()
    {
        return pizzaCommande.getDescription() +" Livraison Express";
    }
}
