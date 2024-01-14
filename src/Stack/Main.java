package Stack;

public class Main {
  public static void main(String[] args) {
    // initialising a new Stack with value 5
    Stack myStack = new Stack(5);
    myStack.printStack();

    // adding a new value to the stack
    System.out.println("Adding value 3 and 4 to the Stack");
    myStack.push(4);
    myStack.push(3);
    myStack.printStack();

    // removing an element from the stack
    System.out.println("Removing the top element from the list: " + myStack.pop().value);
    
    myStack.printStack();

    System.out.println("Removing the top element from the list: " + myStack.pop().value);
    myStack.printStack();

    System.out.println("Removing the top element from the list: " + myStack.pop().value);
    myStack.printStack();
  }
}
