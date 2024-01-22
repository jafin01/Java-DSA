package binarysearchtree;

import binarysearchtree.BinarySearchTree.Node;

public class Main {
  public static void main(String[] args) {
    BinarySearchTree bst = new BinarySearchTree();

    bst.insert(47);
    bst.insert(21);
    bst.insert(76);
    bst.insert(18);
    bst.insert(52);
    bst.insert(82);
    bst.insert(27);

    Node rootNode =bst.getRootNode();

    System.out.println(rootNode.left.right.value);
    System.out.println(bst.contains(27));
    System.out.println(bst.contains(17));

    // check if BST contains a value recursively
    System.out.println(bst.rContains(52));


  }

}
