package doublylinkedlist;

public class Main {
  public static void main(String[] args) {
    // initialise a doubly linked list;
    DoublyLinkedList DLL = new DoublyLinkedList(1);

    DLL.printList();
    DLL.getHead();
    DLL.getTail();
    DLL.getLength();

    // append 2 to DLL
    DLL.append(2);
    System.out.println("DLL ->");
    DLL.printList();
    DLL.getLength();

    // remove last element 2
    System.out.println("Last Element of the list removed: " + DLL.removeLast().value);
    DLL.printList();
    DLL.getLength();

    // check for edge condition
    // removing last element when length is 1
    System.out.println("Last Element of the list removed: " + DLL.removeLast().value);
    DLL.printList();
    DLL.getLength();

    // check for edge condition
    // Trying to remove last element when length is 0
    System.out.println("Last Element of the list removed: " + DLL.removeLast());
    DLL.getLength();

    // prepend 2 to the list
    System.out.println("List after prepending 2");
    DLL.prepend(2);
    DLL.printList();

    // prepending 1 to the list
    System.out.println("List after prepending 1");
    DLL.prepend(1);
    DLL.printList();

    // removing the first element from the list
    System.out.println("First Element of the list removed: " + DLL.removeFirst().value);
    DLL.printList();

    // Edge case 
    // Removing the first element when the length of the list is 1
    System.out.println("First Element of the list removed: " + DLL.removeFirst().value);
    DLL.printList();
    DLL.getLength();

    // Edge case
    // Try to remove when list is empty
    System.out.println("First Element of the list removed: " + DLL.removeFirst());

    // Appending values 0, 1, 2, and 3
    DLL.append(0);
    DLL.append(1);
    DLL.append(2);
    DLL.append(3);
    DLL.append(4);
    System.out.println("The new List");
    DLL.printList();

    // Get tail of List
    DLL.getTail();

    // Get value at index 1
    System.out.println("Value at index 1: " + DLL.get(1).value);
    // Get value at index 2
    System.out.println("Value at index 3: " + DLL.get(3).value);

    // Set value 4 at index 3
    System.out.println("Value set successfull: " + DLL.set(3, 4));
    DLL.printList();

    // Insert value 3 at index 3
    System.out.println("Value inserted at index 3: " + DLL.insert(3, 3));
    DLL.printList();

    // Removing the last element
    System.out.println("Last element of the list removed: " + DLL.removeLast().value);
    DLL.printList();
    DLL.getLength();

    // Set value 4 at index 1
    System.out.println("value set successful: " + DLL.set(1, 4));
    DLL.printList();

    // Remove the element at index 1
    System.out.println("Value removed from index 1: " + DLL.remove(1));
    DLL.printList();

    // Insert 1 at index 1
    System.out.println("Value inserted at index 1: " + DLL.insert(1, 1));
    DLL.printList();

    System.out.println("Swapping the first and last element of the list");
    DLL.swapFirstAndLast();
    DLL.printList();

    System.out.println("Swapping back");
    DLL.swapFirstAndLast();
    DLL.printList();

    // Check if the DLL is palindrome or not.
    System.out.println("The DLL is a palindrome: " + DLL.isPalindrome());

    // Remove all items and append 1,2,1,2,1
    DLL.removeFirst();
    DLL.removeFirst();
    DLL.removeFirst();
    DLL.removeFirst();
    DLL.removeFirst();
    DLL.append(1);
    DLL.append(2);
    DLL.append(1);
    DLL.append(2);
    DLL.append(1);
    DLL.printList();
    System.out.println("The DLL is a palindrome: " + DLL.isPalindrome());
    
  }
}
