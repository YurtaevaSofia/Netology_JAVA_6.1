package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    int [] salesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @org.junit.jupiter.api.Test
    void totalSales() {
        int total = 0;
        for (int i : salesData) total += i;
        int expected = 180;
        assertEquals(expected, total);
    }

    @org.junit.jupiter.api.Test
    void averageTotalSales() {
        int total = 0;
        for (int i : salesData) total += i;
        int expected = 15;
        assertEquals(expected, total/12);
    }

    @org.junit.jupiter.api.Test
    void maximumSalesMonth() {
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