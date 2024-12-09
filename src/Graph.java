import java.util.*;

class Graph {
    private Map<Integer, Set<Integer>> adjacencyList;

    public Graph() {
        adjacencyList = new HashMap<>();
    }

    // a. Метод addVertex(int vertex)
    public void addVertex(int vertex) {
        adjacencyList.putIfAbsent(vertex, new HashSet<>());
    }

    // b. Метод addEdge(int source, int destination)
    public void addEdge(int source, int destination) {
        adjacencyList.putIfAbsent(source, new HashSet<>());
        adjacencyList.putIfAbsent(destination, new HashSet<>());
        adjacencyList.get(source).add(destination);
        adjacencyList.get(destination).add(source); // Для неорієнтованого графу
    }

    // c. Метод removeVertex(int vertex)
    public void removeVertex(int vertex) {
        if (adjacencyList.containsKey(vertex)) {
            adjacencyList.get(vertex).forEach(neighbor -> adjacencyList.get(neighbor).remove(vertex));
            adjacencyList.remove(vertex);
        }
    }

    // d. Метод removeEdge(int source, int destination)
    public void removeEdge(int source, int destination) {
        if (adjacencyList.containsKey(source)) {
            adjacencyList.get(source).remove(destination);
        }
        if (adjacencyList.containsKey(destination)) {
            adjacencyList.get(destination).remove(source);
        }
    }

    // e. Метод hasVertex(int vertex)
    public boolean hasVertex(int vertex) {
        return adjacencyList.containsKey(vertex);
    }

    // f. Метод hasEdge(int source, int destination)
    public boolean hasEdge(int source, int destination) {
        return adjacencyList.containsKey(source) && adjacencyList.get(source).contains(destination);
    }

    // Друк графу
    public void printGraph() {
        for (var entry : adjacencyList.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
