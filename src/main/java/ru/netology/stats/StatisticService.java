package ru.netology.stats;

public class StatisticService {

    public int sum(int[] items) {
        int result = 0;
        for (int item : items) {
            result += item;
        }
        return result;
    }

    public int avg(int[] items) {
        return sum(items) / items.length;
    }

    public int monthWihtMax(int[] items) {
        int max = items[0];
        for (int item : items) {
            if (max < item) {
                max = item;
            }
        }
        int monthCount = 0;
        int monthWihtMax = 0;
        for (int item : items) {
            monthCount++;
            if (item == max) {
                monthWihtMax = monthCount;
            }
        }
        return monthWihtMax;

    }

    public int monthWihtMin(int[] items) {
        int min = items[0];
        for (int item : items) {
            if (min > item) {
                min = item;
            }
        }
        int monthCount = 0;
        int monthWihtMin = 0;
        for (int item : items) {
            monthCount++;
            if (item == min) {
                monthWihtMin = monthCount;
            }
        }
        return monthWihtMin;
    }

    public int monthWihtMoreThanAvg(int[] items) {
        int avg = avg(items);
        int monthCount = 0;
        for (int item : items) {
            if (item > avg) {
                monthCount++;
            }
        }
        return monthCount;
    }

    public int monthWihtLessThanAvg(int[] items) {
        int avg = avg(items);
        int monthCount = 0;
        for (int item : items) {
            if (item < avg) {
                monthCount++;
            }
        }
        return monthCount;
    }
}