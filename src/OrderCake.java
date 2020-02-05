/** 2.
 Based on the Cake class, create 2 child/descendent classes called OrderCake and ReadyMadeCake with constructors,
 getters/setters and the additional instance variables and overridden methods.
 OrderCake

 Additional attribute	weight(kg)	rate * weight
 */


public class OrderCake extends Cake {

    private double weight;
    private static int numberOfCakes = 0; //Keep track of number of objects created

    /**
     * @param name
     * @param rate
     */
    public OrderCake(String name, double rate) {
        super(name, rate);
    }

    public void OrderCake(double weight) {
        this.weight = weight;
        numberOfCakes++;
    }
        public double getWight() {
            return weight;
        }

        public void setWeight(double weight){
            this.weight = weight;
        }
        public double getPrice() {
            return rate * weight;
        }
        public static int numberOfCakes() {
            return numberOfCakes();
        }

  /**  @Override
    public String toString() {
        return "Cake Name = " + name + ", Basic Rate Per kg = " + rate + ", Final Price = " + getPrice() + "";
    }*/
}

