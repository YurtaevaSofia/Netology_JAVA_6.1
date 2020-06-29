package ru.netology.stats;

public class StatsService {



    public int totalSales (int [] salesData){
        int total = 0;
        for (int i : salesData) total += i;
        return total;
    }

    public static int averageTotalSales(int [] salesData){
        StatsService statService = new StatsService();
        return statService.totalSales(salesData)/12;
    }

    public int maximumSalesMonth (int [] salesData){
        int month = 0;
        int salesMaximum = 0;
        for (int i = 0; i < 12; i++) {
            if (salesData[i] >= salesMaximum) {
                salesMaximum = salesData[i];
                month = i+1;
            }
        }
        return month;
    }

    public int minimumSalesMonth (int [] salesData){
        int month = 0;
        int salesMinimum = 100;
        for (int i = 0; i < 12; i++) {
            if (salesData[i] <= salesMinimum) {
                salesMinimum = salesData[i];
                month = i+1;
            }
        }
        return month;
    }

    public int salesUnderAverage (int [] salesData){
        int averageSales = averageTotalSales(salesData);
        int n = 0;
        for (int i = 0; i < 12; i++) {
            if (salesData[i] < averageSales) {
                n++;
            }
        }
        return n;
    }

    public int salesOverAverage (int [] salesData){
        int averageSales = averageTotalSales(salesData);
        int n = 0;
        for (int i = 0; i < 12; i++) {
            if (salesData[i] > averageSales) {
                n++;
            }
        }
        return n;
    }
}




