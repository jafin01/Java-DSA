package LinkedList;

import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;

public class LinkedList {
  private Node head;
  private Node tail;
  private int length;

  public class Node {
    public int value;
    Node next;

    Node(int value) {
      this.value = value;
    }
  }

  public LinkedList(int value) {
    Node newNode = new Node(value);
    head = newNode;
    tail = newNode;
    length = 1;
  }

  public void printList() {
      Node temp = head;
      if (length == 0) System.out.println("Linked List is Empty");
      while (temp != null) {
        System.out.println(temp.value);
        temp = temp.next;
      }
  }

  public void getHead() {
    System.out.println("Head" + this.head.value);
  }

  public void getTail() {
    System.out.println("Tail" + this.tail.value);
  }

  public void getLength() {
    System.out.println("Length" + this.length);
  }

  public int getLastValue() {
    if (tail != null) return tail.value;
    else {
      throw new NoSuchElementException("The List is empty");
    }
  }

  public void append(int value) {
    Node newNode = new Node(value);

    if (length == 0) {
      head = newNode;
      tail = newNode;
    } else {
      tail.next = newNode;
      tail = newNode;
    }

    length ++;
  }

  public void prepend(int value) {
    Node newNode = new Node(value);
    if (length == 0) {
      head = newNode;
      tail = newNode;
    } else {
      newNode.next = head;
      head = newNode;
    }
    length++;
  }

  public Node removeFirst() {
    if (head == null) return null;
    Node temp = head;

    head = temp.next;
    temp.next = null;

    length--;
    if (length == 0) {
      tail = null;
    }
    return temp;
  }

  public Node removeLast() {
    Node prev = head;
    Node temp = head;

    if (length == 0) return null;

    while (temp.next != null) {
      prev = temp;
      temp = temp.next;
    }

    tail = prev;
    tail.next = null;
    length--;
    
    if (length == 0) {
      head = null;
      tail = null;
    }

    return temp;
  }

  public Node get(int index) {
    if (index < 0 || index >= length) return null;

    Node temp = head;
    for (int i = 0; i < index; i++) {
      temp = temp.next;
    }

    return temp;
  }

  public Boolean set(int index, int value) {
    Node temp = get(index);

    if (temp != null) {
      temp.value = value;
      return true;
    }

    return false;
  }

  public boolean insert(int index, int value) {
    Node newNode = new Node(value);
    Node temp = get(index - 1);

    if (index < 0 || index > length) return false;
    if (index == 0) {
      prepend(value);
      return true;
    }else if (index == length) {
      append(value);
      return true;
    }

    newNode.next = temp.next;
    temp.next = newNode;

    length++;

    return true;
  }

  public Node remove(int index) {
    if (index < 0 || index >= length) return null;

    if(index == 0) {
      return removeFirst();
    }
    if (index == length - 1) {
      return removeLast();
    }

    Node prev = get(index-1);
    Node temp = prev.next;

    prev.next = temp.next;
    temp.next = null;

    length --;
    return temp;
  }

  public void reverse() {
    Node temp = head;
    head = tail;
    tail = temp;

    Node before = null;
    Node after = temp.next;

    for (int i = 0; i < length; i++) {
      after = temp.next;
      temp.next = before;
      before = temp;
      temp = after;
    }
  }

  public Node findMiddleNode() {
    Node slow = head;
    Node fast = head;
    
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    return slow;
  }

  public boolean hasLoop() {
    Node slow = head;
    Node fast = head;

    while(fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;

      if (slow == fast) return true;
    }

    return false;
  }

  public void removeDuplicates() {
    Set<Integer> values = new HashSet<>();

    Node prev = null;
    Node curr = head;

    while (curr != null) {
      if (values.contains(curr.value)) {
        prev.next = curr.next;
        length--;
      } else {
        values.add(curr.value);
        prev = curr;
      }

      curr = curr.next;
    }
  }
}
