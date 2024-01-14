package Queue;

public class Queue {
  private Node head;
  private Node tail;
  private int length;

  class Node {
    int value;
    Node next;

    Node (int value) {
      this.value = value;
    }
  }

  public Queue(int value) {
    Node newNode = new Node(value);

    head = newNode;
    tail = newNode;
    length++;
  }

  public void printQueue() {
    if (head == null) return;

    Node temp = head;

    while (temp != null) {
      System.out.println(temp.value);
      temp = temp.next;
    }
  }

  public void getLength() {
    System.out.println("Length: " + length);
  }

  public void getHead() {
    System.out.println("Head: " + head.value);
  }

  public void getTail() {
    System.out.println("Tail: " + tail.value);
  }

  public void enqueue(int value) {
    Node newNode = new Node(value);

    if (head == null) {
      head = newNode;
      tail = newNode;
    } else {
      newNode.next = head;
      head = newNode;
    }

    length++;
  }

  public void dequeue() {
    if (head == null) {
      System.out.println("Queue is Empty");
      return;
    }

    if (length == 1) {
      head = null;
      tail = null;
    } else {
      Node temp = head;

      while (temp.next.next != null) {
        temp = temp.next;
      }

      System.out.println("Temp: " + temp.value);

      temp.next = null;
      tail = temp;
    }

    length--;
  }
}
