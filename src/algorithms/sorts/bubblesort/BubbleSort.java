package algorithms.sorts.bubblesort;

public class BubbleSort {
  public static void bubbleSort(int[] array) {
    for (int i = array.length - 1; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        if (array[j] > array[j + 1]) {
          int temp = array[j];
          array[j] = array[j+1];
          array[j+1] = temp;
        }
      }
    }
  }
  public static void main (String[] args) {
    int[] array = new int[]{5, 4, 3, 2, 1};
    bubbleSort(array);

    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + ", ");
    }
  }
}
