package com.sort.distribution;

import java.util.*;

 class BucketSort
{
  void sort(int[] input)
  {
    if (input.length == 0)
    {
      return;
    }
    List<List<Integer>> buckets = new ArrayList<>();
    for (int i = 0; i < input.length; i++)
    {
      buckets.add(new ArrayList<>());
    }
    Arrays.stream(input).forEach(value -> buckets.get(getBucketNumber(value)).add(value));
    buckets.forEach(Collections::sort);
    int index = 0;
    for (int i = 0; i < input.length; i++)
    {
      for (int j = 0; j < buckets.get(i).size(); j++)
      {
        input[index] = buckets.get(i).get(j);
        index = index + 1;
      }
    }

  }

  private int getBucketNumber(int value)
  {
    return value / 10;
  }
}
