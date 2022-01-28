public interface QueueInterface<T> {

    public void insert (T a) throws PushingError;

    public T remove() throws EmptyError;
    public T peek();

    public boolean contains(T data);

    public boolean isEmpty();

    public int size();

    public int getFrequencyOf(T data);

    public void clear();
}
