public class Main {
     public static void main(String[] args) {
Graph graph= new Graph();
// create vertex
         graph.addVertex(1);
         graph.addVertex(2);
         graph.addVertex(3);
         graph.addVertex(4);
// create edges
         graph.addEdge(1, 2);
         graph.addEdge(2, 3);
         graph.addEdge(3, 4);
         graph.addEdge(4, 1);
System.out.println("Graph after adding vertexes and edges");
graph.printGraph();
// checking if vertexes and edges exist
System.out.println("Does vertex 3 exist ?" + graph.hasVertex(3));
System.out.println("Does edge 1-3 exist ?" + graph.hasEdge(1, 3));
//deleting the edge
graph.removeEdge(1, 2);
System.out.println("Graph after deletion of edge 1-2");
graph.printGraph();
//deleting the vertex
graph.removeVertex(4);
System.out.println("Graph after deletion of vertex 4");
graph.printGraph();

     }
 }