/*
 * Assignment #6 - RandomQuadTree
 * CIS2168 - Nick Robinson
 * QNode.java - Structure for the nodes for the QuadTree
 */

package randomquadtree;

import qtvisualizer.QuadTreeNode;


public class QNode implements QuadTreeNode {
    double value;
    QNode[] children;
    
    public QNode() {
        children = new QNode[4];
    }

        
    public QNode(double v) {
        value = v;
        children = new QNode[4];
    }

    @Override
    public QuadTreeNode[] getChildren() {
        return children;
    }
    
    public double getValue() {
        return value;
    }
    
}
