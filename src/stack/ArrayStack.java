package stack;

public class ArrayStack {
    protected Object[] a;
    int top;
    int max;

    public ArrayStack() {
        this(50);
    }

    public ArrayStack(int max1) {
        this.max = max1;
        this.a = new Object[this.max];
        this.top = -1;
    }

    protected boolean grow() {
        int max1 = this.max + this.max / 2;
        Object[] a1 = new Object[max1];
        if (a1 == null) {
            return false;
        } else {
            for(int i = 0; i <= this.top; ++i) {
                a1[i] = this.a[i];
            }

            this.a = a1;
            return true;
        }
    }

    public boolean isEmpty() {
        return this.top == -1;
    }

    public boolean isFull() {
        return this.top == this.max - 1;
    }

    public void clear() {
        this.top = -1;
    }

    public void push(Object x) {
        if (!this.isFull() || this.grow()) {
            this.a[++this.top] = x;
        }
    }

    Object top() throws Exception {
        if (this.isEmpty()) {
            throw new Exception();
        } else {
            return this.a[this.top];
        }
    }

    public Object pop() throws Exception {
        if (this.isEmpty()) {
            throw new Exception();
        } else {
            Object x = this.a[this.top];
            --this.top;
            return x;
        }
    }
}
