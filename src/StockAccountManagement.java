import java.util.ArrayList;
import java.util.Scanner;

class Stock {
    private String stock_name;
    private int num_of_shares;
    private double share_price;

    public Stock(String name, int shares, double price) {
        this.stock_name = name;
        this.num_of_shares = shares;
        this.share_price = price;
    }

    public String getName() {
        return stock_name;
    }

    public int getShares() {
        return num_of_shares;
    }

    public double getPrice() {
        return share_price;
    }
    public double getValue() {
        return num_of_shares * share_price;
    }
}

class StockPortfolio {
    private ArrayList<Stock> stocks;

    public StockPortfolio() {
        stocks = new ArrayList<>();
    }

    public void addStock(Stock stock) {
        stocks.add(stock);
    }

    public double getTotalValue() {
        double totalValue = 0;
        for (Stock stock : stocks) {
            totalValue += stock.getValue();
        }
        return totalValue;
    }

    public void printReport() {
        System.out.println("Stock Report");
        for (Stock stock : stocks) {
            System.out.printf("%s -%d shares - $%.2f%n", stock.getName(), stock.getShares(), stock.getValue());
        }
        System.out.printf("Total value: $%.2f%n", getTotalValue());
    }
}

public class StockAccountManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StockPortfolio portfolio = new StockPortfolio();

        System.out.print("Enter number of stocks: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter stock name: ");
            String name = scanner.nextLine();
            System.out.print("Enter number of shares: ");
            int shares = scanner.nextInt();
            System.out.print("Enter share price: ");
            double price = scanner.nextDouble();
            scanner.nextLine();

            Stock stock = new Stock(name, shares, price);
            portfolio.addStock(stock);
        }

        portfolio.printReport();
    }
}