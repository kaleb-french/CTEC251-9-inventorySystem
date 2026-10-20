import java.util.ArrayList;

public class Bag extends InventoryComponent{
    //f
    private String name;
    private double weight;
    private ArrayList<InventoryComponent> contents = new ArrayList<>();
    //c
    Bag(String name, double weight){
        this.name = name;
        this.weight = weight;
    }
    //m
    @Override
    public void add(InventoryComponent component){
        contents.add(component);
    }
    @Override
    public void remove(InventoryComponent component){
        contents.remove(component);
    }
    @Override
    public InventoryComponent getChild(int i){
        return contents.get(i);
    }
    @Override
    public String getName(){
        return name;
    }
    @Override
    public double getWeight(){
        double currentWeight = weight;
        for(InventoryComponent component: contents)
            currentWeight += component.getWeight();
        return currentWeight;
    }
    @Override
    public void displayInfo(){
        System.out.println("Bag: " + this.name + " | Base Weight: " + this.weight);
        for(InventoryComponent component: contents){
            component.displayInfo();
        }
    }
}
