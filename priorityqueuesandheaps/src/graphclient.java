public class graphclient
{
    public static void main(String[] args)
    {
     adjacencyMapGraph<Character> graph = new adjacencyMapGraph<>();
        graph.addVertex('a');
        graph.addVertex('b');
        graph.addVertex('c');
        graph.addVertex('d');
        graph.addVertex('e');
        graph.addVertex('f');
        graph.addEdge('a','b',1);
        graph.addEdge('e','f',1);
        graph.addEdge('d','e',2);
        graph.addEdge('c','d',3);
        graph.addEdge('c','b',4);
        graph.addEdge('d','f',4);
        graph.addEdge('b','e',5);
        graph.addEdge('b','d',9);
        System.out.println(graph.kruskal());
        System.out.println(graph.prims());
    }
}
