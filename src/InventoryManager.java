
import java.util.HashMap;

public class InventoryManager {
    private HashMap<String, Product> inventory;

    public HashMap<String, Product> getInventory() {return inventory;}

    public void setInventory(HashMap<String, Product> inventory) {this.inventory = inventory;}

    public InventoryManager() {
        this.inventory = new HashMap<>();
    }

    public void addProduct(Product product)
    {
        inventory.put(product.getName(), product);
    }
    public Product getProduct(String name)
    {
        return inventory.get(name);
    }
    public void printStock()
    {
        for (Product product: inventory.values())
        {
            System.out.println("Product Name:"+product.getName());
            System.out.println("Price:"+product.getPrice());
            System.out.println("Stock:"+product.getStock());
        }
    }
}
