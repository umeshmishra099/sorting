package com.sort.distribution;

import org.junit.Assert;
import org.junit.Test;

public class BucketSortTest
{

  @Test
  public void sort()
  {
    int[] input = {11, 9, 21, 8, 17, 19, 13, 1, 24, 12};
    int[] expected = {1, 8, 9, 11, 12, 13, 17, 19, 21, 24};
    BucketSort bucketSort = new BucketSort();
    bucketSort.sort(input);
    Assert.assertArrayEquals(expected, input);
  }
}
