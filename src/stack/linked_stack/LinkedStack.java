package stack.linked_stack;

public class LinkedStack {
    protected Node head = null;

    public LinkedStack() {
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public void push(Object x) {
        this.head = new Node(x, this.head);
    }

    Object top() throws Exception {
        if (this.isEmpty()) {
            throw new Exception();
        } else {
            return this.head.info;
        }
    }

    public Object pop() throws Exception {
        if (this.isEmpty()) {
            throw new Exception();
        } else {
            Object x = this.head.info;
            this.head = this.head.next;
            return x;
        }
    }
}
