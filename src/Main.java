public class Main {
    public static void main() {
        try{
            Item bottle = new Item("Bottle", 1.2);
            Item stick = new Item("Stick", 0.5);
            Item potionB = new Item("Potion Blue", 2.5);
            Item potionR = new Item("Potion Red", 2.5);
            Item bedRoll = new Item("Bed Roll", 12.2);
            Item rope = new Item("Rope", 7.0);
            Item coin1 = new Item("Copper Coin", .12);
            Item coin2 = new Item("Silver Coin", .15);

            Bag coinPurse = new Bag("Coin Purse", .2);
            coinPurse.add(coin1);
            coinPurse.add(coin2);

            Bag beltPouch = new Bag("Belt Pouch", .15);
            beltPouch.add(bottle);
            beltPouch.add(stick);
            beltPouch.add(coinPurse);

            Bag poitionBag = new Bag("Potion Pouch", .15);
            poitionBag.add(potionB);
            poitionBag.add(potionR);

            Bag backpack = new Bag("Backpack", 4.75);
            backpack.add(rope);
            backpack.add(bedRoll);
            backpack.add(beltPouch);
            backpack.add(poitionBag);

            System.out.println("Total Weight: " + backpack.getWeight());
            backpack.displayInfo();

            Bag emptyBag = new Bag("A Bag, but empty", .11);
            emptyBag.getWeight();
            emptyBag.displayInfo();

            backpack.remove(rope);
            System.out.println("Total Weight: " + backpack.getWeight());

        } catch(Exception e){
            System.out.println(e);
        }
    }
}
