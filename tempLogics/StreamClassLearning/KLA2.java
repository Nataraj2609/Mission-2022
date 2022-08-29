package StreamClassLearning;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class KLA2 {
  public static void main(String[] args) {
    System.out.println(connectedSum(10, Arrays.asList(1, 1, 2, 3, 7), Arrays.asList(2, 3, 4, 5, 8)));//8
  }

  public static int connectedSum(int graphNodes, List<Integer> graphFrom, List<Integer> graphTo) {
    List<String> edges = new ArrayList<>();
    int n = graphFrom.size();

    for (int i = 0; i < n; i++) {
        edges.add(graphFrom.get(i) + " " + graphTo.get(i));
    }
    return connectedSum2(graphNodes, edges);
  }

  private static int connectedSum2(int N, List<String> edges) {
    Map<Integer, Set<Integer>> graph = new HashMap<>();

    for (String edge : edges) {
      String[] parts = edge.trim().split(" ");
      Integer source = Integer.parseInt(parts[0]);
      Integer destination = Integer.parseInt(parts[1]);

      if (graph.containsKey(source)) {
        Set<Integer> children = graph.get(source);
        children.add(destination);
      } else {
        Set<Integer> children = new HashSet<>();
        children.add(destination);
        graph.put(source, children);
      }

      if (graph.containsKey(destination)) {
        Set<Integer> children = graph.get(destination);
        children.add(source);
      } else {
        Set<Integer> children = new HashSet<>();
        children.add(source);
        graph.put(destination, children);
      }
    }

    int connectedSum = 0;
    HashSet<Integer> visited = new HashSet<>();
    for (int node = 1; node <= N; node++) {
      Set<Integer> group = getGroup(node, graph, visited);
      if (group != null && group.size() > 0) {
        connectedSum += (int) (Math.ceil(Math.sqrt(group.size())));
      }
    }
    return connectedSum;
  }

  private static Set<Integer> getGroup(int node, Map<Integer, Set<Integer>> graph, Set<Integer> visited) {
    Set<Integer> group = new HashSet<>();
    if (visited.contains(node)) {
      return group;
    }
    Queue<Integer> nodesToVisit = new ArrayDeque<>();
    nodesToVisit.add(node);
    group.add(node);
    while (!nodesToVisit.isEmpty()) {
      Integer currentNode = nodesToVisit.remove();
      visited.add(currentNode);
      Set<Integer> children = graph.get(currentNode);
      if (children != null) {
        for (Integer child : children) {
          if (!visited.contains(child)) {
            group.add(child);
            nodesToVisit.add(child);
          }
        }
      }
    }
    return group;
  }
}