package com.sort.distribution;

import org.junit.Assert;
import org.junit.Test;

public class RadixSortTest
{

  @Test
  public void sort()
  {
    int[] input = {11, 977, 311, 87, 51, 61};
    int[] expected = {11, 51, 61, 87, 311, 977};
    RadixSort radixSort = new RadixSort();
    radixSort.sort(input);
    Assert.assertArrayEquals(expected, input);
  }
}
