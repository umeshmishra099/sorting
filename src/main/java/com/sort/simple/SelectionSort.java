package com.sort.simple;

class SelectionSort
{
  private int[] input;

  SelectionSort(int[] input)
  {
    this.input = input;
  }

  int[] sort()
  {
    int inputLength = input.length;
    for (int i = 0; i < inputLength-1; i++)
    {
      int minIndex = i;
      for (int j = i + 1; j < inputLength; j++)
      {
        if (input[minIndex] > input[j])
        {
          minIndex = j;
        }
      }
      if (minIndex != i)
      {
        int minValue = input[minIndex];
        input[minIndex] = input[i];
        input[i] = minValue;
      }
    }
    return input;
  }
}
