package com.github.claudiohigashi.sorting.mergesort.topdown;

import java.util.Arrays;

/**
 * Reference:
 * https://en.wikipedia.org/wiki/Merge_sort
 * Top-down implementation
 */
public class MergeSortTopDown {
    public void sort(int[] a) {
        int[] b = Arrays.copyOf(a, a.length);
        mergeSort(b, 0, a.length, a);
    }

    private void mergeSort(int[] b, int begin, int end, int[] a) {
        if (end - begin <= 1) {
            return; // size == 1, consider it sorted
        }

        int middle = (begin + end) / 2;
        mergeSort(a, begin, middle, b);
        mergeSort(a, middle, end, b);
        merge(b, begin, middle, end, a);
    }

    private void merge(int[] a, int begin, int middle, int end, int[] b) {
        int i = begin;
        int j = middle;
        for (int k = begin; k < end; k++) {
            if (i < middle && (j >= end || a[i] <= a[j])) {
                b[k] = a[i];
                i++;
            } else {
                b[k] = a[j];
                j++;
            }
        }
    }
}
