public class Main {
    public static void main() {
        Item bottle = new Item("Bottle", 1.2);
        Item stick = new Item("Stick", 0.5);
        Item potion = new Item("Potion", 2.5);

        Bag beltPouch = new Bag("Belt Pouch", .15);
        beltPouch.add(bottle);
        beltPouch.add(stick);
        beltPouch.add(potion);

        System.out.println(beltPouch.getWeight());
        beltPouch.displayInfo();

    }
}
