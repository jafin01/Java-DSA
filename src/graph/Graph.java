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



}
