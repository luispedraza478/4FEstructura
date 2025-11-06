public class SinglyLinkedList<T> {
    private static class Node<E> {
        E value;
        Node<E> next;
        Node(E v) { value = v; next = null; }
    }
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public SinglyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }
    public void addLast(T val) {
        Node<T> node = new Node<>(val);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }
    public T removeLast() {
        if (head == null) return null;
        if (head == tail) {
            T val = head.value;
            head = null;
            tail = null;
            size = 0;
            return val;
        }
        Node<T> cur = head;
        while (cur.next != tail) {
            cur = cur.next;
        }
        T val = tail.value;
        tail = cur;
        tail.next = null;
        size--;
        return val;
    }
    public Object[] removeLastMultiple(int m) {
        if (m <= 0) return new Object[0];
        int toRemove = Math.min(m, size);
        Object[] removed = new Object[toRemove];
        for (int i = 0; i < toRemove; i++) {
            removed[i] = removeLast();
        }
        return removed;
    }
    public int size() {
        return size;
    }
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }
    public void printList() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node<T> cur = head;
        while (cur != null) {
            sb.append(cur.value);
            if (cur.next != null) sb.append(" -> ");
            cur = cur.next;
        }
        sb.append("]");
        System.out.println(sb.toString());
    }
}
