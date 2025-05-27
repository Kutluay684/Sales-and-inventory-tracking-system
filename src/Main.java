public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop",300,5);
        Product p2 = new Product("Computer",50,5);
        Product p3 = new Product("MacBook",20000,5);

        InventoryManager inventoryManager=new InventoryManager();

        inventoryManager.addProduct(p1);
        inventoryManager.addProduct(p2);
        inventoryManager.addProduct(p3);

        inventoryManager.printStock();

        Sale<Product> sale = new Sale<>();

        sale.addItem(p1,1);
        sale.addItem(p2,2);
        sale.addItem(p3,3);

        SalesManager salesManager =new SalesManager();
        salesManager.recordSale(sale);
        salesManager.printSummary();
    }
}