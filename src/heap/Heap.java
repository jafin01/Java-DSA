package heap;

import java.util.ArrayList;
import java.util.List;

public class Heap {
  private List<Integer> heap;

  public Heap() {
    heap = new ArrayList<>();
  }

  public List<Integer> getHeap() {
    return new ArrayList<>(heap);
  }

  public int leftChild(int index) {
    return (index * 2) + 1;
  }

  public int rightChild(int index) {
    return (index * 2) + 2;
  }

  public int parent(int index) {
    return (index - 1) / 2;
  }

  public void swap(int index1, int index2) {
    int temp =  heap.get(index1);
    heap.set(index1, heap.get(index2));
    heap.set(index2, temp);
  }

  public void insert(int value) {
    heap.add(value);
    int curr = heap.size() - 1;
    int parent = parent(curr);

    while (curr > 0 && heap.get(curr) > heap.get(parent)) {
      swap(curr, parent);
      curr = parent;
      parent = parent(curr);
    }
  }
}
