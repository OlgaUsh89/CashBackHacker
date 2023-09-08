package ru.netology.service;


import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;


public class CashbackHackServiceTest {
    @Test
    public void shouldCountAmount() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCountAmount1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);

    }
    @Test
    public void shouldCountAmount0() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(expected, actual);

    }
    @Test
    public void shouldCountAmount1001() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;

        int actual = service.remain(amount);
        int expected = 999;
        assertEquals(expected, actual);

    }
    @Test
    public void shouldCountAmount5() {
        CashbackHackService service = new CashbackHackService();
        int amount = 5;

        int actual = service.remain(amount);
        int expected = 995;
        assertEquals(expected, actual);

    }
}
