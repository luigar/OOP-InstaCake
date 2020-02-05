import java.util.ArrayList;

public class CakeShop {
    public static void main(String[] args) {
        ArrayList<Cake> cakes = new ArrayList<>();
        cakes.add(new OrderCake("Special Order 5 Pounds Vanilla", 1.25));
        cakes.add(new ReadyMadeCake("3 Pounds Chocolate", 1.00));

        for (Cake cake : cakes) {
            System.out.println(cakes);
            System.out.println("Price : "+ cake.getPrice());
        }
    }
}
    class Cake {

        /**
         * Class level variables
         */
        String name;
        double rate;
         private static int numberOfCakes = 0; //Keep track of number of objects created

        /**
         * First no-arg constructor
         */

        public void Cake() {
            name = "vanilla";
            rate = 1.25;
            numberOfCakes++;
        }

        /**
         * @param name
         * @param rate Second constructor that takes values for both params
         */
        public Cake(String name, double rate) {

            this.name = name;
            this.rate = rate;
            numberOfCakes++;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setRate(double rate) {
            this.rate = rate;
        }

        public double getPrice() {
            return 0;
        }

        @Override
        public String toString() {
            return "Cake Name = " + name + ", Basic Rate Per kg = " + rate + ", Final Price = " + getPrice() + "";
        }

        public static int numberOfCakes() {
            return numberOfCakes();
        }
    }






