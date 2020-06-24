package ru.netology.stats;

public class StatsService {

    static int [] salesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    public int totalSales (){
        int total = 0;
        for (int i : salesData) total += i;
        return total;
    }

    public static int averageTotalSales(){
        int total = 0;
        for (int i : salesData) total += i;
        return total/12;
    }

    public int maximumSalesMonth (){
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




