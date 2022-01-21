package Assignment7;

public interface QueueInterface <E> {
    boolean add(E e);
    boolean offer(E item);
    E remove();
    E poll();
    E peek();
    E element();
    int getSize();

}
