package ru.netology.stats.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldCalcSumSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        int actualSum = service.calcSumSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldCalcMiddleSumSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMiddleSum = 15;
        int actualMiddleSum = service.calcMiddleSumSales(sales);

        Assertions.assertEquals(expectedMiddleSum, actualMiddleSum);
    }

    @Test
    public void shouldFindTheNumberOfTheMonthOfMinSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMonth = 9;
        long actualMonth = service.minSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindTheNumberOfTheMonthOfMaxSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMonth = 8;
        long actualMonth = service.maxSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldCalcNumberMonthsWithSalesLowerMiddle() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedNumberMonths = 5;
        long actualNumberMonths = service.calcNumberMonthsWithSalesLowerMiddle(sales);

        Assertions.assertEquals(expectedNumberMonths, actualNumberMonths);
    }

    @Test
    public void shouldCalcNumberMonthsWithSalesHigherMiddle() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedNumberMonths = 5;
        long actualNumberMonths = service.calcNumberMonthsWithSalesHigherMiddle(sales);

        Assertions.assertEquals(expectedNumberMonths, actualNumberMonths);
    }
}
