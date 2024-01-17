package doublylinkedlist;


public class DoublyLinkedList {
  Node head;
  Node tail;
  int length = 0;

  class Node {
    int value;
    Node next;
    Node prev;

    Node(int value) {
      this.value = value;
    }
  }

  public DoublyLinkedList(int value) {
    Node newNode = new Node(value);
    this.head = newNode;
    this.tail = newNode;
    length++;
  }

  public void printList() {
    if (head == null) System.out.println("The List is empty");

    Node temp = head;
    while (temp != null) {
      System.out.println("<- " + temp.value + " ->");
      temp = temp.next;
    }
  }

  public void getHead() {
    if (head == null) System.out.println("The list is empty");
    System.out.println("head -> " + head.value);
  }

  public void getTail() {
    if (head == null) System.out.println("the List is empty");
    System.out.println("tail -> " + tail.value);
  }

  public void getLength() {
    System.out.println("Length = " + length);
  }

  public void append(int value) {
    Node newNode = new Node(value);

    if (head == null) {
      head = newNode;
      tail = newNode;
    }
    tail.next = newNode;
    newNode.prev = tail;
    tail = newNode;
    length++;
  }

  public Node removeLast() {
    if (head == null) {
      System.out.println("The List is Empty");
      return null;
    }
    Node temp = tail;

    if (head == tail) {
      head = null;
      tail = null;
    } else {
      tail = tail.prev;
      tail.next = null;
      temp.prev = null;  
    }

    length--;
    return temp;

  }

  public void prepend(int value) {
    Node newNode = new Node(value);
    if (head == null) {
      head = newNode;
      tail = newNode;
    } else {
      newNode.next = head;
      head.prev = newNode;
      head = newNode;
    }

    length++;
  }

  public Node removeFirst() {
    if (head == null) {
      System.out.println("The list is empty");
      return null;
    }

    Node temp = head;
    if (head == tail) {
      head = null;
      tail = null;
    } else {
      head = head.next;
      head.prev = null;
      temp.next = null;
    }

    length--;
    return temp;
  }

  public Node get(int index) {
    if (index < 0 || index >= length) {
      System.out.println("Index out of boundary");
      return null;
    }

    Node temp = head;
    if (index < length/2) {
      for (int i = 0; i < index; i++) {
        temp = temp.next;
      }

      return temp;
    } else {
      temp = tail;
      for (int i = length - 1 ; i > index; i--) {
        temp = temp.prev;
      }

      return temp; 
    }
  }

  public boolean set(int index, int value) {
    Node temp = get(index);
    
    if (temp == null) return false;

    temp.value = value;
    return true;
  }

  public boolean insert(int index, int value) {
    if (index < 0 || index > length) return false;

    Node newNode = new Node(value);

    if (index == 0) {
      prepend(value);
    } else if (index == length) {
      append(value);
    } else {
      Node temp = get(index);
  
      newNode.prev = temp.prev;
      newNode.next = temp;
      temp.prev.next = newNode;
      temp.prev = newNode;
      length++;
    }


    return true;
  }

  public Node remove(int index) {
    Node temp = get(index);
    
    if (temp == null) return null;
    if (index == 0) return removeFirst();
    if (index == length - 1) return removeLast();
    
    Node prev = temp.prev;
    prev.next = temp.next;
    temp.next.prev = prev;
    temp.next = null;
    temp.prev = null;

    length--;
    return temp;
  }

  public void swapFirstAndLast() {
    if (length < 2) return;

    int temp = head.value;
    head.value = tail.value;
    tail.value = temp;

    // remember not to assign the head to the temp variable
    // while assigning the head to tail, when the value of head is changed, 
    // temp.value will be the same value of the tail.
    // Therefore use the temp variable to store the value of the head.
  }

  public boolean isPalindrome() {
    if (length <= 1) return true;

    Node tempHead = head;
    Node tempTail = tail;

    for (int i = 0; i < length/2; i++) {
      if (tempHead.value != tempTail.value) return false;
      tempHead = tempHead.next;
      tempTail = tempTail.prev;
    }

    return true;
  }
}
