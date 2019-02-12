package uk.sky.java.stack;

import java.util.Stack;
import java.util.function.Consumer;

public class BFS {

    public void dfs(Tree tree, Consumer<Node> nodeConsumer) {
        Stack<Node> nodes = new Stack<>();

        nodes.push(tree.getRoot());

        while (!nodes.empty()) {
            nodeConsumer.accept(nodes.peek());
            Node top = nodes.pop();
            nodes.push(top.getLeft());
            nodes.push(top.getRight());
        }
    }
}
