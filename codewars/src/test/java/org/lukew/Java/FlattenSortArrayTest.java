package org.lukew.Java;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlattenSortArrayTest {

    @Test
    public void exampleTest() {
        assertArrayEquals(new int[]{}, FlattenSortArray.flattenAndSort(new int[][]{}));
        assertArrayEquals(new int[]{1}, FlattenSortArray.flattenAndSort(new int[][]{{}, {1}}));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, FlattenSortArray.flattenAndSort(new int[][]{{3, 2, 1}, {7, 9, 8}, {6, 4, 5}}));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 100}, FlattenSortArray.flattenAndSort(new int[][]{{1, 3, 5} ,{100}, {2, 4, 6}}));
        assertArrayEquals(new int[]{111, 222, 333, 444, 555, 666, 777, 888, 999}, FlattenSortArray.flattenAndSort(new int[][] {{111, 999}, {222}, {333}, {444}, {888}, {777}, {666}, {555}}));
    }

}