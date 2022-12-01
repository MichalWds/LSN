//package org.example;
//
////import com.sun.corba.se.impl.orbutil.graph.Graph;
//
//import java.util.*;
//
//public class Test2 {
//    public static void main(String[] args) {
//
//    Graph graph = new Graph();
//    graph.addEdge("1", "2");
//    graph.addEdge("2", "3");
//    graph.addEdge("5", "6");
//
//    graph.addVertex("1");
//    graph.addVertex("2");
//    graph.addVertex("3");
//    graph.addVertex("5");
//    graph.addVertex("6");
//
//        depthFirstTraversal(graph,"");
//
//    }
//
//    static Set<String> depthFirstTraversal(Graph graph, String root) {
//        Set<String> visited = new LinkedHashSet<String>();
//        Stack<String> stack = new Stack<String>();
//        stack.push(root);
//        while (!stack.isEmpty()) {
//            String vertex = stack.pop();
//            if (!visited.contains(vertex)) {
//                visited.add(vertex);
//                for (Vertex v : graph.getAdjVertices(vertex)) {
//                    stack.push(v.label);
//                }
//            }
//        }
//        return visited;
//    }
//}
//
//class Vertex {
//    String label;
//    Vertex(String label) {
//        this.label = label;
//    }
//
//    public String getLabel() {
//        return label;
//    }
//
//    public void setLabel(String label) {
//        this.label = label;
//    }
//
//    public Vertex (){
//
//    }
//
//
//    // equals and hashCode
//}
//
//class Graph {
//    private Map<Vertex, List<Vertex>> adjVertices = new HashMap<>();
//
//    List<Vertex> getAdjVertices(String label) {
//        return adjVertices.get(new Vertex(label));
//    }
//
//    void addVertex(String label) {
//        adjVertices.putIfAbsent(new Vertex(label), new ArrayList<>());
//    }
//
//    void removeVertex(String label) {
//        Vertex v = new Vertex(label);
//        adjVertices.values().stream().forEach(e -> e.remove(v));
//        adjVertices.remove(new Vertex(label));
//    }
//
//    void addEdge(String label1, String label2) {
//        Vertex v1 = new Vertex(label1);
//        Vertex v2 = new Vertex(label2);
//        adjVertices.get(v1).add(v2);
//        adjVertices.get(v2).add(v1);
//    }
//    // standard constructor, getters, setters
//
//
//
//    void removeEdge(String label1, String label2) {
//        Vertex v1 = new Vertex(label1);
//        Vertex v2 = new Vertex(label2);
//        List<Vertex> eV1 = adjVertices.get(v1);
//        List<Vertex> eV2 = adjVertices.get(v2);
//        if (eV1 != null)
//            eV1.remove(v2);
//        if (eV2 != null)
//            eV2.remove(v1);
//    }
//    public Graph () {
//
//    }
//
//    public Graph(Map<Vertex, List<Vertex>> adjVertices) {
//        this.adjVertices = adjVertices;
//    }
//
//    public Map<Vertex, List<Vertex>> getAdjVertices() {
//        return adjVertices;
//    }
//
//    public void setAdjVertices(Map<Vertex, List<Vertex>> adjVertices) {
//        this.adjVertices = adjVertices;
//    }
//}