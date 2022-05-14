package com.github.claudiohigashi.sorting.mergesort.topdown;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MergeSortTopDownTest {

    @Test
    public void test() {
        MergeSortTopDown sort = new MergeSortTopDown();
        int[] values = new int[]{9, 3, 4, 1, 7, 6, 8, 5, 0, 2};
        sort.sort(values);
        Assertions.assertArrayEquals(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, values);
    }

}