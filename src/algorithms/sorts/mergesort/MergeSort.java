package algorithms.sorts.mergesort;

import java.util.Arrays;

public class MergeSort {
  public static int[] merge(int[] array1, int[] array2) {
    int[] combinedArray = new int[array1.length + array2.length];
    int i = 0;
    int j = 0;
    int index = 0;

    while (i < array1.length && j < array2.length) {
      if (array1[i] < array2[j]) {
        combinedArray[index] = array1[i];
        i++;
      } else {
        combinedArray[index] = array2[j];
        j++;
      }
      index++;
    }

    while (i < array1.length) {
      combinedArray[index] = array1[i];
      i++;
      index++;
    }

    while (j < array1.length) {
      combinedArray[index] = array2[j];
      j++;
      index++;
    }

    return combinedArray;
  }

  public static int[] mergeSort(int[] array) {
    if (array.length == 1) return array;
    
    int midIndex = array.length/2;
    int[] left = mergeSort(Arrays.copyOfRange(array, 0, midIndex));
    int[] right = mergeSort(Arrays.copyOfRange(array, midIndex, array.length));

    return merge(left, right);
  }

  public static void main (String[] args) {
    int[] array1 = new int[]{1, 3, 7, 8};
    int[] array2 = new int[]{2, 4, 5, 6};

    System.out.println(Arrays.toString(merge(array1, array2)));

    int[] array = new int[]{3, 1, 4, 2};
    System.out.println(Arrays.toString(mergeSort(array)));
  }
}
