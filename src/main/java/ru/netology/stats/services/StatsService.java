package ru.netology.stats.services;

public class StatsService {

    public int calcSumSales(int[] sales) {
        int sum = 0;
        for (int i : sales) {
            sum += i;
        }
        return sum;
    }

    public int calcMiddleSumSales(int[] sales) {
        int middleSum = calcSumSales(sales) / sales.length;
        {
        }
        return middleSum;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int calcNumberMonthsWithSalesLowerMiddle(long[] sales) {
        int numberMonths = 0;
        int middleSumSales = 15;
        for (long monthSale : sales) {
            if (monthSale < middleSumSales) {
                numberMonths += 1;
            }
        }
        return numberMonths;
    }

    public int calcNumberMonthsWithSalesHigherMiddle(long[] sales) {
        int numberMonths = 0;
        int middleSumSales = 15;
        for (long monthSale : sales) {
            if (monthSale > middleSumSales) {
                numberMonths += 1;
            }
        }
        return numberMonths;
    }
}