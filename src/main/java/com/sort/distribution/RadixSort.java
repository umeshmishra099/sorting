package com.sort.distribution;

import java.util.Arrays;

class RadixSort
{

  void sort(int[] input)
  {
    final int max = Arrays.stream(input).max().orElse(input[0]);
    for (int place = 1; max / place > 0; place = place * 10)
    {
      countingSort(input, input.length, place);
    }
  }

  private void countingSort(int[] input, int size, int place)
  {
    int[] output = new int[size + 1];
    int max = input[0];
    for (int i = 1; i < size; i++)
    {
      if (input[i] > max)
        max = input[i];
    }
    int[] count = new int[max + 1];

    for (int i = 0; i < max; ++i)
      count[i] = 0;

    for (int i = 0; i < size; i++)
      count[(input[i] / place) % 10]++;

    for (int i = 1; i < 10; i++)
      count[i] += count[i - 1];

    for (int i = size - 1; i >= 0; i--)
    {
      int countIndex = (input[i] / place) % 10;
      int index = count[countIndex] - 1;
      output[index] = input[i];
      count[countIndex] = index;
    }

    for (int i = 0; i < size; i++)
      input[i] = output[i];
  }
}
