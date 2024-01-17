package stack;

public class Stack {
  private Node top;
  private int height;

  public class Node {
    int value;
    Node next;

    Node (int value) {
      this.value = value;
    }
  }
  
  public Stack (int value) {
    Node newNode = new Node(value);
    top = newNode;
    height++;
  }

  public void printStack() {
    if (top == null) {
      System.out.println("Stack is empty");
      return;
    }

    Node temp = top;

    while (temp != null) {
      System.out.println(temp.value + " -> ");
      temp = temp.next;
    }
  }

  public void getTop() {
    System.out.println("Top = " + top.value);
  }

  public void getHeight() {
    System.out.println("Height of the stack = " + height);
  }

  public void push(int value) {
    Node newNode = new Node(value);

    if (top == null) {
      top = newNode;
    }else {
      newNode.next = top;
      top = newNode;
    }

    height++;
  }

  public void pop() {
    if (top == null) return;

    if (height == 1) top = null;
    else {
      Node temp = top;
      top = top.next;
      temp.next = null;
    }

    height--;
  }
}
