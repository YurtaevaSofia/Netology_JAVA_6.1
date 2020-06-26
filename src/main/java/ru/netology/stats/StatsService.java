package ru.netology.stats;

public class StatsService {



    public int totalSales (){
        int [] salesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int total = 0;
        for (int i : salesData) total += i;
        return total;
    }

    public static int averageTotalSales(){
        StatsService statService = new StatsService();
        int averageTotal = statService.totalSales()/12;
        return averageTotal;
    }

    public int maximumSalesMonth (){
        int [] salesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
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

    public int minimumSalesMonth (){
        int [] salesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
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

    public int salesUnderAverage (){
        int [] salesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int averageSales = averageTotalSales();
        int n = 0;
        for (int i = 0; i < 12; i++) {
            if (salesData[i] < averageSales) {
                n++;
            }
        }
        return n;
    }

    public int salesOverAverage (){
        int [] salesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int averageSales = averageTotalSales();
        int n = 0;
        for (int i = 0; i < 12; i++) {
            if (salesData[i] > averageSales) {
                n++;
            }
        }
        return n;
    }
}




