package com.vlsu.lab08.sorting;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSortTest {
    QuickSort qSort = new QuickSort();

    @Test
    public void emptyTest() {
        int[] sourceArr = new int[0];
        int[] expectedArr = new int[0];

        qSort.sort(sourceArr);
        assertArrayEquals(expectedArr, sourceArr);
    }

    @Test
    public void reverseTest() {
        int n = 100;
        int[] sourceArr = new int[n];
        int[] expectedArr = new int[n];

        for (int i = 0; i < n; i++) {
            sourceArr[i] = (n - 1) - i;
            expectedArr[i] = i;
        }

        qSort.sort(sourceArr);
        assertArrayEquals(expectedArr, sourceArr);
    }

    @Test
    public void sortedTest() {
        int n = 100;
        int[] sourceArr = new int[n];
        int[] expectedArr = new int[n];

        for (int i = 0; i < n; i++) {
            sourceArr[i] = i;
            expectedArr[i] = i;
        }

        qSort.sort(sourceArr);
        assertArrayEquals(expectedArr, sourceArr);
    }}