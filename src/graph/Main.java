package graph;

public class Main {
  public static void main(String[] args) {
    // initialising a new Graph
    Graph myGraph = new Graph();
    myGraph.addVertex("A");

    // Add vertex B and add and edge between A and B
    System.out.println(myGraph.addVertex("B"));
    System.out.println(myGraph.addEdge("A", "B"));

    // Remove the edges b/w A and B
    System.out.println(myGraph.removeEdge("A", "B"));

    // Add vertex C and Add Edges between A and B, B and C, and A and C
    System.out.println(myGraph.addVertex("C"));
    System.out.println(myGraph.addEdge("A", "B"));
    System.out.println(myGraph.addEdge("A", "C"));
    System.out.println(myGraph.addEdge("B", "C"));


    // removing edges between A and C
    System.out.println(myGraph.removeEdge("A", "B"));

    // remove edges between A and C
    System.out.println(myGraph.removeEdge("A", "C"));

    // remove vertex A
    System.out.println(myGraph.removeVertex("A"));

    // add vertex A and D to get verices A, B, C and D
    myGraph.addVertex("A");
    myGraph.addVertex("B");
    myGraph.addVertex("C");
    myGraph.addVertex("D");

    // remove edge between B and C
    myGraph.removeEdge("B", "C");

    // add edges between A and B, A and C, C and D, B and D, and A and D
    myGraph.addEdge("A", "B");
    myGraph.addEdge("A", "C");
    myGraph.addEdge("B", "D");
    myGraph.addEdge("C", "D");
    myGraph.addEdge("A", "D");


    // now removing the vertex D which is having edges to B, C and A  
    myGraph.removeVertex("D");

    myGraph.printGraph();
  }
}
