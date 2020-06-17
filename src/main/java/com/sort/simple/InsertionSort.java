package com.sort.simple;

 class InsertionSort
{

  private int[] input;

  InsertionSort(int[] input)
  {
    this.input = input;
  }

   int[] sort()
  {
    int i = 1;
    while (i < input.length)
    {
      int j = i;
      while (j > 0 && input[j - 1] > input[j])
      {
        int key = input[j];
        input[j] = input[j - 1];
        input[j - 1] = key;
        j = j - 1;
      }
      i = i + 1;
    }
    return input;
  }
}
