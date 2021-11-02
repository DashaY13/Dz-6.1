package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticServiceTest {

    @Test
    public void shouldSum() {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatisticService statisticService = new StatisticService();

        int actual = statisticService.sum(purchases);
        int expected = 180;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldAvg() {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatisticService statisticService = new StatisticService();

        int actual = statisticService.avg(purchases);
        int expected = 15;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnMonthWithMax() {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatisticService statisticService = new StatisticService();

        int actual = statisticService.monthWihtMax(purchases);
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnMonthWithMin() {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatisticService statisticService = new StatisticService();

        int actual = statisticService.monthWihtMin(purchases);
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnMonthMoreThanAvg() {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatisticService statisticService = new StatisticService();

        int actual = statisticService.monthWihtMoreThanAvg(purchases);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnMonthLessThanAvg() {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatisticService statisticService = new StatisticService();

        int actual = statisticService.monthWihtLessThanAvg(purchases);
        int expected = 5;
        assertEquals(expected, actual);
    }
}

