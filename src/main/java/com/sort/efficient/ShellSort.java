package com.sort.efficient;

public class ShellSort
{
  void sort(int[] input)
  {
    int inputLength = input.length;

    for (int i = inputLength / 2; i > 0; i = i / 2)
    {
      for (int j = i; j < inputLength; j++)
      {
        for (int k = j - i; k >= 0; k = k - i)
        {
          if (input[k] <= input[k + i])
          {
            break;
          }
          else
          {
            int temp = input[k];
            input[k] = input[k + i];
            input[k + i] = temp;
          }
        }
      }
    }





























    /*int i, j, k, tmp;
    int num = input.length;
    for (i = num / 2; i > 0; i = i / 2)
    {
      for (j = i; j < num; j++)
      {
        for (k = j - i; k >= 0; k = k - i)
        {
          if (input[k + i] >= input[k])
            break;
          else
          {
            tmp = input[k];
            input[k] = input[k + i];
            input[k + i] = tmp;
          }
        }
      }
    }*/
  }
}
