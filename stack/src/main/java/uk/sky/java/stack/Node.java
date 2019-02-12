package uk.sky.java.stack;

public class Node {
    private String el;
    private Node left;
    private Node right;

    public Node(String el, Node right, Node left){
        this.el = el;
        this.right = right;
        this.left = left;
    }

    public Node(String el){
        this.el = el;
        this.right = null;
        this.left = null;
    }

    public String getEl() {
        return el;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

}
