public class GarnitureSpeciale extends OptionPizza {
    public GarnitureSpeciale(PizzaCommande pizzaCommande) {
        super(pizzaCommande);
    }

    @Override
    public String getDescription() {
        return pizzaCommande.getDescription() + " Garniture Speciale";
    }

}
