package com.sort.efficient;

import org.junit.Assert;
import org.junit.Test;

public class ShellSortTest
{

  @Test
  public void sort()
  {
    int[] input = {6, 5, 3, 1, 8, 7, 2, 4};
    int[] expected = {1, 2, 3, 4, 5, 6, 7, 8};
    ShellSort shellSort = new ShellSort();
    shellSort.sort(input);
    Assert.assertArrayEquals(expected, input);
  }

}
