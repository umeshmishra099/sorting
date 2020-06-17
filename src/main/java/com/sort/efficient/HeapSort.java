package com.sort.efficient;

class HeapSort
{
  void sort(int[] input)
  {
    int inputLength = input.length;
    for (int i = inputLength / 2 - 1; i >= 0; i--)
    {
      heapify(input, inputLength, i);
    }
    for (int i = inputLength - 1; i >= 0; i--)
    {
      int temp = input[0];
      input[0] = input[i];
      input[i] = temp;
      heapify(input, i, 0);
    }
  }

  private void heapify(int[] input, int inputLength, int i)
  {
    int largest = i;
    int left = 2 * i + 1;
    int right = 2 * i + 2;
    if (left < inputLength && input[largest] < input[left])
    {
      largest = left;
    }
    if (right < inputLength && input[largest] < input[right])
    {
      largest = right;
    }
    if (largest != i)
    {
      int temp = input[i];
      input[i] = input[largest];
      input[largest] = temp;
      heapify(input, inputLength, largest);
    }
  }
}
