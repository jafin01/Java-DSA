package queue;

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
    length = 1;
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
      tail.next = newNode;
      tail = newNode;
    }

    length++;
  }

  public Node dequeue() {
    if (head == null) {
      System.out.println("Queue is Empty");
      return null;
    }

    Node temp = head;

    if (length == 1) {
      head = null;
      tail = null;
    } else {
      head = head.next;
      temp.next = null;
    }

    length--;
    return temp;
  }
}
