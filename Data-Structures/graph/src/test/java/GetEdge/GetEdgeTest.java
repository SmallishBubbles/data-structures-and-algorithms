package GetEdge;

import graph.Graph;
import graph.Vertex;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class GetEdgeTest {

    Graph<String> routeMap;

    @Before
    public void setRouteMap() {
        routeMap = new Graph<>();

        Vertex<String> pandora = routeMap.addVertex("Pandora");
        Vertex<String> arendelle = routeMap.addVertex("Arendelle");
        Vertex<String> metroville = routeMap.addVertex("Metroville");
        Vertex<String> monstroplolis = routeMap.addVertex("Monstropolis");
        Vertex<String> narnia = routeMap.addVertex("Narnia");
        Vertex<String> naboo = routeMap.addVertex("Naboo");

        routeMap.addEdge(pandora, arendelle, 150);
        routeMap.addEdge(pandora, metroville, 82);
        routeMap.addEdge(arendelle, monstroplolis, 42);
        routeMap.addEdge(arendelle, metroville, 99);
        routeMap.addEdge(metroville, monstroplolis, 105);
        routeMap.addEdge(monstroplolis, naboo, 73);
        routeMap.addEdge(metroville, narnia, 37);
        routeMap.addEdge(metroville, naboo, 26);
        routeMap.addEdge(narnia, naboo, 250);
    }

    @Test
    public void getEdge_simple() {
        String[] itinerary = new String[]{"Metroville", "Pandora"};

        assertArrayEquals("The return should include the correct trip cost",
                new String[]{"True", "$82"}, GetEdge.getEdge(routeMap, itinerary));
    }

    @Test
    public void getEdge_longer() {
        String[] itinerary = new String[]{"Arendelle", "Monstropolis", "Naboo"};

        assertArrayEquals("The method should work with multiple trip locations",
                new String[]{"True", "$115"}, GetEdge.getEdge(routeMap, itinerary));
    }

    @Test
    public void getEdge_failure() {
        String[] itinerary = new String[]{"Narnia", "Arendelle", "Naboo"};

        assertArrayEquals("The return should be false if the itinerary can not be completed with direct hops",
                new String[]{"False", "$0"}, GetEdge.getEdge(routeMap, itinerary));
    }
}