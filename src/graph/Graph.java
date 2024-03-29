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

  public boolean addEdge(String vertex1, String vertex2) {
    if (adjList.containsKey(vertex1) && adjList.containsKey(vertex2)) {
      adjList.get(vertex1).add(vertex2);
      adjList.get(vertex2).add(vertex1);
      return true;
    }

    return false;
  }

  public boolean removeEdge(String vertex1, String vertex2) {
    if (adjList.containsKey(vertex1) && adjList.containsKey(vertex2)) {
      adjList.get(vertex1).remove(vertex2);
      adjList.get(vertex2).remove(vertex1);
      return true;
    }

    return false;
  }

  public boolean removeVertex(String vertex) {
    if (adjList.containsKey(vertex)) {
      if (adjList.get(vertex).size() == 0) {
        adjList.remove(vertex);
        return true;
      } else {
        List<String> values = adjList.get(vertex);
        for (String val : values) {
          adjList.get(val).remove(vertex);
        }
        adjList.remove(vertex);
        return true;
      }
    }
    return false;
  }


}
