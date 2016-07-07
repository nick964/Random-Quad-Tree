/*
 * Assignment #6 - RandomQuadTree
 * CIS2168 - Nick Robinson
 * QuadTree.java - Structure for the tree and contains the methods that will sum
 * up all values and insert the nodes at random positions.
 */


package randomquadtree;

import java.util.Random;


public class QuadTree {
    QNode root;
    double total;
    double sum;
    
    public QuadTree() {
        root = null;
    }
    
    public void insertAtRandomPosition(double v) {
        QNode n = new QNode(v);
        Random rand = new Random();

        if (root == null) {
            root = n;
        } else {
            QNode current = root;
            while (true) {
                int randomNum = rand.nextInt((3 - 0) + 1) + 0;

                if (current.children[randomNum] == null) {
                    current.children[randomNum] = n;
                    break;
                } else {
                    current = current.children[randomNum];
                }
            }
        }
    }

    public void sum(QNode qn, double v) {
        sum = v;
        if (qn == null) {
            return;
        } else {
            sum = sum + qn.getValue();
            total = total + sum;
            sum(qn.children[0], sum);
            sum(qn.children[1], sum);
            sum(qn.children[2], sum);
            sum(qn.children[3], sum);
        }
        return;
    }

}
