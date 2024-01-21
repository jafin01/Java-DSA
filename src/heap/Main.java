package heap;

public class Main {
  public static void main(String[] args) {
    // initialising a heap
    Heap myheap = new Heap();
    myheap.insert(99);
    myheap.insert(72);
    myheap.insert(61);
    myheap.insert(58);

    System.out.println(myheap.getHeap());;


    // adding value 100
    myheap.insert(100);
    System.out.println(myheap.getHeap());;

    // adding value 75
    myheap.insert(75 );
    System.out.println(myheap.getHeap());;
  }
}
