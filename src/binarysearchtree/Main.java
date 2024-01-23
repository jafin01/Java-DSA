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

    // insert a value to bst recursively
    bst.rInsert(10);
    System.out.println(bst.rContains(10));

    // initialise an empty binary search tree
    BinarySearchTree rBST = new BinarySearchTree();
    rBST.insert(2);
    rBST.insert(1);
    rBST.insert(3);

    /*

        2
       / \
      1   3

     */

    System.out.println("\nRoot: " + rBST.getRootNode().value);
    System.out.println("Root->Left: " + rBST.getRootNode().left.value);
    System.out.println("Root->Right: " + rBST.getRootNode().right.value);

    rBST.deleteNode(2);

    System.out.println("\nRoot: " + rBST.getRootNode().value);
    System.out.println("Root->Left: " + rBST.getRootNode().left.value);
    System.out.println("Root->Right: " + rBST.getRootNode().right);

    // BST BFS
    BinarySearchTree BSTTraversal = new BinarySearchTree();

    BSTTraversal.insert(47);
    BSTTraversal.insert(21);
    BSTTraversal.insert(76);
    BSTTraversal.insert(18);
    BSTTraversal.insert(27);
    BSTTraversal.insert(52);
    BSTTraversal.insert(82);

    System.out.println(BSTTraversal.getRootNode().value);
    System.out.println(BSTTraversal.BFS());


    System.out.println(BSTTraversal.DFSPreOrder());
  }

}
