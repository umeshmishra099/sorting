package com.sort.bubble;

import org.junit.Assert;
import org.junit.Test;

public class BubbleSortTest
{

  @Test
  public void sort()
  {
    int[] input = {6, 5, 3, 1, 8, 7, 2, 4};
    int[] expected = {1, 2, 3, 4, 5, 6, 7, 8};
    BubbleSort bubbleSort = new BubbleSort();
    bubbleSort.sort(input);
    Assert.assertArrayEquals(expected, input);
  }
}
