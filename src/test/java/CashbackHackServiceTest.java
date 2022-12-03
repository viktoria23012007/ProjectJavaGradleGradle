package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldCalculateRemainWithZeroAmount() {
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateRemainWithAmountEqualsBoundary() {
        int amount = 10_000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateRemainWithAmountUnderBoundary() {
        int amount = 9_999;

        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateRemainWithAmountOverBoundary() {
        int amount = 10_001;

        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(expected, actual);
    }
}