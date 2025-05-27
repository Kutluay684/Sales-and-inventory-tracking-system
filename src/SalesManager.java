import java.util.ArrayList;
import java.util.List;
public class SalesManager<T extends Product> {
    public List<Sale<T>> getSales() {
        return sales;
    }

    public void setSales(List<Sale<T>> sales) {
        this.sales = sales;
    }

    private List<Sale<T>> sales;
    public SalesManager()
    {
        this.sales=new ArrayList<>();
    }
    public void recordSale(Sale<T> sale)
    {
        sales.add(sale);
    }
    public double getDailyTotal()
    {
        double dailyTotal=0;


        for (Sale sale :sales)
        {
          dailyTotal+=sale.getTotalAmount();
        }
        return dailyTotal;
    }
    public void printSummary()
    {
        for (Sale sale : sales)
        {
            System.out.println("Number Of Sales:"+sales.size());
            System.out.println("Total Amount:"+sale.getTotalAmount());
        }
    }

}
