 public class PizzaBase implements  PizzaCommande {

    protected String description;



    public void setDescription(String description) {
        this.description = description;
    }

    public PizzaBase(String description) {
        this.description = description;
    }


     @Override
     public String getDescription() {
         return  description;
     }
 }


