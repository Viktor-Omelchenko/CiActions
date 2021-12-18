package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class statServiceTest {

    @Test
    public void findMax() {
        statService service = new statService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual;
        actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}
