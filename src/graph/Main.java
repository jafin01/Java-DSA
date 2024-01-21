package graph;

public class Main {
  public static void main(String[] args) {
    // initialising a new Graph
    Graph myGraph = new Graph();
    myGraph.addVertex("A");

    // Add vertex B and add and edge between A and B
    System.out.println(myGraph.addVertex("B"));
    System.out.println(myGraph.addEdge("A", "B"));

  }
}
