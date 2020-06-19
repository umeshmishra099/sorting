package com.sort.efficient;

public class QuickSort
{
  void sort(int[] input, int start, int end)
  {
    if (start < end)
    {
      int j = partition(input, start, end);
      sort(input, start, j - 1);
      sort(input, j + 1, end);
    }
  }

  private int partition(int[] input, int start, int end)
  {
    int pivot = input[start];
    int i = start;
    int j = end;
    while (i < j)
    {
      while (pivot >= input[i])
      {
        i = i + 1;
      }

      while (pivot < input[j])
      {
        j = j - 1;
      }

      if (i < j)
      {
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
      }
    }
    int temp = input[start];
    input[start] = input[j];
    input[j] = temp;
    return j;
  }
}
