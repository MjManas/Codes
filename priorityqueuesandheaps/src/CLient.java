public class CLient
{
    public static void main(String[] args) {
        AdjacencyListGraph<String> graph = new AdjacencyListGraph<>();
//        graph.addVertex("delhi");

//        graph.addVertex("meerut");
//        graph.addVertex("mumbai");
//        graph.addVertex("goa");
//        graph.addEdge("goa", "meerut");
//        graph.addEdge("goa", "delhi");
//        graph.addEdge("goa", "mumbai");
//        graph.addEdge("delhi", "meerut");
//        graph.display();
//        graph.DFT("goa");
        graph.addVertex("a");
        graph.addVertex("b");
        graph.addVertex("c");
        graph.addVertex("d");
        graph.addVertex("e");
        graph.addVertex("f");
        graph.addEdge("a","c");
        graph.addEdge("b","c");
        graph.addEdge("d","f");
        graph.addEdge("d","e");
        graph.DFS("a","c");
        graph.connectedComponents();
        graph.DFT("a");

 graph.bipart();

    }
}
