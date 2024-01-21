package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
  private Map<String, ArrayList<String>> adjList = new HashMap<>();

  public void printGraph() {
    System.out.println("Graph" + adjList);
  }

  public boolean addVertex(String vertex) {
    if (!adjList.containsKey(vertex)) {
      adjList.put(vertex, new ArrayList<>());
      return true;
    }
    return false;
  }

}
