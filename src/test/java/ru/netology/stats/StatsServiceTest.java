package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();
        int[] companySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.calculateSum(companySales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAverageSum() {
        StatsService service = new StatsService();
        int[] companySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.averageSum(companySales);

        assertEquals(expected, actual);

    }

    @Test
    void shouldFindMinCompanySales() {
        StatsService service = new StatsService();
        long[] companySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.minCompanySales(companySales);

        assertEquals(expected, actual);

    }

    @Test
    void shouldFindMaxCompanySales() {
        StatsService service = new StatsService();
        long[] companySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.maxCompanySales(companySales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindBelowAverageSalesCompany() {
        StatsService service = new StatsService();
        int[] companySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.belowAverageSalesCompany(companySales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindAboveAverageSalesCompany() {
        StatsService service = new StatsService();
        int[] companySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.belowAverageSalesCompany(companySales);

        assertEquals(expected, actual);
    }
}