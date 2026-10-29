package org.example;

public class Graph {
    
    private int vertices;
    
    private int [][] adjacency_mat;
    
    //This constructor creates a graph with vertices
    Graph (int vertices) {
        
        this.vertices = vertices;
        
        this.adjacency_mat = new int[vertices][vertices];
        
    }
    
    public void add_edges(int from, int to) {
        
        this.adjacency_mat[from][to] = 1;
        
        this.adjacency_mat[to][from] = 1;
    }
    
    //Prints the adjacency matrix for each row
    public void display_matrix(){
        //Iterates through each row in the matrix
        for(int i = 0; i < adjacency_mat.length; i++) {
            //Iterates through each column in the matrix
            for(int j = 0; j < adjacency_mat[i].length; j++) {
                
                System.out.print(adjacency_mat[i][j] + " ");
                
            }
            
            System.out.println();
            
        }
    
    }
    
    //Checks when two vertices have edges between them
    public void connectedness(int from, int to) {
        //If the matrix entry = 1 the method prints that they are connected.
        //If it is not 1 then it will print that they aren't connected
        if (adjacency_mat[from][to] == 1) {
            
            System.out.println("\n" + from + " and " + to + " are connected.");
            
        } else {
            
            System.out.println("\n" + from + " and " + to + " are not connected.");
            
        }
    
    }
    
    //Displays all vertices directly connected to the vertices inputted
    public void adjacent_nodes(int vertex) {
        
        System.out.print("\nHere are the adjacent nodes of " + vertex + ": ");
        
        //Iterates through every entry in the specified vertex's row of the adjacency matrix.
        for (int i = 0; i < adjacency_mat[vertex].length; i++) {
            
            if (adjacency_mat[vertex][i] == 1) {
                
                System.out.print(i + " ");
                
            }
            
        }
        
        System.out.println();
    
    }
}
