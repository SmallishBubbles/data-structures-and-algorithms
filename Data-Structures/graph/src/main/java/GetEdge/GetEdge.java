package GetEdge;

import graph.Edge;
import graph.Graph;
import graph.Vertex;

import java.util.List;

public class GetEdge {

    public static String[] getEdge(Graph<String> routeMap, String[] itinerary) {
        Vertex<String> current = findVertex(routeMap, itinerary[0]);
        int cost = 0;

        for ( int i = 1; i < itinerary.length; i++ ){
            Edge<String> nextLocationDirect = findEdge(routeMap.getNeighbors(current), itinerary[i]);

            if ( nextLocationDirect != null ) {
                cost += nextLocationDirect.getWeight();
                current = nextLocationDirect.getVertex();
            } else {
                return new String[]{"False", "$0"};
            }
        }

        return new String[]{"True", "$" + cost};
    }

    public static Vertex<String> findVertex(Graph<String> graph, String value) {
        List<Vertex<String>> allVertices = graph.getVertices();

        for ( Vertex<String> vertex : allVertices ) {
            if ( vertex.getValue().equals(value) ) {
                return vertex;
            }
        }
        return null;
    }

    public static Edge<String> findEdge(List<Edge<String>> neighbors, String value) {

        for ( Edge<String> edge : neighbors ) {
            if ( edge.getVertex().getValue().equals(value) ) {
                return edge;
            }
        }
        return null;
    }
}
