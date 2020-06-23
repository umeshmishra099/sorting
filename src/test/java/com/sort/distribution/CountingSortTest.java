package com.sort.distribution;

import org.junit.Assert;
import org.junit.Test;

public class CountingSortTest
{

  @Test
  public void sort()
  {
    int[] input = {1, 0, 3, 1, 3, 1};
    int[] expected = {0, 1, 1, 1, 3, 3};
    CountingSort countingSort = new CountingSort();
    int[] result = countingSort.sort(input);
    Assert.assertArrayEquals(expected, result);
  }

  @Test
  public void sort1()
  {
    int[] input = {1, 4, 1, 2, 7, 5, 2};
    int[] expected = {1, 1, 2, 2, 4, 5, 7};
    CountingSort countingSort = new CountingSort();
    int[] result = countingSort.sort(input);
    Assert.assertArrayEquals(expected, result);
  }
}
