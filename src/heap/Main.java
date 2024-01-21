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
    System.out.println(myheap.getHeap());

    // removing element from heap;
    myheap.remove();
    System.out.println(myheap.getHeap());
    
    myheap.remove();
    System.out.println(myheap.getHeap());

    myheap.remove();
    System.out.println(myheap.getHeap());

    myheap.remove();
    System.out.println(myheap.getHeap());

    myheap.remove();
    System.out.println(myheap.getHeap());

    myheap.remove();
    System.out.println(myheap.getHeap());

    // adding 80, 75, 65, 55, 60, 50
    myheap.insert(80);
    myheap.insert(75);
    myheap.insert(65);
    myheap.insert(55);
    myheap.insert(60);
    myheap.insert(50);
    myheap.insert(95);

    System.out.println(myheap.getHeap());

    // remove element
    System.out.println("Removed " + myheap.remove());
    System.out.println(myheap.getHeap());
    
    System.out.println("Removed " + myheap.remove());
    System.out.println(myheap.getHeap());


  }
}
