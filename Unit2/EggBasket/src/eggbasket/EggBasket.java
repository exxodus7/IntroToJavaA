package eggbasket;

/**
 * An example class used for counting the number of eggs based on how many
 * baskets there are and how many eggs per basket.
 */
public class EggBasket {

    /**
     * @param args No parameters expected.
     */
    public static void main(String[] args) {
        int numBaskets, eggsPerBasket, totalEggs;

        numBaskets = 10;
        eggsPerBasket = 6;

        totalEggs = numBaskets * eggsPerBasket;

        System.out.println("If you have");
        System.out.println(eggsPerBasket + " eggs per basket");
        System.out.println("and " + numBaskets + " baskets,");
        System.out.println("you have " + totalEggs + " eggs.");
    }

}
