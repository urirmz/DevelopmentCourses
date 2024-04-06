public class ProductWarehouseWithHistory extends ProductWarehouse{
    private ChangeHistory history;
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);        
        history = new ChangeHistory();
        this.addToWarehouse(initialBalance);
    }
    
    public String history() {
        return history.toString();
    }
    
    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        history.add(getBalance());
    }
    
    @Override
    public double takeFromWarehouse(double amount) {
        double taken = super.takeFromWarehouse(amount);
        history.add(getBalance());
        return taken;
    }
    
    public void printAnalysis() {
        System.out.println("Product: " + getName());
        System.out.println("History: " + history.toString());
        System.out.println("Largest amount of product: " + history.maxValue());
        System.out.println("Smallest amount of product: " + history.minValue());
        System.out.println("Average: " + history.average());
    }
}
