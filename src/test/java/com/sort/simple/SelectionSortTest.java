package com.sort.simple;

import org.junit.Test;

public class SelectionSortTest
{
  @Test
  public void sort()
  {
    int[] input = {6, 5, 3, 1, 8, 7, 2, 4};
    SelectionSort selectionSort = new SelectionSort(input);
    final int[] result = selectionSort.sort();
    for (int value : result)
    {
      System.out.print(value + " ");
    }
  }

  @Test
  public void sortRepeatNumbers()
  {
    int[] input = {8, 8, 9, 3, 1, 5, 6, 6, 1, 8, 3, 2, 5};
    SelectionSort selectionSort = new SelectionSort(input);
    final int[] result = selectionSort.sort();
    for (int value : result)
    {
      System.out.print(value + " ");
    }
  }


  @Test
  public void sortSameNumbers()
  {
    int[] input = {1,1,1,1,1,1,1,1,1,1};
    SelectionSort selectionSort = new SelectionSort(input);
    final int[] result = selectionSort.sort();
    for (int value : result)
    {
      System.out.print(value + " ");
    }
  }
}
