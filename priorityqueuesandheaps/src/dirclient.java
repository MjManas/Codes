public class dirclient
{
    public static void main(String[] args) {
        adjacencyMapdirGraph<Character> graph = new adjacencyMapdirGraph<>();
        graph.addVertex('a');
        graph.addVertex('b');
        graph.addVertex('c');
        graph.addVertex('d');
        graph.addVertex('e');
        graph.addVertex('f');
        graph.addEdge('f','a',1);
        graph.addEdge('a','b',1);
        graph.addEdge('a','d',1);
        graph.addEdge('b','c',1);
        graph.addEdge('b','d',1);
        graph.addEdge('d','e',1);
        graph.addEdge('a','e',1);
        System.out.println(graph.topological());
    }
}
