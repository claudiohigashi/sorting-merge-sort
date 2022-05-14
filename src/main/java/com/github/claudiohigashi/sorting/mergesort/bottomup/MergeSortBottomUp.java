package com.github.claudiohigashi.sorting.mergesort.bottomup;

import java.util.Arrays;

import static java.lang.Math.min;

/**
 * Reference:
 * https://en.wikipedia.org/wiki/Merge_sort
 * Bottom-up implementation
 */
public class MergeSortBottomUp {
    public void sort(int[] a) {
        int[] b = Arrays.copyOf(a, a.length);
        mergeSort(a, b, a.length);
    }

    private void mergeSort(int[] a, int[] b, int n) {
        for (int width = 1; width < n; width = 2 * width) {
            for (int i = 0; i < n; i = i + 2 * width) {
                merge(a, i, min(i + width, n), min(i + 2 * width, n), b);
            }
            System.arraycopy(b, 0, a, 0, b.length);
        }
    }

    private void merge(int[] a, int left, int right, int end, int[] b) {
        int i = left;
        int j = right;
        for (int k = left; k < end; k++) {
            if (i < right && (j >= end || a[i] <= a[j])) {
                b[k] = a[i];
                i++;
            } else {
                b[k] = a[j];
                j++;
            }
        }
    }
}
