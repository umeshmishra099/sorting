package com.sort.bubble;

public class BubbleSort
{
  void sort(int[] input)
  {
    int inputLength = input.length;

    for (int i = 0; i < inputLength - 1; i++)
    {
      for (int j = 0; j < inputLength - i - 1; j++)
      {
        if (input[j] > input[j + 1])
        {
          int temp = input[j];
          input[j] = input[j + 1];
          input[j + 1] = temp;
        }
      }
    }
  }
}
