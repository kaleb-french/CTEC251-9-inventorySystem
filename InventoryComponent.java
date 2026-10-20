public abstract class InventoryComponent {
    public void add(){
        throw new UnsupportedOperationException("This cannot use add");
    }
    public void remove(){
        throw new UnsupportedOperationException("This cannot use remove");
    }
    public InventoryComponent getChild(){
        throw new UnsupportedOperationException("This cannot use getChild");
    }
    public String getName(){
        return null;
    }
    public double getWeight(){
        return 0.0;
    }
    public void displayInfo(){
        System.out.println("NULL");
    }

}
