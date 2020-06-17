package com.sort.efficient;

class MergeSort
{

  void mergeSort(int[] a)
  {
    int n = a.length;
    if (n < 2)
    {
      return;
    }
    int mid = n / 2;
    int[] l = new int[mid];
    int[] r = new int[n - mid];

    System.arraycopy(a, 0, l, 0, mid);
    System.arraycopy(a, mid, r, 0, n - mid);
    mergeSort(l);
    mergeSort(r);

    merge(a, l, r);
  }

  private void merge(int[] result, int[] left, int[] right)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    while (i < left.length && j < right.length)
    {
      if (left[i] <= right[j])
      {
        result[k] = left[i];
        k = k + 1;
        i = i + 1;
      }
      else
      {
        result[k] = right[j];
        k = k + 1;
        j = j + 1;
      }
    }

    while (i < left.length)
    {
      result[k] = left[i];
      k = k + 1;
      i = i + 1;
    }

    while (j < right.length)
    {
      result[k] = right[j];
      k = k + 1;
      j = j + 1;
    }
  }
}
