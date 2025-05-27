public class Product {
    private String name;
    private double price;
    private int stock;

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    public void reduceStock(int quantity)
    {
        stock-=quantity;
    }
    public void restock(int quantity)
    {
        stock+=quantity;
    }
    public String toString()
    {
        return "Product{name='" + name + "', price=" + price + ", stock=" + stock + "}";
    }

}
