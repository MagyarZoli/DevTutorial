package org.example.test.junit;

import org.example.auxiliary.Day;

import java.util.Arrays;

public class Calculator {

    public int sum(int x, int y) {
        return x + y;
    }

    public boolean isEven(int i) {
        return i % 2 == 0;
    }

    public int[] incrementArray(int[] ints) {
        int[] array = new int[ints.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = ints[i] + 1;
        }
        return array;
    }

    public float divide(int i, int j) {
        if (j == 0) {
            throw new IllegalArgumentException("Ints cannot bo divided by zero");
        }
        return (float) (i / j);
    }

    public boolean isWeekend(Day weekDay) {
        if (Arrays.asList(Day.weekend()).contains(weekDay)) {
            return true;
        }
        return false;
    }
}