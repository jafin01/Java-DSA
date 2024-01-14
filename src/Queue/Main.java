package Queue;

public class Main {
  public static void main(String[] args) {
    // initialising a new Queue
    Queue myQueue = new Queue(3);
    System.out.println("Queue: ");
    myQueue.printQueue();

    // adding 2 to the queue
    myQueue.enqueue(2);
    System.out.println("Queue: ");
    myQueue.printQueue();

    // adding 1 to the queue
    myQueue.enqueue(1);
    System.out.println("Queue: ");
    myQueue.printQueue();

    // getHead, getTail and getLength
    myQueue.getHead();
    myQueue.getTail();
    myQueue.getLength();

    // removing an item from the queue
    myQueue.dequeue();
    System.out.println("Queue: ");
    myQueue.printQueue();
  }
}
