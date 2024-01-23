package binarysearchtree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinarySearchTree {
  Node root;

  class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
      this.value = value;
    }
  }

  public Node getRootNode() {
    return root;
  }

  public boolean insert(int value) {
    Node newNode = new Node(value);

    if (root == null) {
      root = newNode;
      return true;
    }

    Node temp = root;
    while (true) {
      if (newNode.value == temp.value) return false;
      if (newNode.value < temp.value) {
        if (temp.left == null) {
          temp.left = newNode;
          return true;
        } else {
          temp = temp.left;
        }
      } else {
        if (temp.right == null) {
          temp.right = newNode;
          return true;
        } else {
          temp = temp.right;
        }
      }
    }
  }

  public boolean contains(int value) {
    if (root == null) return false;

    Node temp = root;
    while (temp != null) {
      if (value == temp.value) return true;
      if (value < temp.value) {
        temp = temp.left;
      } else {
        temp = temp.right;
      }
    }

    return false;

  }

  private boolean rContains(Node currentNode, int value) {
    if (currentNode == null) return false;

    if (currentNode.value == value) return true;
    
    if (value > currentNode.value) currentNode = currentNode.right;
    else currentNode = currentNode.left;

    return rContains(currentNode, value);

  }

  public boolean rContains(int value) {
    return rContains(root, value);
  }

  private Node rInsert(Node currentNode, int value) {
    if (currentNode == null) {
      return new Node(value);
    }

    if (value < currentNode.value) {
      currentNode.left = rInsert(currentNode.left, value);
    } else {
      currentNode.right = rInsert(currentNode.right, value);
    }

    return currentNode;
  }

  public void rInsert(int value) {
    if (root == null) root = new Node(value);
    rInsert(root, value);
  }

  private int minValue(Node currNode) {
    while (currNode.left != null) {
      currNode = currNode.left;
    }
    return currNode.value;
  }

  private Node deleteNode(Node currNode, int value) {
    if (currNode == null) return null;

    if (value < currNode.value) {
      currNode.left = deleteNode(currNode.left, value);
    } else if (value > currNode.value) {
      currNode.right = deleteNode(currNode.right, value);
    } else {
      if (currNode.left == null && currNode.right == null) {
        return null;
      } else if (currNode.right == null) {
        currNode = currNode.left;
      } else if (currNode.left == null) {
        currNode = currNode.right;
      } else {
        int subTreeMin = minValue(currNode.right);
        currNode.value = subTreeMin;
        currNode.right = deleteNode(currNode.right, subTreeMin);
      }
    }

    return currNode;
  }

  public void deleteNode(int value) {
    deleteNode(root, value);
  }

  public List<Integer> BFS() {
    List<Integer> results = new ArrayList<>();
    Queue<Node> queue = new LinkedList<>();

    Node currentNode = root;
    queue.add(currentNode);

    while (!queue.isEmpty()) {
      currentNode = queue.remove();
      results.add(currentNode.value);
      
      if (currentNode.left != null) {
        queue.add(currentNode.left);
      }
      if (currentNode.right != null) {
        queue.add(currentNode.right);
      }
    }

    return results;
  }

  public List<Integer> DFSPreOrder() {
    List<Integer> results = new ArrayList<>();

    class Traverse {
      public Traverse(Node currentNode) {
        results.add(currentNode.value);
        if (currentNode.left != null) {
          new Traverse(currentNode.left);
        }
        if (currentNode.right != null) {
          new Traverse(currentNode.right);
        } 
      }
    }
    
    new Traverse(root);
    return results;
  }

  public List<Integer> DFSPostOrder() {
    List<Integer> results = new ArrayList<>();
    class Traverse {
      public Traverse(Node currentNode) {
        if (currentNode.left != null) {
          new Traverse(currentNode.left);
        }
        if (currentNode.right != null) {
          new Traverse(currentNode.right);
        }
        results.add(currentNode.value);
      }
    }

    new Traverse(root);
    return results;
  }

  public List<Integer> DFSInOrder() {
    List<Integer> results = new ArrayList<>();

    class Traverse {
      public Traverse(Node currentNode) {
        if (currentNode.left != null) {
          new Traverse(currentNode.left);
        }
        results.add(currentNode.value);
        if (currentNode.right != null) {
          new Traverse(currentNode.right);
        }
      }
    }

    new Traverse(root);
    return results;
  }
}
