package week03.day4;

import java.util.ArrayList;
import java.util.List;

public class Stock {

    private List<Double> stocks = new ArrayList<>();

    public Stock(List<Double> stocks) {
        this.stocks = stocks;
    }

    public List<Double> getStocks() {
        return stocks;
    }

    // 1.23, 4.35, 0.23, 4.0, 8.4

    public double maxProfit() {

        double maxProfit = 0;

        for (int i = 0; i < stocks.size() - 1; i++) {
            for (int j = i + 1; j < stocks.size(); j++) {
                double actualValue = stocks.get(j) - stocks.get(i);
                if (actualValue > maxProfit) {
                    maxProfit = actualValue;
                }
            }
        }

        return maxProfit;
    }

//    1.23,4.35,0.23,4.0,8.4

    public double maxProfit2() {
        double minPrice = stocks.get(0);
        double maxProfit = 0;

        for (int i = 1; i < stocks.size(); i++) {
            double currentPrice = stocks.get(i);
            minPrice = Math.min(minPrice, currentPrice);
            double potentialProfit = currentPrice - minPrice;
            maxProfit = Math.max(maxProfit, potentialProfit);
        }

        return maxProfit;
    }


}
