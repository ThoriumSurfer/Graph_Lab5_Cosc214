package org.example;

/* Makail Casey Cosc 214.

So this program creates agraph and prints when each edge are connected and/or adjacent
to each other or not.
 */

public class Main {
    
    public static void main(String[] args) {
     
        Graph g = new Graph(5);
        
        //Adding edges to the object g of class Graph
        
        g.add_edges(0, 1);
        
        g.add_edges(1, 2);
        
        g.add_edges(2 , 3);
        
        g.add_edges(3, 4);
        
        //Prints adjacency matrix
        g.display_matrix();
        
        g.connectedness(0, 1);
        
        g.connectedness(2, 3);
        
        //Displays all vertices adjacent to node 0
        g.adjacent_nodes(0);
        
    }
}