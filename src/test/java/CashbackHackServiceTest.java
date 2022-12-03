package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldCalculateRemainWithZeroAmount() {
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateRemainWithAmountEqualsBoundary() {
        int amount = 10_000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateRemainWithAmountUnderBoundary() {
        int amount = 9_999;

        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateRemainWithAmountOverBoundary() {
        int amount = 10_001;

        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);
    }
}