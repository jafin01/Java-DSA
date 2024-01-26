package algorithms.sorts.quicksort;

import java.util.Arrays;

public class QuickSort {
  public static void swap(int[] array, int firstIndex, int secondIndex) {
    int temp = array[firstIndex];
    array[firstIndex] = array[secondIndex];
    array[secondIndex] = temp;
  }

  public static int pivot(int[] array, int pivotIndex, int endIndex) {
    int swapIndex = pivotIndex;

    for (int i = pivotIndex + 1; i < endIndex; i++) {
      if (array[i] < array[pivotIndex]) {
        swapIndex++;
        swap(array, swapIndex, i);
      }
    }

    swap(array, pivotIndex, swapIndex);
    return swapIndex;
  }

  public static void main (String[] args) {
    int[] array = new int[]{4, 6, 1, 7, 3, 2, 5};

    System.out.println(pivot(array, 0, array.length - 1));

    System.out.println(Arrays.toString(array));

  }
}
