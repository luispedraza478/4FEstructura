
public class ArrayStack<T> {
    private Object[] data;
    private int top; 
    private static final int INIT = 8;

    public ArrayStack() {
        data = new Object[INIT];
        top = 0;
    }
    public void push(T element) {
        if (top == data.length) {
            Object[] na = new Object[data.length * 2];
            System.arraycopy(data, 0, na, 0, data.length);
            data = na;
        }
        data[top++] = element;
    }
    @SuppressWarnings("unchecked")
    public T pop() {
        if (isEmpty()) return null;
        top--;
        T res = (T) data[top];
        data[top] = null;
        return res;
    }
    @SuppressWarnings("unchecked")
    public T peek() {
        if (isEmpty()) return null;
        return (T) data[top - 1];
    }
    public boolean isEmpty() {
        return top == 0;
    }
    public int size() {
        return top;
    }
    public void print() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < top; i++) {
            sb.append(data[i]);
            if (i < top - 1) sb.append(" -> ");
        }
        sb.append("]");
        System.out.println(sb.toString());
    }
    public void clear() {
        for (int i = 0; i < top; i++) data[i] = null;
        top = 0;
    }
}
