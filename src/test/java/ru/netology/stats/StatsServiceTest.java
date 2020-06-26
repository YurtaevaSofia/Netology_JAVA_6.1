package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {


    @org.junit.jupiter.api.Test
    void totalSales() {
        int [] salesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int total = 0;
        for (int i : salesData) total += i;
        int expected = 180;
        assertEquals(expected, total);
    }

    @org.junit.jupiter.api.Test
    void averageTotalSales() {
        StatsService statService = new StatsService();
        int averageTotal = statService.totalSales()/12;
        int expected = 15;

        assertEquals(expected, averageTotal);
    }

    @org.junit.jupiter.api.Test
    void maximumSalesMonth() {
        int [] salesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int month = 0;
        int salesMaximum = 0;
        for (int i = 0; i < 12; i++) {
            if (salesData[i] >= salesMaximum) {
                salesMaximum = salesData[i];
                month = i+1;
            }
        }
        int expected = 8;
        assertEquals(expected, month);
    }

    @org.junit.jupiter.api.Test
    void minimumSalesMonth() {
        int [] salesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int month = 0;
        int salesMinimum = 100;
        for (int i = 0; i < 12; i++) {
            if (salesData[i] <= salesMinimum) {
                salesMinimum = salesData[i];
                month = i+1;
            }
        }
        int expected = 9;
        assertEquals(expected, month);
    }

    @org.junit.jupiter.api.Test
    void salesUnderAverage() {
        int [] salesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int averageSales = StatsService.averageTotalSales();
        int n = 0;
        for (int i = 0; i < 12; i++) {
            if (salesData[i] < averageSales) {
                n++;
            }
        }
        int expected = 5;
        assertEquals(expected, n);
    }

    @org.junit.jupiter.api.Test
    void salesOverAverage() {
        int [] salesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int averageSales = StatsService.averageTotalSales();
        int n = 0;
        for (int i = 0; i < 12; i++) {
            if (salesData[i] > averageSales) {
                n++;
            }
        }
        int expected = 5;
        assertEquals(expected, n);
    }
}