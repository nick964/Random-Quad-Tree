/*
 * Assignment #6 - RandomQuadTree
 * CIS2168 - Nick Robinson
 * Main.java - This is a main that will run the program
 */


package randomquadtree;

import qtvisualizer.QuadTreeViz;


public class Main {
   
    public static void main(String args[])
    {
        int size = 100;
        QuadTree qt = new QuadTree();
        
        for(int i = 0; i <= size; i++) {
            qt.insertAtRandomPosition(i);
            
        }
        
        QuadTreeViz vizzer = new QuadTreeViz(qt.root);
        qt.sum(qt.root, 0);
        System.out.println("Sum is " + qt.sum);
      
        
    }
   
}
