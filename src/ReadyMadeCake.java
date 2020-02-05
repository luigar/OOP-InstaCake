/** 2.
 Based on the Cake class, create 2 child/descendent classes called OrderCake and ReadyMadeCake with constructors,
 getters/setters and the additional instance variables and overridden methods.
 ReadyMadeCake

 Price calculation	quantity	rate*quantity
 */


class ReadyMadeCake extends Cake {

    private double quantity;
    private static int numberOfCakes = 0; //Keep track of number of objects created

    /**
     * @param name Cake name
     * @param rate Going Rate per Kg
     */
    public ReadyMadeCake(String name, double rate) {
        super(name, rate);
    }


    public void OrderCake(double quantity) {
        this.quantity = quantity;
        numberOfCakes++;
    }

    public double getPrice()
    {
        return rate * quantity;
    }

    public static int numberOfCakes() {
        return numberOfCakes();
    }

    /**  @Override
    public String toString() {
    return "Cake Name = " + name + ", Basic Rate Per kg = " + rate + ", Final Price = " + getPrice() + "";
    }*/

}
