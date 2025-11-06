public interface IQueue<T> {
    void offer(T element);        
    void offerFront(T element);   
    T poll();                     
    T peek();                     
    boolean isEmpty();
    int size();
    void clear();
    void print();
}
