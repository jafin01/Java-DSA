import packages.LinkedList.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {

        // initialised LL with value 1
        LinkedList LL = new LinkedList(1);

        LL.append(2);

        System.out.println(LL.getLastValue());
        LL.removeLast();
        System.out.println(LL.getLastValue());
        LL.removeLast();

        LL.append(3);
        LL.append(5);
        LL.append(9);

        // final list
        System.out.println("Final Linked List items: ");
        LL.printList();


        System.out.println("After prepending 1: ");
        //prepend 
        LL.prepend(1);
        LL.printList();

        System.out.println("After removing first element 1: ");
        LL.removeFirst();
        LL.printList();

        System.out.println("the Value at index 1 is: ");
        System.out.println(LL.get(1).value);

        System.out.println("The value at index 2 in the below linked list is to be changed: ");
        LL.printList();
        System.out.println("successfully updated - " + LL.set(2, 7));
        System.out.println("The new list after updating the value at index 2 to 7 is as follows:");
        LL.printList();

        System.out.println("inserting 1 at 0th index is successfull: " + LL.insert(0, 1));
        System.out.println("New list after insertion: ");
        LL.printList();
        
        System.out.println("removing the element at index 2: " + LL.remove(2));
        LL.printList();

        System.out.println("adding 9 to end of the list: ");
        LL.append(9);
        LL.printList();

        System.out.println("reversed array: ");
        LL.reverse();
        LL.printList();

        System.out.println("Middle Node " + LL.findMiddleNode().value);

        System.out.println("has Loop ?: " + LL.hasLoop());

        System.out.println("Adding 9 to index 2 and appending 3 to the list: ");
        LL.append(3);
        LL.insert(2, 9);
        LL.printList();

        System.out.println("Removing duplicates: ");
        LL.removeDuplicates();
        LL.printList();
    }
}
