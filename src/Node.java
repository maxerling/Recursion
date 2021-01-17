import java.util.ArrayList;

/**
 * Created by Max Erling
 * Date: 2021-01-04
 * Copyright: MIT
 * Class: Java20B
 */
public class Node {
    private String data;
    private ArrayList<Node> children;

    public Node(String data) {
        this.data = data;
        this.children = new ArrayList<>();
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public ArrayList<Node> next() {
        return this.children;
    }

    public void add(Node node) {
        this.children.add(node);
    }

    @Override
    public String toString() {
        return data;
    }

}
