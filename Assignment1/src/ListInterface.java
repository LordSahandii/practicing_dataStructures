public interface ListInterface<T> {
    public void add (T a) throws PushingError;

    public void add (int position, T a) throws PushingError;

    public void remove(int position) throws EmptyError;
    public T peek();

    public boolean contains(T data);

    public boolean isEmpty();

    public int size();

    public int getFrequencyOf(T data);

    public void clear();
}
