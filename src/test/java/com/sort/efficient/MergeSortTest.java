package com.sort.efficient;

import org.junit.Assert;
import org.junit.Test;

public class MergeSortTest
{

  @Test
  public void sort()
  {
    int[] input = {6, 5, 3, 1, 8, 7, 2, 4};
    int[] expected = {1, 2, 3, 4, 5, 6, 7, 8};
    MergeSort mergeSort = new MergeSort();
    mergeSort.mergeSort(input);
    Assert.assertArrayEquals(expected, input);
  }

  @Test
  public void sortRepeatNumbers()
  {
    int[] input = {8, 8, 9, 3, 1, 5, 6, 6, 1, 8, 3, 2, 5};
    int[] expected = {1, 1, 2, 3, 3, 5, 5, 6, 6, 8, 8, 8, 9};
    MergeSort mergeSort = new MergeSort();
    mergeSort.mergeSort(input);
    Assert.assertArrayEquals(expected, input);
  }

  @Test
  public void sortSameNumbers()
  {
    int[] input = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    int[] expected = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    MergeSort mergeSort = new MergeSort();
    mergeSort.mergeSort(input);
    Assert.assertArrayEquals(expected, input);
  }
}
