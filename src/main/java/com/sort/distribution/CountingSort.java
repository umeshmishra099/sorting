package com.sort.distribution;

class CountingSort
{

  int[] sort(int[] input)
  {
    int[] count = getCounting(input);
    int[] result = new int[input.length];
    for (int value : input)
    {
      result[count[value]] = value;
      count[value] = count[value] + 1;
    }
    return result;
  }

  private int[] getCounting(int[] input)
  {
    int max = input[0];
    for (int i = 1; i < input.length; i++)
    {
      if (input[i] > max)
        max = input[i];
    }
    int[] valueCount = new int[max + 1];

    for (int value : input)
    {
      valueCount[value] = valueCount[value] + 1;
    }
    int sum = valueCount[0];
    for (int i = 1; i < valueCount.length; i++)
    {
      sum = sum + valueCount[i];
      valueCount[i] = sum;
    }
    for (int i = valueCount.length - 1; i > 0; i--)
    {
      valueCount[i] = valueCount[i - 1];
    }
    valueCount[0] = 0;
    return valueCount;
  }
}
