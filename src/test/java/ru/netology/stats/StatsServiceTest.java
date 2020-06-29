package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {


    @org.junit.jupiter.api.Test
    void totalSales() {

        // Data
        int [] salesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        // Testing
        int total = 0;
        for (int i : salesData) total += i;
        int expected = 180;
        assertEquals(expected, total);
    }

    @org.junit.jupiter.api.Test
    void averageTotalSales() {
        // Data
        int [] salesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        // Testing
        StatsService statService = new StatsService();
        int averageTotal = statService.totalSales(salesData)/12;
        int expected = 15;

        assertEquals(expected, averageTotal);
    }

    @org.junit.jupiter.api.Test
    void maximumSalesMonth() {
        // Data
        int [] salesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        // Testing
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
        // Data
        int [] salesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        // Testing
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
        // Data
        int [] salesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        // Testing
        int averageSales = StatsService.averageTotalSales(salesData);
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
        // Data
        int [] salesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        // Testing
        int averageSales = StatsService.averageTotalSales(salesData);
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