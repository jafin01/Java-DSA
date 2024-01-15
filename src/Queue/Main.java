package Queue;

public class Main {
  public static void main(String[] args) {
    // initialising a new Queue
    Queue myQueue = new Queue(1);
    System.out.println("Queue: ");
    myQueue.printQueue();

    // adding 2 to the queue
    myQueue.enqueue(2);
    System.out.println("Queue: ");
    myQueue.printQueue();

    // adding 3 to the queue
    myQueue.enqueue(3);
    System.out.println("Queue: ");
    myQueue.printQueue();

    // getHead, getTail and getLength
    myQueue.getHead();
    myQueue.getTail();
    myQueue.getLength();

    // removing an item from the queue
    System.out.println("Removed Item from the queue: " + myQueue.dequeue().value);
    myQueue.printQueue();

    // removing an item from the queue
    System.out.println("Removed Item from the queue: " + myQueue.dequeue().value);
    myQueue.printQueue();

    // removing an item from the queue
    System.out.println("Removed Item from the queue: " + myQueue.dequeue().value);
    myQueue.printQueue();
  }
}
