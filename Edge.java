/** Ori Paso : 209493683
 * Yonatan Hammer : 206844409 */


package test;

public class Edge {
    public boolean isPartOfMSTEdge;
    int destination;
    int source;
    int weight;

    Edge(int dst, int src, int weight){

        isPartOfMSTEdge = false;
        this.destination = dst;
        this.source = src;
        this.weight =weight;
    }

}
