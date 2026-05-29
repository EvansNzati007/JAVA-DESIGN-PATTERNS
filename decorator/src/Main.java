//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("=".repeat(100));
        System.out.println("   PATTERN DECORATOR - Application : Gestion Pizzeria");
        System.out.println("   Ajout dynamique d'options aux Pizzas");
        System.out.println("=".repeat(100));

        System.out.println("\n📦 PIZZA 1 : Pizza minimaliste");
        System.out.println("═".repeat(70));
        PizzaCommande pizza1 = new PizzaBase("fromage");

        System.out.println("Pizza minimaliste d'options aux Pizzas");
        System.out.println("Description : " + pizza1.getDescription());


        System.out.println("\n\n📦 PIZZA 2 : Pizza avec fromage supplementaire et DIVERS OPTIONS AJOUTE DYNAMIQUMENT");
        System.out.println("═".repeat(70));

        PizzaCommande pizza2 = new PizzaBase("poulet");

        pizza2 = new FromageSupp(pizza2);

        System.out.println("Description : " + pizza2.getDescription());

        pizza2 = new GarnitureSpeciale(pizza2);

        System.out.println("Description : " + pizza2.getDescription());


        pizza2 = new EmballageEco(pizza2);

        System.out.println("Description : " + pizza2.getDescription());

        pizza2 = new SaucePremium(pizza2);
        System.out.println("Description : " + pizza2.getDescription());

        pizza2 = new LivraisonExpress(pizza2);

        System.out.println("Description : " + pizza2.getDescription());




    }
}