public class Item extends InventoryComponent{
    //f
    private final String name;
    private final double weight;
    //c
    Item(String name, double weight){
        this.name = name;
        this.weight = weight;
    }
    //m
    @Override
    public String getName(){
        return name;
    }
    @Override
    public double getWeight(){
        return weight;
    }
    @Override
    public void displayInfo(){
        System.out.println("Item: " + this.name + " | " + "Weight: " + this.weight);
    }
}
