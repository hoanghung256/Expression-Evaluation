package stack;

public class Node {
    public Object info;
    public Node next;

    public Node(Object x, Node p) {
        this.info = x;
        this.next = p;
    }

    public Node(Object x) {
        this(x, (Node)null);
    }
}
