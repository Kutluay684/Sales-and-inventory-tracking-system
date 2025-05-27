import java.util.HashMap;

public class Sale<T extends Product>  {
    public HashMap<T, Integer> getItems() {
        return items;
    }

    public void setItems(HashMap<T, Integer> items) {
        this.items = items;
    }

    private HashMap<T, Integer> items;
    public Sale()
    {
        this.items=new HashMap<>();
    }
    public void addItem(T product, int quantity ) {
        if (product.getStock()<quantity)
        {
           throw new IllegalArgumentException("Not Enough Stock");
        }
        else
        {

            product.reduceStock(quantity);
            items.put(product,quantity);
        }

    }
    public double getTotalAmount()
    {
        double total=0;
     for (Product product : items.keySet())
     {
        total+=items.get(product)*product.getPrice();
     }
     return total;
    }

}
