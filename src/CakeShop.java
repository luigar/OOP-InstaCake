
import java.util.Arrays;

public class CakeShop {
    public static void main(String[] args) {

        Cake[] yummy = new Cake[20];
        yummy[0] = new OrderCake("1 Pound Vanilla Cake", 1, 1);
        yummy[1] = new ReadyMadeCake("1/2 Chocolate Cage", 1.25, 0.5);
        yummy[2] = new OrderCake("4 Pound Chocolate Cake", 1, 4);
        yummy[3] = new ReadyMadeCake("1/2 Chocolate Cage", 1.25, 0.5);
        yummy[4] = new ReadyMadeCake("1/2 Chocolate Cage", 1.25, 0.5);
        yummy[5] = new OrderCake("3 Pound Strawberry Cake", 1, 3);
        yummy[6] = new ReadyMadeCake("1/2 Chocolate Cage", 1.25, 0.5);
        yummy[7] = new OrderCake("5 Pound White Chocolate Cake", 1, 5);
        yummy[8] = new ReadyMadeCake("1/2 Chocolate Cage", 1.25, 0.5);
        yummy[9] = new ReadyMadeCake("1/2 Chocolate Cage", 1.25, 0.5);
        yummy[10] = new OrderCake("5 Pound Red Velvet Cake", 1, 5);
        yummy[11] = new OrderCake("4 Pound Peanut Butter Cake", 1, 4);
        yummy[12] = new ReadyMadeCake("1/2 Chocolate Cage", 1.25, 0.5);
        yummy[13] = new OrderCake("2 Pound Peanut Butter Cake", 1, 2);
        yummy[14] = new ReadyMadeCake("1/2 Chocolate Cage", 1.25, 0.5);
        yummy[15] = new OrderCake("2 Pound Peanut Butter Cake", 1, 2);
        yummy[16] = new ReadyMadeCake("1/2 Chocolate Cage", 1.25, 0.5);
        yummy[17] = new ReadyMadeCake("1/2 Chocolate Cage", 1.25, 0.5);
        yummy[18] = new ReadyMadeCake("1/2 Chocolate Cage", 1.25, 0.5);
        yummy[19] = new ReadyMadeCake("1/2 Chocolate Cage", 1.25, 0.5);

        System.out.println("Cakes Sold");
        System.out.println(" ");
        Arrays.stream(yummy).forEach(System.out::println);
        System.out.println(" ");



        System.out.println("Total Weight Sold:");
        System.out.println("Most Expensive Cake:");
    }
}
    class Cake {

        /**
         * Class level variables
         */
        public String name;
        public double rate;
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
         * @param name Cake name
         * @param rate Going Rate per Kg
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
            return rate;
        }

        @Override
        public String toString() {
            return "Cake Name = " + name + ", Basic Rate Per kg = " + rate + "";
        }

        public static int numberOfCakes() {
            return numberOfCakes();
        }
    }






