public class ArrayQueue<T> implements IQueue<T> {
    private Object[] data;
    private int front;
    private int rear;
    private int size;
    private static final int INITIAL = 8;

    public ArrayQueue() {
        data = new Object[INITIAL];
        front = 0;
        rear = 0;
        size = 0;
    }
    @Override
    public void offer(T element) {
        ensureCapacity();
        data[rear] = element;
        rear = (rear + 1) % data.length;
        size++;
    }
    @Override
    public void offerFront(T element) {
        ensureCapacity();
        front = (front - 1 + data.length) % data.length;
        data[front] = element;
        size++;
    }
    @SuppressWarnings("unchecked")
    @Override
    public T poll() {
        if (isEmpty()) return null;
        T res = (T) data[front];
        data[front] = null;
        front = (front + 1) % data.length;
        size--;
        return res;
    }
    @SuppressWarnings("unchecked")
    @Override
    public T peek() {
        if (isEmpty()) return null;
        return (T) data[front];
    }
    @Override
    public boolean isEmpty() {
        return size == 0;
    }
    @Override
    public int size() {
        return size;
    }
    @Override
    public void clear() {
        data = new Object[INITIAL];
        front = 0;
        rear = 0;
        size = 0;
    }
    private void ensureCapacity() {
        if (size < data.length) return;
        Object[] newArr = new Object[data.length * 2];
        for (int i = 0; i < size; i++) {
            newArr[i] = data[(front + i) % data.length];
        }
        data = newArr;
        front = 0;
        rear = size;
    }
    @Override
    public void print() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            Object o = data[(front + i) % data.length];
            sb.append(o);
            if (i < size - 1) sb.append(" -> ");
        }
        sb.append("]");
        System.out.println(sb.toString());
    }
}
