package com.chathu.doc.model;

public class Tree
{
    Node root;

    public Tree()
    {
        root = null;
    }

    public void printNodes(Node node)
        {
        if (node == null)
        return;

        // first recur on left subtree 
            printNodes(node.left);

        // then recur on right subtree 
            printNodes(node.right);

        // now deal with the node 
        System.out.print(node.key + " ");
        }
    public void printNodes()  {
        printNodes(root);
    }

}