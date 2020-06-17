package com.sort.simple;

import org.junit.Assert;
import org.junit.Test;

public class InsertionSortTest
{

  @Test
  public void insertionSort()
  {
    int[] input = {6, 5, 3, 1, 8, 7, 2, 4};
    int[] expected = {1, 2, 3, 4, 5, 6, 7, 8};
    InsertionSort insertionSort = new InsertionSort(input);
    int[] result = insertionSort.sort();
    Assert.assertArrayEquals(expected, result);
  }

  @Test
  public void sortRepeatNumbers()
  {
    int[] input = {8, 8, 9, 3, 1, 5, 6, 6, 1, 8, 3, 2, 5};
    int[] expected = {1, 1, 2, 3, 3, 5, 5, 6, 6, 8, 8, 8, 9};
    InsertionSort insertionSort = new InsertionSort(input);
    int[] result = insertionSort.sort();
    Assert.assertArrayEquals(expected, result);
  }

  @Test
  public void sortSameNumbers()
  {
    int[] input = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    int[] expected = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    InsertionSort insertionSort = new InsertionSort(input);
    final int[] result = insertionSort.sort();
    Assert.assertArrayEquals(expected, result);
  }

}
